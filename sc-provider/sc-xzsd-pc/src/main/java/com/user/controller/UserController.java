package com.user.controller;


import com.user.entity.UserInfo;
import com.user.service.UserService;
import com.util.AppResponse;
import com.util.AuthUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;


/**
 * @Description增删改查DEMO
 * @Author dingning
 * @Date 2020-03-21
 */
@RestController
@RequestMapping("/user")
public class UserController {

    private static final Logger logger = LoggerFactory.getLogger(UserController.class);

    @Resource
    private UserService userService;

    /**
     * demo 新增用户
     * @param userInfo
     * @return AppResponse
     * @author dingning
     * @Date 2020-03-21
     */
    @PostMapping("addUser")
    public AppResponse saveUser(UserInfo userInfo) {
        try {
            //获取用户id
            String userCode = AuthUtils.getCurrentUserId();
            userInfo.setCreateBy(userCode);
            AppResponse appResponse = userService.saveUser(userInfo);
            return appResponse;
        } catch (Exception e) {
            logger.error("用户新增失败", e);
            System.out.println(e.toString());
            throw e;
        }
    }


    /**
     * demo 用户列表(分页)
     * @param userInfo
     * @return AppResponse
     * @author dingning
     * @Date 2020-03-21
     */
    @RequestMapping(value = "listUsers")
    public AppResponse listUsers(UserInfo userInfo) {
        try {
            return userService.listUsers(userInfo);
        } catch (Exception e) {
            logger.error("查询用户列表异常", e);
            System.out.println(e.toString());
            throw e;
        }
    }

    /**
     * demo 删除用户
     * @param userId
     * @return AppResponse
     * @author dingning
     * @Date 2020-03-21
     */
    @PostMapping("deleteUser")
    public AppResponse deleteUser(String userId) {
        try {
            //获取用户id
            String userCode = AuthUtils.getCurrentUserId();
            return userService.deleteUser(userId,userCode);
        } catch (Exception e) {
            logger.error("用户删除错误", e);
            System.out.println(e.toString());
            throw e;
        }
    }

    /**
     * demo 修改用户
     * @param userInfo
     * @return AppResponse
     * @author dingning
     * @Date 2020-03-21
     */
    @PostMapping("updateUser")
    public AppResponse updateUser(UserInfo userInfo) {
        try {
            //获取用户id
            String userCode = AuthUtils.getCurrentUserId();
            userInfo.setCreateBy(userCode);
            userInfo.setLastModifiedBy(userCode);
            return userService.updateUser(userInfo);
        } catch (Exception e) {
            logger.error("修改用户信息错误", e);
            System.out.println(e.toString());
            throw e;
        }
    }

    /**
     * demo 查询用户详情
     * @param userId
     * @return AppResponse
     * @author dingning
     * @Date 2020-03-21
     */
    @RequestMapping(value = "getUser")
    public AppResponse getUserByUserCode(String userId) {
        try {
            return userService.getUserByUserCode(userId);
        } catch (Exception e) {
            logger.error("用户查询错误", e);
            System.out.println(e.toString());
            throw e;
        }
    }
}
