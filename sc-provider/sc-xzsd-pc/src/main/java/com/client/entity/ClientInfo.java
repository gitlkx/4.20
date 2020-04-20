package com.client.entity;

/**
 * 客户实体类
 */
public class ClientInfo {
    /**
     * 当前第几页
     */
    private int pageNum;
    /**
     * 每页显示多少条
     */
    private int pageSize;
    /**
     * 客户账号
     */
    private String userAcct;
    /**
     * 客户姓名
     */
    private String userName;
    /**
     * 客户性别
     */
    private int sex;
    /**
     * 手机号码
     */
    private String phone;
    /**
     * 邮箱
     */
    private String mail;
    /**
     * 身份证
     */
    private String idCard;
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
     * 下面是get set 函数
     */

    public int getPageNum() {
        return pageNum;
    }

    public void setPageNum(int pageNum) {
        this.pageNum = pageNum;
    }

    public int getPageSize() {
        return pageSize;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }

    public String getUserAcct() {
        return userAcct;
    }

    public void setUserAcct(String userAcct) {
        this.userAcct = userAcct;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public int getSex() {
        return sex;
    }

    public void setSex(int sex) {
        this.sex = sex;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getIdCard() {
        return idCard;
    }

    public void setIdCard(String idCard) {
        this.idCard = idCard;
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
