package com.client.dao;

import com.client.entity.ClientInfo;
import com.goods.entity.GoodsInfo;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
@Mapper
public interface ClientDao {
    /**
     * 分页查询客户信息
     * @param clientInfo 用户信息
     * @return 所有用户信息
     */
    List<ClientInfo> listClients(ClientInfo clientInfo);
}
