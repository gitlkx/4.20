package com.slideshowhome.dao;

//import com.goods.entity.GoodsInfo;
//import com.slideshowhome.entity.SlideshowHomeInfo;
//import org.apache.ibatis.annotations.Mapper;
//import org.apache.ibatis.annotations.Param;
//
//import java.util.List;
import com.goods.entity.GoodsInfo;
import com.slideshowhome.entity.SlideshowHomeInfo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @ClassName slideshowHomeDao
 * @Description slideshowHome
 * @Author kaoxin
 * @Date 2020-04-14
 */
/**
 * @author xin
 * @Mapper 与数据库相关联的意思
 */
@Mapper

public interface SlideshowHomeDao {
    /**
     * 轮播图数量
     * @param slideshowHomeInfo
     * @return 返回轮播图个数
     */
    int countGoodsSlideshowHome(SlideshowHomeInfo slideshowHomeInfo);
    /**
     * 新增轮播图
     * @param slideshowHomeInfo
     * @return
     */
    int addSlideshowHome(SlideshowHomeInfo slideshowHomeInfo);
    /**
     * 删除轮播图
     * @param listSlideshowHome 选中的轮播图集合
     * @param userId 更新人
     * @return
     */
    int deleteSlideshowHome(@Param("listSlideshowHome") List<String> listSlideshowHome, @Param("userId") String userId);
    /**
     * 分页查询轮播图
     * @param slideshowHomeInfo
     * @return
     */
    List<GoodsInfo> listSlideshowHomeByPage(SlideshowHomeInfo slideshowHomeInfo ) ;
    /**
     * 轮播图状态修改
     * @param listSlideshowHomeState 选中的商品编号集合
     * @param slideshowStateId 0禁用1启用
     * @return
     */
    int updateSlideshowHomeState(@Param("listSlideshowHomeState")List<String> listSlideshowHomeState, int slideshowStateId);
}
