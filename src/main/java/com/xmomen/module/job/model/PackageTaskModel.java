package com.xmomen.module.job.model;

import java.io.Serializable;
import java.util.Date;

public class PackageTaskModel implements Serializable{
	/**
     * 
     */
    private Integer id;

    /**
     * 采购编号
     */
    private String purchaseCode;

    /**
     * 采购明细ID
     */
    private Integer purchaseId;

    /**
     * 1-包装任务，2-装箱任务
     */
    private Integer jobType;

    /**
     * 0-未开始，1-包装中，2-包装完成
     */
    private Integer jobStatus;

    /**
     * 
     */
    private Integer jobUser;

    /**
     * 任务创建时间
     */
    private Date jobCreateTime;

    
    /**
     * 任务开始时间
     */
    private Date jobBeginTime;
    
    
    /**
     * 包装的产品
     */
    private Integer cdItemId;

    /**
     * 需要包装的份数
     */
    private Integer countValue;

    /**
     * 包装完成的份数
     */
    private Integer finishValue;

    private Integer noFinishValue;
    /**
     * 
     */
    private Date finishTime;

    /**
     * 任务创建人
     */
    private Integer jobCreateUser;
    
    private String itemCode;
    
    private String itemName;
    
    private String jobUserName;

	public String getItemCode() {
		return itemCode;
	}

	public void setItemCode(String itemCode) {
		this.itemCode = itemCode;
	}

	public String getItemName() {
		return itemName;
	}

	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	public String getJobUserName() {
		return jobUserName;
	}

	public void setJobUserName(String jobUserName) {
		this.jobUserName = jobUserName;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getPurchaseCode() {
		return purchaseCode;
	}

	public void setPurchaseCode(String purchaseCode) {
		this.purchaseCode = purchaseCode;
	}

	public Integer getPurchaseId() {
		return purchaseId;
	}

	public void setPurchaseId(Integer purchaseId) {
		this.purchaseId = purchaseId;
	}

	public Integer getJobType() {
		return jobType;
	}

	public void setJobType(Integer jobType) {
		this.jobType = jobType;
	}

	public Integer getJobStatus() {
		return jobStatus;
	}

	public void setJobStatus(Integer jobStatus) {
		this.jobStatus = jobStatus;
	}

	public Integer getJobUser() {
		return jobUser;
	}

	public void setJobUser(Integer jobUser) {
		this.jobUser = jobUser;
	}

	public Date getJobCreateTime() {
		return jobCreateTime;
	}

	public void setJobCreateTime(Date jobCreateTime) {
		this.jobCreateTime = jobCreateTime;
	}

	public Integer getCdItemId() {
		return cdItemId;
	}

	public void setCdItemId(Integer cdItemId) {
		this.cdItemId = cdItemId;
	}

	public Integer getCountValue() {
		return countValue;
	}

	public void setCountValue(Integer countValue) {
		this.countValue = countValue;
	}

	public Integer getFinishValue() {
		return finishValue;
	}

	public void setFinishValue(Integer finishValue) {
		this.finishValue = finishValue;
	}

	public Date getFinishTime() {
		return finishTime;
	}

	public void setFinishTime(Date finishTime) {
		this.finishTime = finishTime;
	}

	public Integer getJobCreateUser() {
		return jobCreateUser;
	}

	public void setJobCreateUser(Integer jobCreateUser) {
		this.jobCreateUser = jobCreateUser;
	}

	public Date getJobBeginTime() {
		return jobBeginTime;
	}

	public void setJobBeginTime(Date jobBeginTime) {
		this.jobBeginTime = jobBeginTime;
	}

	public Integer getNoFinishValue() {
		return noFinishValue;
	}

	public void setNoFinishValue(Integer noFinishValue) {
		this.noFinishValue = noFinishValue;
	}
    
}
