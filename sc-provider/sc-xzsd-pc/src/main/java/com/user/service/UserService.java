package com.user.service;

import com.user.dao.UserDao;
import com.user.entity.UserInfo;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.util.AppResponse;
import com.util.PasswordUtils;
import com.util.StringUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import javax.annotation.Resource;
import java.util.Arrays;
import java.util.List;

/**
 * @DescriptionDemo 实现类
 * @Author dingning
 * @Date 2020-03-21
 */
@Service

public class UserService {
    @Autowired
    @Resource
    private UserDao userDao;

    /**
     * demo 新增用户
     * @param userInfo
     * @return
     * @Author dingning
     * @Date 2020-03-21
     */
    @Transactional(rollbackFor = Exception.class)
    public AppResponse saveUser(UserInfo userInfo) {
        // 校验账号是否存在
        int countUserAcct = userDao.countUserAcct(userInfo);
        if(0 != countUserAcct) {
            return AppResponse.bizError("用户账号已存在，请重新输入！");
        }
        userInfo.setUserId(StringUtil.getCommonCode(2));
        String pwd = PasswordUtils.generatePassword(userInfo.getUserPassword());
        userInfo.setIsDeleted(0);
        userInfo.setUserPassword(pwd);
        // 新增用户
        int count = userDao.saveUser(userInfo);
        if(0 == count) {
            return AppResponse.bizError("新增失败，请重试！");
        }
        return AppResponse.success("新增成功！");
    }

    /**
     * demo 查询用户列表（分页）
     * @param userInfo
     * @return
     * @Author dingning
     * @Date 2020-03-21
     */
    public AppResponse listUsers(UserInfo userInfo) {
        PageHelper.startPage(userInfo.getPageNum(), userInfo.getPageSize());
        List<UserInfo> userInfoList = userDao.listUsersByPage(userInfo);
        // 包装Page对象
        PageInfo<UserInfo> pageData = new PageInfo<UserInfo>(userInfoList);
        return AppResponse.success("查询成功！",pageData);
    }

    /**
     * demo 删除用户
     * @param userId
     * @param userId
     * @return
     * @Author dingning
     * @Date 2020-03-21
     */
    @Transactional(rollbackFor = Exception.class)
    public AppResponse deleteUser(String userId,String userId1) {
        List<String> listCode = Arrays.asList(userId.split(","));
        AppResponse appResponse = AppResponse.success("删除成功！");
        // 删除用户
        int count = userDao.deleteUser(listCode,userId1);
        if(0 == count) {
            appResponse = AppResponse.bizError("删除失败，请重试！");
        }
        return appResponse;
    }

    /**
     * demo 修改用户
     * @param userInfo
     * @return
     * @Author dingning
     * @Date 2020-03-21
     */
    @Transactional(rollbackFor = Exception.class)
    public AppResponse updateUser(UserInfo userInfo) {
        AppResponse appResponse = AppResponse.success("修改成功");
        // 校验账号是否存在
        int countUserAcct = userDao.countUserAcct(userInfo);
        if(0 != countUserAcct) {
            return AppResponse.bizError("用户账号已存在，请重新输入！");
        }
        // 修改用户信息
        int count = userDao.updateUser(userInfo);
        if (0 == count) {
            appResponse = AppResponse.versionError("数据有变化，请刷新！");
            return appResponse;
        }
        return appResponse;
    }


    /**
     * demo 查询用户详情
     * @param userId
     * @Author dingning
     * @Date 2020-03-21
     */
    public AppResponse getUserByUserCode(String userId) {
        UserInfo userInfo = userDao.getUserByUserCode(userId);
        return AppResponse.success("查询成功！",userInfo);
    }
}


