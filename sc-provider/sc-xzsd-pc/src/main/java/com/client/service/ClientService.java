package com.client.service;
import com.client.dao.ClientDao;
import com.client.entity.ClientInfo;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.goods.entity.GoodsInfo;
import com.util.AppResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.util.List;
/**
 * @author xin
 */
@Service
public class ClientService {
    @Resource
    @Autowired
    private ClientDao clientDao;
    /**
     * goods 分页查询商品
     * @param clientInfo
     * @Author kaoxin
     * @time 2020-04-16
     */
    public AppResponse listClients(ClientInfo clientInfo) {
        PageHelper.startPage(clientInfo.getPageNum(), clientInfo.getPageSize());
        List<ClientInfo> ClientsInfoList = clientDao.listClients(clientInfo);
        // 包装Page对象
        PageInfo<ClientInfo> pageData = new PageInfo<>(ClientsInfoList);
        return AppResponse.success("查询成功！",pageData);
    }
}
