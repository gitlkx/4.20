package com.order.service;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.order.dao.OrderDao;
import com.order.entity.OrderInfo;
import com.util.AppResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.Arrays;
import java.util.List;

/**
 * @author xin
 */
@Service
public class OrderService {
    @Resource
    @Autowired
    private OrderDao orderDao;
    /**
     * goods 查询订单详情
     * @param orderId
     * @Author kaoxin
     * @Date 2020-04-10
     */
    public AppResponse getListOrder(String orderId) {
        OrderInfo orderInfo = orderDao.detailsGoods(orderId);
        return AppResponse.success("查询成功！",orderInfo);
    }
    /**
     * goods 分页查询商品
     * @param orderInfo
     * @Author kaoxin
     * @time 2020-04-17
     */
    public AppResponse listOrders(OrderInfo orderInfo) {
        PageHelper.startPage(orderInfo.getPageNum(), orderInfo.getPageSize());
        List<OrderInfo> OrdersInfoList = orderDao.listOrders(orderInfo);
        // 包装Page对象
        PageInfo<OrderInfo> pageData = new PageInfo<>(OrdersInfoList);
        return AppResponse.success("查询成功！",pageData);
    }
    /**
     * order 修改订单状态
     * @param orderId
     * @param orderStateId
     * @return
     * @Author 考鑫
     * @Date 2020-04-15
     */
    @Transactional(rollbackFor = Exception.class)
    public AppResponse updateOrderState(String orderId, int orderStateId, String version) {
        List<String> listOrder= Arrays.asList(orderId.split(","));
        List<String> listVersion= Arrays.asList(version.split(","));
        AppResponse appResponse = AppResponse.success("订单状态修改成功！");
        // 修改状态
        int count = orderDao.updateOrderState(listOrder,orderStateId,listVersion);
        if(0 == count) {
            appResponse = AppResponse.bizError("订单状态修改失败，请重试！");
        }
        return appResponse;
    }
}
