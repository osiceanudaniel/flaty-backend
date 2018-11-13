package com.flaty.app.model.association.expenses;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "water_meter")
public class WaterMeter {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "apartment_id")
    private Long apartmentId;

    @Column(name = "name")
    private String name;

    @Enumerated(EnumType.STRING)
    @Column(name = "water_meter_type")
    private WaterMeterType waterMeterType;

    public Long getId() {
        return id;
    }

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

    @Override
    public String toString() {
        return "WaterMeter{" +
                "id=" + id +
                ", apartmentId=" + apartmentId +
                ", name='" + name + '\'' +
                ", waterMeterType=" + waterMeterType +
                '}';
    }
}
