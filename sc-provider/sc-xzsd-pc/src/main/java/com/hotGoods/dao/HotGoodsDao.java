package com.hotGoods.dao;

import com.hotGoods.entity.HotGoodsInfo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface HotGoodsDao {
    /**
     * 新增热门商品
     * @param hotGoodsInfo
     * @return
     */
    int addGoods(HotGoodsInfo hotGoodsInfo);
    /**
     * 计算热门商品数量
     * @param hotGoodsInfo
     * @return 返回热门商品个数
     */
    int countGoods(HotGoodsInfo hotGoodsInfo);
    /**
     * 获取热门商品详细信息
     * @param hotGoodsId 热门商品id
     * @return 商品详细详细
     */
    HotGoodsInfo getHotGoods( String hotGoodsId);
    /**
     * 分页查询热门商品信息
     * @param hotGoodsInfo
     * @return 所有用户信息
     */
    List<HotGoodsInfo> listHotGoods(HotGoodsInfo hotGoodsInfo);
    /**
     * 修改热门商品信息
     * @param hotGoodsInfo 热门商品信息
     * @return 修改结果
     */
    int updateHotGoods(HotGoodsInfo hotGoodsInfo);
    /**
     * 修改商品展示数量
     * @param hotGoodsInfo 热门商品信息
     * @return
     */
    int updateHotGoodsShowNum(HotGoodsInfo hotGoodsInfo);
    /**
     * 查询商品展示数量
     * @return 商品详细详细
     */
    HotGoodsInfo getHotGoodsShowNum();
    /**
     * 删除热门商品信息
     * @param listHotGoods 选中的热门商品编号集合
     * @param userId 更新人
     * @return
     */
    int deleteHotGoods(@Param("listHotGoods")List<String> listHotGoods,@Param("userId") String userId);
}
