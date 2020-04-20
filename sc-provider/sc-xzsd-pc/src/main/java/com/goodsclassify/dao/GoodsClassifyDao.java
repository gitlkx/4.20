package com.goodsclassify.dao;
/**
 * 数据库相关接口
 */

import com.goods.entity.GoodsInfo;
import com.goodsclassify.entity.GoodsClassifyInfo;
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
public interface GoodsClassifyDao {
        /**
     * 新增商品分类
     * @param goodsclassifyinfo
     * @return
     */
    int addGoodsClassify(GoodsClassifyInfo goodsclassifyinfo);
    /**
     * 计算商品分类数量
     * @param goodsclassifyinfo
     * @return 返回商品分类个数
     */
    int countGoodsClassify(GoodsClassifyInfo goodsclassifyinfo);
    /**
     * 分页查询商品分类信息
     * @return 所有用户信息
     */
    List<GoodsClassifyInfo> listAllGoodsClassify(GoodsClassifyInfo goodsclassifyinfo );
    /**
     * 修改商品分类信息
     * @param goodsclassifyinfo 商品分类信息
     * @return 修改结果
     */
    int updateGoodsClassify(GoodsClassifyInfo goodsclassifyinfo );
    /**
     * 删除商品分类信息
     * @param classifyId 选中的商品编号集合
     * @param userId 更新人
     * @return
     */
    int deleteGoodsClassify(String classifyId,@Param("userId") String userId);
}
