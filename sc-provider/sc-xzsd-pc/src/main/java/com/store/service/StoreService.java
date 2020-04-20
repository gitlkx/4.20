package com.store.service;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.goods.entity.GoodsInfo;
import com.store.dao.StoreDao;
import com.store.entity.StoreInfo;
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
public class StoreService {
    @Resource
    private StoreDao storeDao;

    /**
     * 新增门店
     * @param StoreInfo
     * @return
     * @Author kaoxin
     * @Date 2020-03-27
     */
    /**
     * @Transactional(rollbackFor = Exception.class)
     * 数据回滚，防止脏数据.用于新增修改删除
     */
    @Transactional(rollbackFor = Exception.class)
    public AppResponse addStore(StoreInfo storeInfo) {
        // 校验门店账号是否存在
        int countStore = storeDao.countStore(storeInfo);
        if(0 != countStore) {
            return AppResponse.bizError("门店已存在，请重新输入！");
        }
        storeInfo.setStoreId(StringUtil.getCommonCode(2));
        storeInfo.setIdDelete(0);
        storeInfo.setVersion("0");
        // 新增门店
        int count = storeDao.addStore(storeInfo);
        if(0 == count) {
            return AppResponse.bizError("新增失败，请重试！");
        }
        return AppResponse.success("新增成功！");
    }
    /**
     * 分页查询门店
     * @Author kaoxin
     * @time 2020-03-30
     */
    public AppResponse listStores(StoreInfo storeInfo ) {
        PageHelper.startPage(storeInfo.getPageNum(), storeInfo.getPageSize());
        List<StoreInfo> storeInfoList = storeDao.listStores(storeInfo);
        return AppResponse.success("查询成功！",storeInfoList);
    }
    /**
     * goods 修改商品分类
     * @param storeInfo
     * @return
     * @Author kaoxin
     * @Date 2020-04-10
     */
    @Transactional(rollbackFor = Exception.class)
    public AppResponse updateStore(StoreInfo storeInfo) {
        AppResponse appResponse = AppResponse.success("修改成功");
        // 修改用户信息
        int count = storeDao.updateStore(storeInfo);
        if (0 == count) {
            appResponse = AppResponse.versionError("数据有变化，请刷新！");
            return appResponse;
        }
        return appResponse;
    }
    /**
     * 删除门店
     * @param storeId
     * @param userId
     * @return
     * @Author kaoxin
     * @Date 2020-04-10
     */
    @Transactional(rollbackFor = Exception.class)
    public AppResponse deleteStore(String storeId,String userId) {
        List<String> listStore= Arrays.asList(storeId.split(","));
        AppResponse appResponse = AppResponse.success("删除成功！");
        // 删除用户
        int count = storeDao.deleteStore(listStore,userId);
        if(0 == count) {
            appResponse = AppResponse.bizError("删除失败，请重试！");
        }
        return appResponse;
    }
    /**
     * 查询门店详情
     * @param storeId
     * @Author kaoxin
     * @Date 2020-04-10
     */
    public AppResponse getStore(String storeId) {
        StoreInfo storeInfo = storeDao.getStore(storeId);
        return AppResponse.success("查询成功！",storeInfo);
    }
}