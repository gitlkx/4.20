package com.hotGoods.service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.hotGoods.dao.HotGoodsDao;
import com.hotGoods.entity.HotGoodsInfo;
import com.util.AppResponse;
import com.util.StringUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.Arrays;
import java.util.List;

@Service
public class HotGoodsService {
    @Resource
    @Autowired
    private HotGoodsDao hotGoodsDao;

    /**
     * hotGoods 新增热门商品
     * @param goodsInfo
     * @return
     * @Author kaoxin
     * @Date 2020-04-16
     */
    /**
     * @Transactional(rollbackFor = Exception.class)
     * 数据回滚，防止脏数据.用于新增修改删除
     */
    @Transactional(rollbackFor = Exception.class)
    public AppResponse addHotGoods(HotGoodsInfo hotGoodsInfo) {
        // 校验账号是否存在
        int countGoods = hotGoodsDao.countGoods(hotGoodsInfo);
        if(0 != countGoods) {
            return AppResponse.bizError("热门商品已存在，请重新输入！");
        }
        hotGoodsInfo.setHotGoodsId(StringUtil.getCommonCode(2));
        hotGoodsInfo.setIdDelete(0);
        // 新增商品分类
        int count = hotGoodsDao.addGoods(hotGoodsInfo);
        if(0 == count) {
            return AppResponse.bizError("新增热门商品失败，请重试！");
        }
        return AppResponse.success("新增热门商品成功！");
    }
    /**
     * goods 查询热门商品详情
     * @param hotGoodsId
     * @Author kaoxin
     * @Date 2020-04-10
     */
    public AppResponse getHotGoods(String hotGoodsId) {
        HotGoodsInfo hotGoodsInfo = hotGoodsDao.getHotGoods(hotGoodsId);
        return AppResponse.success("查询成功！",hotGoodsInfo);
    }

    /**
     * goods 分页查询商品
     * @param hotGoodsInfo
     * @Author kaoxin
     * @time 2020-03-30
     */
    public AppResponse listHotGoods(HotGoodsInfo hotGoodsInfo) {
        PageHelper.startPage(hotGoodsInfo.getPageNum(), hotGoodsInfo.getPageSize());
        List<HotGoodsInfo> goodsInfoList = hotGoodsDao.listHotGoods(hotGoodsInfo);
        // 包装Page对象
        PageInfo<HotGoodsInfo> pageData = new PageInfo<>(goodsInfoList);
        return AppResponse.success("查询成功！",pageData);
    }
        /**
     * hotGoods 修改热门商品
     * @param hotGoodsInfo
     * @return
     * @Author kaoxin
     * @Date 2020-04-17
     */
    @Transactional(rollbackFor = Exception.class)
    public AppResponse updateHotGoods(HotGoodsInfo hotGoodsInfo) {
        AppResponse appResponse = AppResponse.success("修改成功");
        // 校验账号是否存在
        int countGoods = hotGoodsDao.countGoods(hotGoodsInfo);
        if(0 != countGoods) {
            return AppResponse.bizError("热门商品id已存在，请重新输入！");
        }
        // 修改商品信息
        int count = hotGoodsDao.updateHotGoods(hotGoodsInfo);
        if (0 == count) {
            appResponse = AppResponse.versionError("数据有变化，请刷新！");
            return appResponse;
        }
        return appResponse;
    }
    /**
     * hotGoods 修改商品数量展示接口
     * @param hotGoodsInfo
     * @return
     * @Author kaoxin
     * @Date 2020-04-17
     */
    @Transactional(rollbackFor = Exception.class)
    public AppResponse updateHotGoodsShowNum(HotGoodsInfo hotGoodsInfo) {
        AppResponse appResponse = AppResponse.success("修改成功");
        // 修改热门商品信息
        int count = hotGoodsDao.updateHotGoodsShowNum(hotGoodsInfo);
        if (0 == count) {
            appResponse = AppResponse.versionError("数据有变化，请刷新！");
            return appResponse;
        }
        return appResponse;
    }
    /**
     * goods 查询热门展示数量商品详情
     * @Author kaoxin
     * @Date 2020-04-10
     */
    public AppResponse getHotGoodsShowNum() {
        HotGoodsInfo hotGoodsInfo = hotGoodsDao.getHotGoodsShowNum();
        return AppResponse.success("查询成功！",hotGoodsInfo);
    }
    /**
     * hotGoods 删除热门商品
     * @param hotGoodsId
     * @Author kaoxin
     * @Date 2020-04-10
     */
    @Transactional(rollbackFor = Exception.class)
    public AppResponse deleteHotGoods(String hotGoodsId,String userId) {
        List<String> listHotGoods= Arrays.asList(hotGoodsId.split(","));
        AppResponse appResponse = AppResponse.success("删除成功！");
        // 删除用户
        int count = hotGoodsDao.deleteHotGoods(listHotGoods,userId);
        if(0 == count) {
            appResponse = AppResponse.bizError("删除失败，请重试！");
        }
        return appResponse;
    }
}
