package com.goodsclassify.controller;

import com.goods.entity.GoodsInfo;
import com.goodsclassify.entity.GoodsClassifyInfo;
import com.goodsclassify.service.GoodsClassifyService;
import com.util.AppResponse;
import com.util.AuthUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;


/**
* 商品分类管理
* @author kaoxin
* @time 2020-04-13
*/
@Service
@RestController
@RequestMapping("/goodsClassify")
public class GoodsClassifyController {

    private static final Logger logger = LoggerFactory.getLogger(GoodsClassifyController.class);

    @Resource
    private GoodsClassifyService goodsClassifyService;
    /**
     * 新增商品分类
     * @return AppResponse
     * @author kaoxin
     * @Date 2020-04-09
     */
    @PostMapping("addGoodsClassify")
    public AppResponse addGoodsClassify(GoodsClassifyInfo goodsclassifyinfo) {
        try {
            //获取用户id
            String userId = AuthUtils.getCurrentUserId();
            goodsclassifyinfo.setCreateUser(userId);
            AppResponse appResponse = goodsClassifyService.addGoodsClassify(goodsclassifyinfo);
            return appResponse;
        } catch (Exception e) {
            logger.error("商品分类新增失败", e);
            System.out.println(e.toString());
            throw e;
        }
    }

    /**
     * 分页查询商品列表
     * @return
     */
    @RequestMapping(value = "listAllGoodsClassify")
    public AppResponse listAllGoodsClassify(GoodsClassifyInfo goodsclassifyinfo) {
        try {
            return goodsClassifyService.listAllGoodsClassify(goodsclassifyinfo);
        } catch (Exception e) {
            logger.error("查询商品列表异常", e);
            System.out.println(e.toString());
            throw e;
        }
    }
    /**
     * goodsclassify
     * @param goodsclassifyInfo
     * @return AppResponse
     * @author kaoxin
     * @Date 2020-04-10
     */
    @PostMapping("updateGoodsClassify")
    public AppResponse updateGoodsClassify(GoodsClassifyInfo goodsclassifyInfo) {
        try {
            //获取用户id
            String userId = AuthUtils.getCurrentUserId();
            goodsclassifyInfo.setCreateUser(userId);
            goodsclassifyInfo.setSupdateUser(userId);
            return goodsClassifyService.updateGoodsClassify(goodsclassifyInfo);
        } catch (Exception e) {
            logger.error("修改商品分类信息错误", e);
            System.out.println(e.toString());
            throw e;
        }
    }
    /**
     * goods 商品分类删除
     * @param classifyId
     * @return AppResponse
     * @author dingning
     * @Date 2020-03-21
     */
    @PostMapping("deleteGoodsClassify")
    public AppResponse deleteGoodsClassify(String classifyId) {
        try {
            //获取用户id
            String userId = AuthUtils.getCurrentUserId();
            return goodsClassifyService.deleteGoodsClassify(classifyId,userId);
        } catch (Exception e) {
            logger.error("商品删除错误", e);
            System.out.println(e.toString());
            throw e;
        }
    }
}
