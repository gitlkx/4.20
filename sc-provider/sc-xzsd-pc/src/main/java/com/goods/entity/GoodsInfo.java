package com.goods.entity;
import java.util.Date;
/**
 * 商品实体类
 * @Description goods
 * @Author kaoxin
 * @Date 2020-03-26
 */
public class GoodsInfo {
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
     * 书名
     */
    private String goodsName;
    /**
     * 商品成本价
     */
    private String goodsOriginalCost;
    /**
     * 商品售价
     */
    private String goodsPrice;
    /**
     * 销售量
     */
    private String goodsSales;
    /**
     * 一级分类
     */
    private String oneClassifyId;
    /**
     * 二级分类
     */
    private String twoClassifyId;
    /**
     * 广告词
     */
    private String goodsAdvertise;
    /**
     * 商品介绍
     */
    private String goodsDescribe;
    /**
     * 作者
     */
    private String goodsAuthor;
    /**
     * 商品状态0在售1已下架2未发布
     */
    private int goodsStateId;
    /**
     * 出版社
     */
    private String goodsPress;
    /**
     * ins书号
     */
    private String isbn;
    /**
     * 商家姓名
     */
    private String supplierName;
    /**
     * 库存
     */
    private int goodsInventory;
    /**
     * 删除标记0未删除1已删除
     */
    private int idDelete;
    /**
     * 创建时间
     */
    private Date creationTime;
    /**
     * 创建人
     */
    private String creator;
    /**
     * 修改时间
     */
    private Date modificationTime;
    /**
     * 修改人
     */
    private String modifier;
    /**
     * 版本号
     */
    private String version;
    /**
     * 图片地址
     */
    private String goodsImagePath;

    /**
     * 以下是构造方法
     * @return
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

    public String getGoodsName() {
        return goodsName;
    }

    public void setGoodsName(String goodsName) {
        this.goodsName = goodsName;
    }

    public String getGoodsOriginalCost() {
        return goodsOriginalCost;
    }

    public void setGoodsOriginalCost(String goodsOriginalCost) {
        this.goodsOriginalCost = goodsOriginalCost;
    }

    public String getGoodsPrice() {
        return goodsPrice;
    }

    public void setGoodsPrice(String goodsPrice) {
        this.goodsPrice = goodsPrice;
    }

    public String getGoodsSales() {
        return goodsSales;
    }

    public void setGoodsSales(String goodsSales) {
        this.goodsSales = goodsSales;
    }

    public String getOneClassifyId() {
        return oneClassifyId;
    }

    public void setOneClassifyId(String oneClassifyId) {
        this.oneClassifyId = oneClassifyId;
    }

    public String getTwoClassifyId() {
        return twoClassifyId;
    }

    public void setTwoClassifyId(String twoClassifyId) {
        this.twoClassifyId = twoClassifyId;
    }

    public String getGoodsAdvertise() {
        return goodsAdvertise;
    }

    public void setGoodsAdvertise(String goodsAdvertise) {
        this.goodsAdvertise = goodsAdvertise;
    }

    public String getGoodsDescribe() {
        return goodsDescribe;
    }

    public void setGoodsDescribe(String goodsDescribe) {
        this.goodsDescribe = goodsDescribe;
    }

    public String getGoodsAuthor() {
        return goodsAuthor;
    }

    public void setGoodsAuthor(String goodsAuthor) {
        this.goodsAuthor = goodsAuthor;
    }

    public int getGoodsStateId() {
        return goodsStateId;
    }

    public void setGoodsStateId(int goodsStateId) {
        this.goodsStateId = goodsStateId;
    }

    public String getGoodsPress() {
        return goodsPress;
    }

    public void setGoodsPress(String goodsPress) {
        this.goodsPress = goodsPress;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getSupplierName() {
        return supplierName;
    }

    public void setSupplierName(String supplierName) {
        this.supplierName = supplierName;
    }

    public int getGoodsInventory() {
        return goodsInventory;
    }

    public void setGoodsInventory(int goodsInventory) {
        this.goodsInventory = goodsInventory;
    }

    public int getIdDelete() {
        return idDelete;
    }

    public void setIdDelete(int idDelete) {
        this.idDelete = idDelete;
    }

    public Date getCreationTime() {
        return creationTime;
    }

    public void setCreationTime(Date creationTime) {
        this.creationTime = creationTime;
    }

    public String getCreator() {
        return creator;
    }

    public void setCreator(String creator) {
        this.creator = creator;
    }

    public Date getModificationTime() {
        return modificationTime;
    }

    public void setModificationTime(Date modificationTime) {
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

    public String getGoodsImagePath() {
        return goodsImagePath;
    }

    public void setGoodsImagePath(String goodsImagePath) {
        this.goodsImagePath = goodsImagePath;
    }
}