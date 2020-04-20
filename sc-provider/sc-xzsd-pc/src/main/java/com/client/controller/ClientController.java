package com.client.controller;
import com.client.entity.ClientInfo;
import com.client.service.ClientService;
import com.goods.controller.GoodsController;
import com.util.AppResponse;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
/**
 * @author xin
 */
@RestController
@RequestMapping("/client")
public class ClientController {
    private static final Logger logger = LoggerFactory.getLogger(GoodsController.class);

    @Resource
    private ClientService clientService;
    /**
     * 分页查询商品列表
     *
     * @param clientInfo
     * @return
     */
    @RequestMapping(value = "listClients")
    public AppResponse listClients(ClientInfo clientInfo) {
        try {
            return clientService.listClients(clientInfo);
        } catch (Exception e) {
            logger.error("查询用户列表异常", e);
            System.out.println(e.toString());
            throw e;
        }
    }
}
