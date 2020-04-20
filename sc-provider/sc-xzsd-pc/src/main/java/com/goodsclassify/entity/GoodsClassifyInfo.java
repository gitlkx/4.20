package com.goodsclassify.entity;

/**
 * 商品分类实体类
 * @Description goodsClassify
 * @Author kaoxin
 * @Date 2020-04-13
 */
public class GoodsClassifyInfo {
    /**
     * 商品分类id
     */
    private String classifyId;
    /**
     * 商品分类名称
     */
    private String classifyName;
    /**
     * 商品分类备注
     */
    private String classifyComment;
    /**
     * 父级编号
     */
    private String classifyParent;
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


    public String getClassifyId() {
        return classifyId;
    }

    public void setClassifyId(String classifyId) {
        this.classifyId = classifyId;
    }


    public String getClassifyName() {
        return classifyName;
    }

    public void setClassifyName(String classifyName) {
        this.classifyName = classifyName;
    }

    public String getClassifyComment() {
        return classifyComment;
    }

    public void setClassifyComment(String classifyComment) {
        this.classifyComment = classifyComment;
    }

    public String getClassifyParent() {
        return classifyParent;
    }

    public void setClassifyParent(String classifyParent) {
        this.classifyParent = classifyParent;
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
