package com.flaty.app.shared;

import com.flaty.app.model.association.expenses.Month;
import com.flaty.app.model.association.expenses.WaterMeter;

public class WaterMeterReadModel {

    private WaterMeter waterMeter;
    private Long apartmentId;
    private Integer year;
    private Month month;
    private Long readValue;
    private Long unitValue;
    private Long paymentBoardId;

    public WaterMeter getWaterMeter() {
        return waterMeter;
    }

    public void setWaterMeter(WaterMeter waterMeter) {
        this.waterMeter = waterMeter;
    }

    public Long getApartmentId() {
        return apartmentId;
    }

    public void setApartmentId(Long apartmentId) {
        this.apartmentId = apartmentId;
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    public Month getMonth() {
        return month;
    }

    public void setMonth(Month month) {
        this.month = month;
    }

    public Long getReadValue() {
        return readValue;
    }

    public void setReadValue(Long readValue) {
        this.readValue = readValue;
    }

    public Long getUnitValue() {
        return unitValue;
    }

    public void setUnitValue(Long unitValue) {
        this.unitValue = unitValue;
    }

    public Long getPaymentBoardId() {
        return paymentBoardId;
    }

    public void setPaymentBoardId(Long paymentBoardId) {
        this.paymentBoardId = paymentBoardId;
    }
}
