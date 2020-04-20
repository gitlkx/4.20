package com.goodsclassify.service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.goods.entity.GoodsInfo;
import com.goodsclassify.dao.GoodsClassifyDao;
import com.goodsclassify.entity.GoodsClassifyInfo;
import com.util.AppResponse;
import com.util.StringUtil;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.Arrays;
import java.util.List;

/**
 * @author xin
 */
@Service
public class GoodsClassifyService {
    @Resource
    private GoodsClassifyDao goodsClassifyDao;

    /**
     * goods 新增商品分类
     * @param GoodsClassifyInfo
     * @return
     * @Author kaoxin
     * @Date 2020-03-27
     */
    /**
     * @Transactional(rollbackFor = Exception.class)
     * 数据回滚，防止脏数据.用于新增修改删除
     */
    @Transactional(rollbackFor = Exception.class)
    public AppResponse addGoodsClassify(GoodsClassifyInfo goodsclassifyinfo) {
        // 校验账号是否存在
        int countGoodsClassify = goodsClassifyDao.countGoodsClassify(goodsclassifyinfo);
        if(0 != countGoodsClassify) {
            return AppResponse.bizError("用户商品已存在，请重新输入！");
        }
        goodsclassifyinfo.setClassifyId(StringUtil.getCommonCode(2));
        goodsclassifyinfo.setIdDelete(0);
        // 新增商品分类
        int count = goodsClassifyDao.addGoodsClassify(goodsclassifyinfo);
        if(0 == count) {
            return AppResponse.bizError("新增失败，请重试！");
        }
        return AppResponse.success("新增成功！");
    }
    /**
     * goods 查询商品分类
     * @Author kaoxin
     * @time 2020-03-30
     */
    public AppResponse listAllGoodsClassify(GoodsClassifyInfo goodsclassifyinfo ) {
        List<GoodsClassifyInfo> goodsClassifyInfoList = goodsClassifyDao.listAllGoodsClassify(goodsclassifyinfo);
        return AppResponse.success("查询成功！",goodsClassifyInfoList);
    }
    /**
     * goods 修改商品分类
     * @param goodsclassifyInfo
     * @return
     * @Author kaoxin
     * @Date 2020-04-10
     */
    @Transactional(rollbackFor = Exception.class)
    public AppResponse updateGoodsClassify(GoodsClassifyInfo goodsclassifyInfo) {
        AppResponse appResponse = AppResponse.success("修改成功");
        // 修改用户信息
        int count = goodsClassifyDao.updateGoodsClassify(goodsclassifyInfo);
        if (0 == count) {
            appResponse = AppResponse.versionError("数据有变化，请刷新！");
            return appResponse;
        }
        return appResponse;
    }
    /**
     * goods 删除商品分类
     * @param classifyId
     * @return
     * @Author kaoxin
     * @Date 2020-04-10
     */
    @Transactional(rollbackFor = Exception.class)
    public AppResponse deleteGoodsClassify(String classifyId,String userId) {
        AppResponse appResponse = AppResponse.success("删除成功！");
        // 删除用户
        int count = goodsClassifyDao.deleteGoodsClassify(classifyId,userId);
        if(0 == count) {
            appResponse = AppResponse.bizError("删除失败，请重试！");
        }
        return appResponse;
    }
}