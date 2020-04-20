package com.slideshowhome.service;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.goods.entity.GoodsInfo;
import com.slideshowhome.dao.SlideshowHomeDao;
import com.slideshowhome.entity.SlideshowHomeInfo;
import com.util.AppResponse;
import com.util.StringUtil;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import javax.annotation.Resource;
import java.util.Arrays;
import java.util.List;
/**
 * @author xin
 */
@Service
public class SlideshowHomeService {
    @Resource
    private SlideshowHomeDao slideshowHomeDao;

    /**
     * goods 新增轮播图
     * @param slideshowHomeInfo
     * @return
     * @Author kaoxin
     * @Date 2020-04-14
     */
    /**
     * @Transactional(rollbackFor = Exception.class)
     * 数据回滚，防止脏数据.用于新增修改删除
     */
    @Transactional(rollbackFor = Exception.class)
    public AppResponse addSlideshowHome(SlideshowHomeInfo slideshowHomeInfo) {
        // 校验账号是否存在
        int countGoods = slideshowHomeDao.countGoodsSlideshowHome(slideshowHomeInfo);
        if(0 != countGoods) {
            return AppResponse.bizError("用户轮播图已存在，请重新输入！");
        }
        slideshowHomeInfo.setSlideshowId(StringUtil.getCommonCode(2));
        //删除标记，启动状态，版本号赋初值
        slideshowHomeInfo.setDeleteTag(0);
        slideshowHomeInfo.setSlideshowStateId(0);
        slideshowHomeInfo.setVersion(0);
        // 新增轮播图
        int count = slideshowHomeDao.addSlideshowHome(slideshowHomeInfo);
        if(0 == count) {
            return AppResponse.bizError("新增失败，请重试！");
        }
        return AppResponse.success("新增成功！");
    }
    /**
     * slideshowHome 删除轮播图
     * @param slideshowId
     * @param userId
     * @return
     * @Author kaoxin
     * @Date 2020-04-10
     */
    @Transactional(rollbackFor = Exception.class)
    public AppResponse deleteSlideshowHome(String slideshowId, String userId) {
        List<String> listSlideshowHome= Arrays.asList(slideshowId.split(","));
        AppResponse appResponse = AppResponse.success("删除成功！");
        // 删除用户
        int count = slideshowHomeDao.deleteSlideshowHome(listSlideshowHome,userId);
        if(0 == count) {
            appResponse = AppResponse.bizError("删除失败，请重试！");
        }
        return appResponse;
    }
    /**
     * goods 分页查询轮播图
     * @param slideshowHomeInfo
     * @Author kaoxin
     * @time 2020-04-15
     */
    public AppResponse listSlideshowHome(SlideshowHomeInfo slideshowHomeInfo) {
        PageHelper.startPage(slideshowHomeInfo.getPageNum(), slideshowHomeInfo.getPageSize());
        List<GoodsInfo> slideshowHomeInfoList = slideshowHomeDao.listSlideshowHomeByPage(slideshowHomeInfo);
        // 包装Page对象
        PageInfo<GoodsInfo> pageData = new PageInfo<GoodsInfo>(slideshowHomeInfoList);
        return AppResponse.success("查询成功！",pageData);
    }
    /**
     * SlideshowHomeState 轮播图启停
     * @param slideshowId
     * @param slideshowStateId
     * @return
     * @Author 考鑫
     * @Date 2020-04-15
     */
    @Transactional(rollbackFor = Exception.class)
    public AppResponse updateSlideshowHomeState(String slideshowId,int slideshowStateId) {
        List<String> listSlideshowHomeState= Arrays.asList(slideshowId.split(","));
        AppResponse appResponse = AppResponse.success("轮播图启停成功！");
        // 上下架
        int count = slideshowHomeDao.updateSlideshowHomeState(listSlideshowHomeState,slideshowStateId);
        if(0 == count) {
            appResponse = AppResponse.bizError("轮播图启停失败，请重试！");
        }
        return appResponse;
    }
}