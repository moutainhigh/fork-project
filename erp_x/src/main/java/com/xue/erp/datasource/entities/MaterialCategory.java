package com.xue.erp.datasource.entities;

import java.util.Date;

public class MaterialCategory {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column materialcategory.Id
     *
     * @mbggenerated
     */
    private Long id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column materialcategory.Name
     *
     * @mbggenerated
     */
    private String name;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column materialcategory.CategoryLevel
     *
     * @mbggenerated
     */
    private Short categorylevel;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column materialcategory.ParentId
     *
     * @mbggenerated
     */
    private Long parentid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column materialcategory.sort
     *
     * @mbggenerated
     */
    private String sort;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column materialcategory.status
     *
     * @mbggenerated
     */
    private String status;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column materialcategory.serial_no
     *
     * @mbggenerated
     */
    private String serialNo;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column materialcategory.remark
     *
     * @mbggenerated
     */
    private String remark;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column materialcategory.create_time
     *
     * @mbggenerated
     */
    private Date createTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column materialcategory.creator
     *
     * @mbggenerated
     */
    private Long creator;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column materialcategory.update_time
     *
     * @mbggenerated
     */
    private Date updateTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column materialcategory.updater
     *
     * @mbggenerated
     */
    private Long updater;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column materialcategory.Id
     *
     * @return the value of materialcategory.Id
     *
     * @mbggenerated
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column materialcategory.Id
     *
     * @param id the value for materialcategory.Id
     *
     * @mbggenerated
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column materialcategory.Name
     *
     * @return the value of materialcategory.Name
     *
     * @mbggenerated
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column materialcategory.Name
     *
     * @param name the value for materialcategory.Name
     *
     * @mbggenerated
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column materialcategory.CategoryLevel
     *
     * @return the value of materialcategory.CategoryLevel
     *
     * @mbggenerated
     */
    public Short getCategorylevel() {
        return categorylevel;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column materialcategory.CategoryLevel
     *
     * @param categorylevel the value for materialcategory.CategoryLevel
     *
     * @mbggenerated
     */
    public void setCategorylevel(Short categorylevel) {
        this.categorylevel = categorylevel;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column materialcategory.ParentId
     *
     * @return the value of materialcategory.ParentId
     *
     * @mbggenerated
     */
    public Long getParentid() {
        return parentid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column materialcategory.ParentId
     *
     * @param parentid the value for materialcategory.ParentId
     *
     * @mbggenerated
     */
    public void setParentid(Long parentid) {
        this.parentid = parentid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column materialcategory.sort
     *
     * @return the value of materialcategory.sort
     *
     * @mbggenerated
     */
    public String getSort() {
        return sort;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column materialcategory.sort
     *
     * @param sort the value for materialcategory.sort
     *
     * @mbggenerated
     */
    public void setSort(String sort) {
        this.sort = sort == null ? null : sort.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column materialcategory.status
     *
     * @return the value of materialcategory.status
     *
     * @mbggenerated
     */
    public String getStatus() {
        return status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column materialcategory.status
     *
     * @param status the value for materialcategory.status
     *
     * @mbggenerated
     */
    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column materialcategory.serial_no
     *
     * @return the value of materialcategory.serial_no
     *
     * @mbggenerated
     */
    public String getSerialNo() {
        return serialNo;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column materialcategory.serial_no
     *
     * @param serialNo the value for materialcategory.serial_no
     *
     * @mbggenerated
     */
    public void setSerialNo(String serialNo) {
        this.serialNo = serialNo == null ? null : serialNo.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column materialcategory.remark
     *
     * @return the value of materialcategory.remark
     *
     * @mbggenerated
     */
    public String getRemark() {
        return remark;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column materialcategory.remark
     *
     * @param remark the value for materialcategory.remark
     *
     * @mbggenerated
     */
    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column materialcategory.create_time
     *
     * @return the value of materialcategory.create_time
     *
     * @mbggenerated
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column materialcategory.create_time
     *
     * @param createTime the value for materialcategory.create_time
     *
     * @mbggenerated
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column materialcategory.creator
     *
     * @return the value of materialcategory.creator
     *
     * @mbggenerated
     */
    public Long getCreator() {
        return creator;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column materialcategory.creator
     *
     * @param creator the value for materialcategory.creator
     *
     * @mbggenerated
     */
    public void setCreator(Long creator) {
        this.creator = creator;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column materialcategory.update_time
     *
     * @return the value of materialcategory.update_time
     *
     * @mbggenerated
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column materialcategory.update_time
     *
     * @param updateTime the value for materialcategory.update_time
     *
     * @mbggenerated
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column materialcategory.updater
     *
     * @return the value of materialcategory.updater
     *
     * @mbggenerated
     */
    public Long getUpdater() {
        return updater;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column materialcategory.updater
     *
     * @param updater the value for materialcategory.updater
     *
     * @mbggenerated
     */
    public void setUpdater(Long updater) {
        this.updater = updater;
    }
}