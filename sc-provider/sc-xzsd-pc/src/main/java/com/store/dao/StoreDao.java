package com.store.dao;
/**
 * 数据库相关接口
 */

import com.goods.entity.GoodsInfo;

import com.store.entity.StoreInfo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @ClassName GoodsClassifyDao
 * @Description goodsClassify
 * @Author kaoxin
 * @Date 2020-04-13
 */
/**
 * @author xin
 * @Mapper 与数据库相关联的意思
 */
@Mapper
public interface StoreDao {
    /**
     * 新增门店
     * @param storeInfo
     * @return
     */
    int addStore(StoreInfo storeInfo);
    /**
     * 计算门店数量
     * @param storeInfo
     * @return 返回门店个数
     */
    int countStore(StoreInfo storeInfo);
    /**
     * 查询门店信息
     * @return 所有门店信息
     */
    List<StoreInfo> listStores(StoreInfo storeInfo );
    /**
     * 修改门店信息
     * @param storeInfo 门店信息
     * @return 修改结果
     */
    int updateStore(StoreInfo storeInfo );
    /**
     * 删除门店
     * @param listStore 选中的门店集合
     * @param userId 更新人
     * @return
     */
    int deleteStore(@Param("listStore")List<String> listStore,@Param("userId") String userId);
    /**
     * 获取门店详细信息
     * @param storeId 商品id
     * @return 商品详细详细
     */
    StoreInfo getStore( String storeId);
}
