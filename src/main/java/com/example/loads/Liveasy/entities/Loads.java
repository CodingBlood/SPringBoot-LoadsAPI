package com.example.loads.Liveasy.entities;

import com.sun.istack.NotNull;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Date;

@Entity
public class Loads {
    @Id
    @NotNull private Long loadId;
    @NotNull private Long NoOfTruck;
    @NotNull private Long Weight;
    @NotNull private String loadingPoint;
    @NotNull private String unloadingPoint;
    @NotNull private String productType;
    @NotNull private String truckType;
    private String Comment;
    @NotNull private Long shipperID;
    @NotNull private String  Date;

    public Loads(Long loadId, Long noOfTruck, Long weight, String loadingPoint, String unloadingPoint, String productType, String truckType, String comment, Long shipperID, String date) {
        this.loadId = loadId;
        NoOfTruck = noOfTruck;
        Weight = weight;
        this.loadingPoint = loadingPoint;
        this.unloadingPoint = unloadingPoint;
        this.productType = productType;
        this.truckType = truckType;
        Comment = comment;
        this.shipperID = shipperID;
        Date = date;
    }

    public Loads(){
        super();
    }

    public Long getLoadId() {
        return loadId;
    }

    public Long getNoOfTruck() {
        return NoOfTruck;
    }

    public Long getWeight() {
        return Weight;
    }

    public String getLoadingPoint() {
        return loadingPoint;
    }

    public String getUnloadingPoint() {
        return unloadingPoint;
    }

    public String getProductType() {
        return productType;
    }

    public String getTruckType() {
        return truckType;
    }

    public String getComment() {
        return Comment;
    }

    public Long getShipperID() {
        return shipperID;
    }

    public String getDate() {
        return Date;
    }

    public void setLoadId(Long loadId) {
        this.loadId = loadId;
    }

    public void setNoOfTruck(Long noOfTruck) {
        NoOfTruck = noOfTruck;
    }

    public void setWeight(Long weight) {
        Weight = weight;
    }

    public void setLoadingPoint(String loadingPoint) {
        this.loadingPoint = loadingPoint;
    }

    public void setUnloadingPoint(String unloadingPoint) {
        this.unloadingPoint = unloadingPoint;
    }

    public void setProductType(String productType) {
        this.productType = productType;
    }

    public void setTruckType(String truckType) {
        this.truckType = truckType;
    }

    public void setComment(String comment) {
        Comment = comment;
    }

    public void setShipperID(Long shipperID) {
        this.shipperID = shipperID;
    }

    public void setDate(String date) {
        Date = date;
    }

    @Override
    public String toString() {
        return "Loads{" +
                "loadId=" + loadId +
                ", NoOfTruck=" + NoOfTruck +
                ", Weight=" + Weight +
                ", loadingPoint='" + loadingPoint + '\'' +
                ", unloadingPoint='" + unloadingPoint + '\'' +
                ", productType='" + productType + '\'' +
                ", truckType='" + truckType + '\'' +
                ", Comment='" + Comment + '\'' +
                ", shipperID='" + shipperID + '\'' +
                ", Date='" + Date + '\'' +
                '}';
    }
}
