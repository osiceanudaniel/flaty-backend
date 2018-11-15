package com.flaty.app.shared;

import com.flaty.app.model.association.expenses.WaterMeterType;

public class WaterMeterModel {

    private Long apartmentId;
    private String name;
    private WaterMeterType waterMeterType;

    public Long getApartmentId() {
        return apartmentId;
    }

    public void setApartmentId(Long apartmentId) {
        this.apartmentId = apartmentId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public WaterMeterType getWaterMeterType() {
        return waterMeterType;
    }

    public void setWaterMeterType(WaterMeterType waterMeterType) {
        this.waterMeterType = waterMeterType;
    }
}
