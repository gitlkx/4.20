package com.order.controller;

import com.order.entity.OrderInfo;
import com.order.service.OrderService;
import com.util.AppResponse;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@RequestMapping("/order")
public class OrderController {
    private static final Logger logger = LoggerFactory.getLogger(OrderController.class);

    @Resource
    private OrderService OrderService;
    /**
     * 查询订单详情
     * @return AppResponse
     * @author kaoxin
     * @Date 2020-04-09
     */
    @PostMapping("getListOrder")
    public AppResponse getListOrder(String orderId) {
        try {
            return OrderService.getListOrder(orderId);
        } catch (Exception e) {
            logger.error("订单详情查询错误", e);
            System.out.println(e.toString());
            throw e;
        }
    }
    /**
     * 分页查询订单
     *
     * @param orderInfo
     * @return
     */
    @RequestMapping(value = "listOrders")
    public AppResponse listOrders(OrderInfo orderInfo) {
        try {
            return OrderService.listOrders(orderInfo);
        } catch (Exception e) {
            logger.error("查询订单列表异常", e);
            System.out.println(e.toString());
            throw e;
        }
    }
    /**
     * goods 订单状态修改
     * @param orderId
     * @param orderStateId
     * @return AppResponse
     * @author kaoxin
     * @Date 2020-04-10
     */
    @PostMapping("updateOrderState")
    public AppResponse updateOrderState(String orderId, int orderStateId, String version) {
        try {
            return OrderService.updateOrderState(orderId,orderStateId,version);
        } catch (Exception e) {
            logger.error("修改状态错误", e);
            System.out.println(e.toString());
            throw e;
        }
    }
}
