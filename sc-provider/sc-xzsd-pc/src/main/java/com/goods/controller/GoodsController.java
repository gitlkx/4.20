package com.goods.controller;
import com.goods.entity.GoodsInfo;
import com.goods.service.GoodsService;
import com.util.AppResponse;
import com.util.AuthUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * 商品管理
 * @author kaoxin
 * @time 2020-03-24
 */


@RestController
@RequestMapping("/goods")
public class GoodsController {

    private static final Logger logger = LoggerFactory.getLogger(GoodsController.class);

    @Resource
    private GoodsService goodsService;
    /**
     * 新增商品
     * @return AppResponse
     * @author kaoxin
     * @Date 2020-04-09
     */
    @PostMapping("addGoods")
    public AppResponse addGoods(GoodsInfo goodsInfo) {
        try {
            //获取用户id
            String userId = AuthUtils.getCurrentUserId();
            goodsInfo.setCreator(userId);
            goodsInfo.setGoodsStateId(0);
            goodsInfo.setVersion("0");
            AppResponse appResponse = goodsService.addGoods(goodsInfo);
            return appResponse;
        } catch (Exception e) {
            logger.error("商品新增失败", e);
            System.out.println(e.toString());
            throw e;
        }
    }

    /**
     * 分页查询商品列表
     *
     * @param goodsInfo
     * @return
     */
    @RequestMapping(value = "listGoods")
    public AppResponse listGoods(GoodsInfo goodsInfo) {
        try {
            return goodsService.listGoods(goodsInfo);
        } catch (Exception e) {
            logger.error("查询商品列表异常", e);
            System.out.println(e.toString());
            throw e;
        }
    }
    /**
     * goods 商品删除
     * @param goodsId
     * @return AppResponse
     * @author dingning
     * @Date 2020-03-21
     */
    @PostMapping("deleteGoods")
    public AppResponse deleteGoods(String goodsId) {
        try {
            //获取用户id
            String userId = AuthUtils.getCurrentUserId();
            return goodsService.deleteGoods(goodsId,userId);
        } catch (Exception e) {
            logger.error("商品删除错误", e);
            System.out.println(e.toString());
            throw e;
        }
    }

    /**
     * goods 修改商品
     * @param goodsInfo
     * @return AppResponse
     * @author kaoxin
     * @Date 2020-04-10
     */
    @PostMapping("updateGoods")
    public AppResponse updateGoods(GoodsInfo goodsInfo) {
        try {
            //获取用户id
            String userId = AuthUtils.getCurrentUserId();
            goodsInfo.setCreator(userId);
            goodsInfo.setModifier(userId);
            return goodsService.updateGoods(goodsInfo);
        } catch (Exception e) {
            logger.error("修改商品信息错误", e);
            System.out.println(e.toString());
            throw e;
        }
    }
    /**
     * goods 商品状态修改
     * @param goodsId
     * @param goodsStateId
     * @return AppResponse
     * @author kaoxin
     * @Date 2020-04-10
     */
    @PostMapping("updateGoodsShelfState")
    public AppResponse updateGoodsShelfState(String goodsId,int goodsStateId) {
        try {
            return goodsService.updateGoodsShelfState(goodsId,goodsStateId);
        } catch (Exception e) {
            logger.error("上下架错误", e);
            System.out.println(e.toString());
            throw e;
        }
    }
    /**
     * goods 查询商品详情
     * @param goodsId
     * @return
     * @Author kaoxin
     * @Date 2020-04-11
     */
    @RequestMapping(value = "getGoods")
    public AppResponse getGoods(String goodsId) {
        try {
            return goodsService.getGoods(goodsId);
        } catch (Exception e) {
            logger.error("商品详情查询错误", e);
            System.out.println(e.toString());
            throw e;
        }
    }
}