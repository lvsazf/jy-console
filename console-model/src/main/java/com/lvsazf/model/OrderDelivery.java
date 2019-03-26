package com.lvsazf.model;

import com.lvsazf.model.base.BaseModel;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class OrderDelivery extends BaseModel implements Serializable {
    private Long deliveryId;

    private Long deliveryNo;

    private Integer deliveryStatus;

    private String thirdDeliveryNo;

    private String licensePlate;

    private String deliveryPerson;

    private String deliveryPersonPhone;

    private Long createTime;

    private Long deliveryTime;

    private BigDecimal simpleSpec;

    private String isDelete;

    private Long stockId;

    private String deliveryName;

    private Integer printTimes;

    private Long deliveryPersonId;

    private Date updateTime;

    private Date finishTime;

    private Byte finishStatus;

    private static final long serialVersionUID = 1L;

    public Long getDeliveryId() {
        return deliveryId;
    }

    public void setDeliveryId(Long deliveryId) {
        this.deliveryId = deliveryId;
    }

    public Long getDeliveryNo() {
        return deliveryNo;
    }

    public void setDeliveryNo(Long deliveryNo) {
        this.deliveryNo = deliveryNo;
    }

    public Integer getDeliveryStatus() {
        return deliveryStatus;
    }

    public void setDeliveryStatus(Integer deliveryStatus) {
        this.deliveryStatus = deliveryStatus;
    }

    public String getThirdDeliveryNo() {
        return thirdDeliveryNo;
    }

    public void setThirdDeliveryNo(String thirdDeliveryNo) {
        this.thirdDeliveryNo = thirdDeliveryNo == null ? null : thirdDeliveryNo.trim();
    }

    public String getLicensePlate() {
        return licensePlate;
    }

    public void setLicensePlate(String licensePlate) {
        this.licensePlate = licensePlate == null ? null : licensePlate.trim();
    }

    public String getDeliveryPerson() {
        return deliveryPerson;
    }

    public void setDeliveryPerson(String deliveryPerson) {
        this.deliveryPerson = deliveryPerson == null ? null : deliveryPerson.trim();
    }

    public String getDeliveryPersonPhone() {
        return deliveryPersonPhone;
    }

    public void setDeliveryPersonPhone(String deliveryPersonPhone) {
        this.deliveryPersonPhone = deliveryPersonPhone == null ? null : deliveryPersonPhone.trim();
    }

    public Long getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Long createTime) {
        this.createTime = createTime;
    }

    public Long getDeliveryTime() {
        return deliveryTime;
    }

    public void setDeliveryTime(Long deliveryTime) {
        this.deliveryTime = deliveryTime;
    }

    public BigDecimal getSimpleSpec() {
        return simpleSpec;
    }

    public void setSimpleSpec(BigDecimal simpleSpec) {
        this.simpleSpec = simpleSpec;
    }

    public String getIsDelete() {
        return isDelete;
    }

    public void setIsDelete(String isDelete) {
        this.isDelete = isDelete == null ? null : isDelete.trim();
    }

    public Long getStockId() {
        return stockId;
    }

    public void setStockId(Long stockId) {
        this.stockId = stockId;
    }

    public String getDeliveryName() {
        return deliveryName;
    }

    public void setDeliveryName(String deliveryName) {
        this.deliveryName = deliveryName == null ? null : deliveryName.trim();
    }

    public Integer getPrintTimes() {
        return printTimes;
    }

    public void setPrintTimes(Integer printTimes) {
        this.printTimes = printTimes;
    }

    public Long getDeliveryPersonId() {
        return deliveryPersonId;
    }

    public void setDeliveryPersonId(Long deliveryPersonId) {
        this.deliveryPersonId = deliveryPersonId;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public Date getFinishTime() {
        return finishTime;
    }

    public void setFinishTime(Date finishTime) {
        this.finishTime = finishTime;
    }

    public Byte getFinishStatus() {
        return finishStatus;
    }

    public void setFinishStatus(Byte finishStatus) {
        this.finishStatus = finishStatus;
    }

    @Override
    public String toString() {
        return "OrderDelivery{" +
                "deliveryId=" + deliveryId +
                ", deliveryNo=" + deliveryNo +
                ", deliveryStatus=" + deliveryStatus +
                ", thirdDeliveryNo='" + thirdDeliveryNo + '\'' +
                ", licensePlate='" + licensePlate + '\'' +
                ", deliveryPerson='" + deliveryPerson + '\'' +
                ", deliveryPersonPhone='" + deliveryPersonPhone + '\'' +
                ", createTime=" + createTime +
                ", deliveryTime=" + deliveryTime +
                ", simpleSpec=" + simpleSpec +
                ", isDelete='" + isDelete + '\'' +
                ", stockId=" + stockId +
                ", deliveryName='" + deliveryName + '\'' +
                ", printTimes=" + printTimes +
                ", deliveryPersonId=" + deliveryPersonId +
                ", updateTime=" + updateTime +
                ", finishTime=" + finishTime +
                ", finishStatus=" + finishStatus +
                '}';
    }
}