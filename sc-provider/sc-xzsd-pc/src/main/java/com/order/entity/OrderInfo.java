package com.order.entity;

public class OrderInfo {
    /**
     * 页码
     */
    private int pageSize;
    /**
     * 页数
     */
    private int pageNum;
    /**
     * 订单id
     */
    private String orderId;
    /**
     * 用户id
     */
    private String userId;
    /**
     * 商品id
     */
    private String goodsId;
    /**
     * 商品名称
     */
    private String goodsName;
    /**
     * 商品数量
     */
    private int goodsCount;
    /**
     * 总金额
     */
    private int theGoodsAllPrice;
    /**
     * 售价
     */
    private int goodsPrice;
    /**
     * 定价
     */
    private int goodsShelfCost;
    /**
     * 订单状态
     */
    private int orderStateId;
    /**
     * 下单人
     */
    private String userName;
    /**
     * 手机号
     */
    private String phone;
    /**
     * 付款时间范围起
     */
    private String payTimeStart;
    /**
     * 付款时间范围止
     */
    private String payTimeEnd;
    /**
     * 当前登录人的角色编号
     */
    private int role;
    /**
     * 门店编号
     */
    private String storeId;
    /**
     * 付款时间
     */
    private String payTime;
    /**
     * 商品图片路径
     */
    private String goodsImagePath;
    /**
     * 商品数量
     */
    private int cartGoodsCount;
    /**
     * 订单总价
     */
    private int orderAllCost;
    /**
     * 订单商品总数量
     */
    private int orderAllGoodsCount;


    /**
     * 删除标记0未删除1已删除
     */
    private int deleteTag;
    /**
     * 创建时间
     */
    private String creationTime;
    /**
     * 创建人
     */
    private String creator;
    /**
     * 修改时间
     */
    private String modificationTime;
    /**
     * 修改人
     */
    private String modifier;
    /**
     * 版本号
     */
    private String version;

    /**
     *  get set
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

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getGoodsId() {
        return goodsId;
    }

    public void setGoodsId(String goodsId) {
        this.goodsId = goodsId;
    }

    public String getGoodsName() {
        return goodsName;
    }

    public void setGoodsName(String goodsName) {
        this.goodsName = goodsName;
    }

    public int getGoodsCount() {
        return goodsCount;
    }

    public void setGoodsCount(int goodsCount) {
        this.goodsCount = goodsCount;
    }

    public int getTheGoodsAllPrice() {
        return theGoodsAllPrice;
    }

    public void setTheGoodsAllPrice(int theGoodsAllPrice) {
        this.theGoodsAllPrice = theGoodsAllPrice;
    }

    public int getGoodsPrice() {
        return goodsPrice;
    }

    public void setGoodsPrice(int goodsPrice) {
        this.goodsPrice = goodsPrice;
    }

    public int getGoodsShelfCost() {
        return goodsShelfCost;
    }

    public void setGoodsShelfCost(int goodsShelfCost) {
        this.goodsShelfCost = goodsShelfCost;
    }

    public int getOrderStateId() {
        return orderStateId;
    }

    public void setOrderStateId(int orderStateId) {
        this.orderStateId = orderStateId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getPayTimeStart() {
        return payTimeStart;
    }

    public void setPayTimeStart(String payTimeStart) {
        this.payTimeStart = payTimeStart;
    }

    public String getPayTimeEnd() {
        return payTimeEnd;
    }

    public void setPayTimeEnd(String payTimeEnd) {
        this.payTimeEnd = payTimeEnd;
    }

    public int getRole() {
        return role;
    }

    public void setRole(int role) {
        this.role = role;
    }

    public String getStoreId() {
        return storeId;
    }

    public void setStoreId(String storeId) {
        this.storeId = storeId;
    }

    public String getPayTime() {
        return payTime;
    }

    public void setPayTime(String payTime) {
        this.payTime = payTime;
    }

    public String getGoodsImagePath() {
        return goodsImagePath;
    }

    public void setGoodsImagePath(String goodsImagePath) {
        this.goodsImagePath = goodsImagePath;
    }

    public int getCartGoodsCount() {
        return cartGoodsCount;
    }

    public void setCartGoodsCount(int cartGoodsCount) {
        this.cartGoodsCount = cartGoodsCount;
    }

    public int getOrderAllCost() {
        return orderAllCost;
    }

    public void setOrderAllCost(int orderAllCost) {
        this.orderAllCost = orderAllCost;
    }

    public int getOrderAllGoodsCount() {
        return orderAllGoodsCount;
    }

    public void setOrderAllGoodsCount(int orderAllGoodsCount) {
        this.orderAllGoodsCount = orderAllGoodsCount;
    }

    public int getDeleteTag() {
        return deleteTag;
    }

    public void setDeleteTag(int deleteTag) {
        this.deleteTag = deleteTag;
    }

    public String getCreationTime() {
        return creationTime;
    }

    public void setCreationTime(String creationTime) {
        this.creationTime = creationTime;
    }

    public String getCreator() {
        return creator;
    }

    public void setCreator(String creator) {
        this.creator = creator;
    }

    public String getModificationTime() {
        return modificationTime;
    }

    public void setModificationTime(String modificationTime) {
        this.modificationTime = modificationTime;
    }

    public String getModifier() {
        return modifier;
    }

    public void setModifier(String modifier) {
        this.modifier = modifier;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }
}