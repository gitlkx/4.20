package com.slideshowhome.entity;
/**
 * 首页轮播图实体类
 * @Description slideshowhome
 * @Author kaoxin
 * @Date 2020-04-14
 */
public class SlideshowHomeInfo {
    /**
     * 页码
     */
    private int pageSize;
    /**
     * 页数
     */
    private int pageNum;
    /**
     * 首页轮播图编号
     */
    private String slideshowId;
    /**
     * 轮播图排序
     */
    private String slideshowNum;
    /**
     * 轮播图图片路径
     */
    private String imagePath;
    /**
     * 轮播图有效期启
     */
    private String startTime;
    /**
     * 轮播图有效期止
     */
    private String endTime;
    /**
     * 商品编号
     */
    private String goodsId;
    /**
     * 启用状态
     */
    private int slideshowStateId;
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
    private int version;
    /**
     * 删除标记0未删除1已删除
     */
    private int deleteTag;

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
    public String getSlideshowId() {
        return slideshowId;
    }

    public void setSlideshowId(String slideshowId) {
        this.slideshowId = slideshowId;
    }

    public String getSlideshowNum() {
        return slideshowNum;
    }

    public void setSlideshowNum(String slideshowNum) {
        this.slideshowNum = slideshowNum;
    }

    public String getImagePath() {
        return imagePath;
    }

    public void setImagePath(String imagePath) {
        this.imagePath = imagePath;
    }

    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    public String getGoodsId() {
        return goodsId;
    }

    public void setGoodsId(String goodsId) {
        this.goodsId = goodsId;
    }

    public int getSlideshowStateId() {
        return slideshowStateId;
    }

    public void setSlideshowStateId(int slideshowStateId) {
        this.slideshowStateId = slideshowStateId;
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

    public int getVersion() {
        return version;
    }

    public void setVersion(int version) {
        this.version = version;
    }

    public int getDeleteTag() {
        return deleteTag;
    }

    public void setDeleteTag(int deleteTag) {
        this.deleteTag = deleteTag;
    }
}
