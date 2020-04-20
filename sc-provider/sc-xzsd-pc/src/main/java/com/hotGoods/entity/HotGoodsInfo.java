package com.hotGoods.entity;

public class HotGoodsInfo {
    /**
     * 页码
     */
    private int pageSize;
    /**
     * 页数
     */
    private int pageNum;
    /**
     * 商品编号
     */
    private String goodsId;
    /**
     * 热门商品排序
     */
    private String hotGoodsNum;
    /**
     * 热门商品id
     */
    private String hotGoodsId;
    /**
     * 商品名字
     */
    private String goodsName;
    /**
     * 热门商品展示数量
     */
    private String hotGoodsShowNum;
    /**
     * 商品价格
     */
    private String goodsPrice;
    /**
     * 商品描述
     */
    private String goodsDescribe;
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

    public String getGoodsId() {
        return goodsId;
    }

    public void setGoodsId(String goodsId) {
        this.goodsId = goodsId;
    }

    public String getHotGoodsNum() {
        return hotGoodsNum;
    }

    public void setHotGoodsNum(String hotGoodsNum) {
        this.hotGoodsNum = hotGoodsNum;
    }

    public String getHotGoodsId() {
        return hotGoodsId;
    }

    public void setHotGoodsId(String hotGoodsId) {
        this.hotGoodsId = hotGoodsId;
    }

    public String getGoodsName() {
        return goodsName;
    }

    public void setGoodsName(String goodsName) {
        this.goodsName = goodsName;
    }

    public String getHotGoodsShowNum() {
        return hotGoodsShowNum;
    }

    public void setHotGoodsShowNum(String hotGoodsShowNum) {
        this.hotGoodsShowNum = hotGoodsShowNum;
    }

    public String getGoodsPrice() {
        return goodsPrice;
    }

    public void setGoodsPrice(String goodsPrice) {
        this.goodsPrice = goodsPrice;
    }

    public String getGoodsDescribe() {
        return goodsDescribe;
    }

    public void setGoodsDescribe(String goodsDescribe) {
        this.goodsDescribe = goodsDescribe;
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
}
