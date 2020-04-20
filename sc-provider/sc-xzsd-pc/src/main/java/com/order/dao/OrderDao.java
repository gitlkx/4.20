package com.order.dao;

import com.order.entity.OrderInfo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface OrderDao {
    /**
     * 订单详情接口
     * @param orderId 订单id
     * @return 订单详细详细
     */
    OrderInfo detailsGoods(String orderId);
    /**
     * 分页查询订单
     * @param orderInfo 订单信息
     * @return 订单
     */
    List<OrderInfo> listOrders(OrderInfo orderInfo);
    /**
     * 修改分页状态
     * @param listOrder 选中的订单编号集合
     * @param orderStateId 状态
     * @return
     */
    int updateOrderState(@Param("listOrder")List<String> listOrder, int orderStateId, List<String> listVersion);
}
