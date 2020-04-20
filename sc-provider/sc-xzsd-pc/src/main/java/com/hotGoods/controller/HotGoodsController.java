package com.hotGoods.controller;
import com.hotGoods.entity.HotGoodsInfo;
import com.hotGoods.service.HotGoodsService;
import com.util.AppResponse;
import com.util.AuthUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@RequestMapping("/hotGoods")
public class HotGoodsController {

    private static final Logger logger = LoggerFactory.getLogger(HotGoodsController.class);

    @Resource
    private HotGoodsService hotGoodsService;
    /**
     * 新增热门商品
     * @return AppResponse
     * @author kaoxin
     * @Date 2020-04-09
     */
    @PostMapping("addHotGoods")
    public AppResponse addHotGoods(HotGoodsInfo hotGoodsInfo) {
        try {
            //获取用户id
            String userId = AuthUtils.getCurrentUserId();
            hotGoodsInfo.setCreateUser(userId);
            hotGoodsInfo.setIdDelete(0);
            AppResponse appResponse = hotGoodsService.addHotGoods(hotGoodsInfo);
            return appResponse;
        } catch (Exception e) {
            logger.error("热门商品新增失败", e);
            System.out.println(e.toString());
            throw e;
        }
    }
    /**
     * HotGoods 查询热门商品详情
     * @param hotGoodsId
     * @Author kaoxin
     * @Date 2020-04-17
     */
    @RequestMapping(value = "getHotGoods")
    public AppResponse getHotGoods(String hotGoodsId) {
        try {
            return hotGoodsService.getHotGoods(hotGoodsId);
        } catch (Exception e) {
            logger.error("热门商品详情查询错误", e);
            System.out.println(e.toString());
            throw e;
        }
    }
    /**
     * 分页查询热门商品列表
     * @param hotGoodsInfo
     * @return
     */
    @RequestMapping(value = "listHotGoods")
    public AppResponse listHotGoods(HotGoodsInfo hotGoodsInfo) {
        try {
            return hotGoodsService.listHotGoods(hotGoodsInfo);
        } catch (Exception e) {
            logger.error("查询热门商品列表异常", e);
            System.out.println(e.toString());
            throw e;
        }
    }
    /**
     * goods 修改热门商品
     * @param hotGoodsInfo
     * @return AppResponse
     * @author kaoxin
     * @Date 2020-04-10
     */
    @PostMapping("updateHotGoods")
    public AppResponse updateHotGoods(HotGoodsInfo hotGoodsInfo) {
        try {
            //获取用户id
            String userId = AuthUtils.getCurrentUserId();
            hotGoodsInfo.setSupdateUser(userId);
//            hotgoodsInfo.setModifier(userId);
            return hotGoodsService.updateHotGoods(hotGoodsInfo);
        } catch (Exception e) {
            logger.error("修改热门商品信息错误", e);
            System.out.println(e.toString());
            throw e;
        }
    }
    /**
     * hotGoods 修改商品数量展示
     * @return AppResponse
     * @author 考鑫
     * @Date 2020-04-17
     */
    @PostMapping("updateHotGoodsShowNum")
    public AppResponse updateHotGoodsShowNum(HotGoodsInfo hotGoodsInfo) {
        try {
            //获取用户id
            String userId = AuthUtils.getCurrentUserId();
            hotGoodsInfo.setSupdateUser(userId);
            return hotGoodsService.updateHotGoodsShowNum(hotGoodsInfo);
        } catch (Exception e) {
            logger.error("修改商品数量展示错误", e);
            System.out.println(e.toString());
            throw e;
        }
    }
    /**
     * HotGoods 查询热门商品展示数量
     * @Author kaoxin
     * @Date 2020-04-17
     */
    @RequestMapping(value = "getHotGoodsShowNum")
    public AppResponse getHotGoodsShowNum() {
        try {
            return hotGoodsService.getHotGoodsShowNum();
        } catch (Exception e) {
            logger.error("查询热门商品展示数量错误", e);
            System.out.println(e.toString());
            throw e;
        }
    }
    /**
     * HotGoods 热门商品删除
     * @param hotGoodsId
     * @return AppResponse
     * @author kaoxin
     * @Date 2020-04-10
     */
    @PostMapping("deleteHotGoods")
    public AppResponse deleteGoods(String hotGoodsId) {
        try {
            //获取用户id
            String userId = AuthUtils.getCurrentUserId();
            return hotGoodsService.deleteHotGoods(hotGoodsId,userId);
        } catch (Exception e) {
            logger.error("商品删除错误", e);
            System.out.println(e.toString());
            throw e;
        }
    }
}
