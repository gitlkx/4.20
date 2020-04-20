package com.slideshowhome.controller;
import com.slideshowhome.entity.SlideshowHomeInfo;
import com.slideshowhome.service.SlideshowHomeService;
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
 * 轮播图管理
 * @author kaoxin
 * @time 2020-04-14
 */

@Service
@RestController
@RequestMapping("/slideshowHome")
public class SlideshowHomeController {

    private static final Logger logger = LoggerFactory.getLogger(com.goods.controller.GoodsController.class);

    @Resource
    private SlideshowHomeService slideshowHomeService;

    /**
     * 新增轮播图
     * @return AppResponse
     * @author kaoxin
     * @Date 2020-04-14
     */
    @PostMapping("addSlideshowHome")
    public AppResponse addGoods(SlideshowHomeInfo slideshowHomeInfo) {
        try {
            //获取用户id
            String userId = AuthUtils.getCurrentUserId();
            slideshowHomeInfo.setCreator(userId);
            AppResponse appResponse = slideshowHomeService.addSlideshowHome(slideshowHomeInfo);
            return appResponse;
        } catch (Exception e) {
            logger.error("商品新增失败", e);
            System.out.println(e.toString());
            throw e;
        }
    }
    /**
     * slideshowhome 轮播图删除
     * @param slideshowId
     * @return AppResponse
     * @author dingning
     * @Date 2020-03-21
     */
    @PostMapping("deleteSlideshowHome")
    public AppResponse deleteSlideshowHome(String slideshowId) {
        try {
            //获取用户id
            String userId = AuthUtils.getCurrentUserId();
            return slideshowHomeService.deleteSlideshowHome(slideshowId,userId);
        } catch (Exception e) {
            logger.error("商品删除错误", e);
            System.out.println(e.toString());
            throw e;
        }
    }
    /**
     * 分页查询轮播图列表
     * @param slideshowHomeInfo
     * @return
     */
    @RequestMapping(value = "listSlideshowHome")
    public AppResponse listSlideshowHome(SlideshowHomeInfo slideshowHomeInfo ) {
        try {
            return slideshowHomeService.listSlideshowHome(slideshowHomeInfo);
        } catch (Exception e) {
            logger.error("查询轮播图列表异常", e);
            System.out.println(e.toString());
            throw e;
        }
    }
    /**
     * goods 轮播图状态修改
     * @param slideshowId
     * @param slideshowStateId
     * @return AppResponse
     * @author kaoxin
     * @Date 2020-04-10
     */
    @PostMapping("updateSlideshowHomeState")
    public AppResponse updateSlideshowHomeState(String slideshowId,int slideshowStateId) {
        try {
            return slideshowHomeService.updateSlideshowHomeState(slideshowId,slideshowStateId);
        } catch (Exception e) {
            logger.error("轮播图启停错误", e);
            System.out.println(e.toString());
            throw e;
        }
    }
}
