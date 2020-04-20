package com.store.entity;

/**
 * 商品分类实体类
 * @Description goodsClassify
 * @Author kaoxin
 * @Date 2020-04-13
 */
public class StoreInfo {
    /**
     * 一共多少页
     */
    private int pageSize;
    /**
     * 当前多少页
     */
    private int pageNum;

    /**
     * 门店名称
     */
    private String storeName;
    /**
     * 联系电话（店长）
     */
    private String phone;
    /**
     * 店长（用户）id
     */
    private String userId;
    /**
     * 营业执照编码
     */
    private String businessCode;

    /**
     * 省编码
     */
    private String provinceId;
    /**
     * 市编码
     */
    private String cityId;
    /**
     * 区编码
     */
    private String areaId;
    /**
     * 省名称
     */
    private String provinceName;
    /**
     * 市名称
     */
    private String cityName;

    /**
     * 区名称
     */
    private String areaName;
    /**
     * 详细地址
     */
    private String address;
    /**
     * 门店编号
     */
    private String storeId;


    /**
     * 删除标记
     */
    private int idDelete;
    /**
     * 创建人
     */
    private String createUser;
    /**
     * 创建时间
     */
    private String createTime;
    /**
     * 修改人
     */
    private String supdateUser;
    /**
     * 修改时间
     */
    private String supdateTime;
    /**
     * 版本号
     */
    private String version;
    /**
     * 用户姓名
     */
    private String userName;



    /**
     * 以下是get set函数
     */


    public int getPageSize() {
        return pageSize;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }

    public int getPageNum() {
        return pageNum;
    }

    public void setPageNum(int pageNum) {
        this.pageNum = pageNum;
    }

    public String getStoreName() {
        return storeName;
    }

    public void setStoreName(String storeName) {
        this.storeName = storeName;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getBusinessCode() {
        return businessCode;
    }

    public void setBusinessCode(String businessCode) {
        this.businessCode = businessCode;
    }

    public String getProvinceId() {
        return provinceId;
    }

    public void setProvinceId(String provinceId) {
        this.provinceId = provinceId;
    }

    public String getCityId() {
        return cityId;
    }

    public void setCityId(String cityId) {
        this.cityId = cityId;
    }

    public String getAreaId() {
        return areaId;
    }

    public void setAreaId(String areaId) {
        this.areaId = areaId;
    }

    public String getProvinceName() {
        return provinceName;
    }

    public void setProvinceName(String provinceName) {
        this.provinceName = provinceName;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public String getAreaName() {
        return areaName;
    }

    public void setAreaName(String areaName) {
        this.areaName = areaName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getStoreId() {
        return storeId;
    }

    public void setStoreId(String storeId) {
        this.storeId = storeId;
    }

    public int getIdDelete() {
        return idDelete;
    }

    public void setIdDelete(int idDelete) {
        this.idDelete = idDelete;
    }

    public String getCreateUser() {
        return createUser;
    }

    public void setCreateUser(String createUser) {
        this.createUser = createUser;
    }

    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public String getSupdateUser() {
        return supdateUser;
    }

    public void setSupdateUser(String supdateUser) {
        this.supdateUser = supdateUser;
    }

    public String getSupdateTime() {
        return supdateTime;
    }

    public void setSupdateTime(String supdateTime) {
        this.supdateTime = supdateTime;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }
}
