package com.store.controller;


import com.store.entity.StoreInfo;
import com.store.service.StoreService;
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
* 门店管理
* @author kaoxin
* @time 2020-04-13
*/
@Service
@RestController
@RequestMapping("/store")
public class StoreController {

    private static final Logger logger = LoggerFactory.getLogger(StoreController.class);

    @Resource
    private StoreService storeService;
    /**
     * 新增门店
     * @return AppResponse
     * @author kaoxin
     * @Date 2020-04-09
     */
    @PostMapping("addStore")
    public AppResponse addStore(StoreInfo storeInfo) {
        try {
            //获取用户id
            String userId = AuthUtils.getCurrentUserId();
            storeInfo.setCreateUser(userId);
            AppResponse appResponse = storeService.addStore(storeInfo);
            return appResponse;
        } catch (Exception e) {
            logger.error("门店分类新增失败", e);
            System.out.println(e.toString());
            throw e;
        }
    }

    /**
     * 分页门店列表
     * @return
     */
    @RequestMapping(value = "listStores")
    public AppResponse listStores(StoreInfo storeInfo) {
        try {
            return storeService.listStores(storeInfo);
        } catch (Exception e) {
            logger.error("查询门店异常", e);
            System.out.println(e.toString());
            throw e;
        }
    }
    /**
     * 修改门店信息
     * @param storeInfo
     * @return AppResponse
     * @author kaoxin
     * @Date 2020-04-10
     */
    @PostMapping("updateStore")
    public AppResponse updateStore(StoreInfo storeInfo) {
        try {
            //获取用户id
            String userId = AuthUtils.getCurrentUserId();
//            storeInfo.setCreateUser(userId);
            storeInfo.setSupdateUser(userId);
            return storeService.updateStore(storeInfo);
        } catch (Exception e) {
            logger.error("修改门店信息错误", e);
            System.out.println(e.toString());
            throw e;
        }
    }
    /**
     * 门店删除
     * @param storeId
     * @return AppResponse
     * @author dingning
     * @Date 2020-03-21
     */
    @PostMapping("deleteStore")
    public AppResponse deleteStore(String storeId) {
        try {
            //获取用户id
            String userId = AuthUtils.getCurrentUserId();
            return storeService.deleteStore(storeId,userId);
        } catch (Exception e) {
            logger.error("门店删除错误", e);
            System.out.println(e.toString());
            throw e;
        }
    }
    /**
     * 查询门店信息详情
     * @param storeId
     * @return
     * @Author kaoxin
     * @Date 2020-04-11
     */
    @RequestMapping(value = "getStore")
    public AppResponse getStore(String storeId) {
        try {
            return storeService.getStore(storeId);
        } catch (Exception e) {
            logger.error("门店详情查询错误", e);
            System.out.println(e.toString());
            throw e;
        }
    }
}
