package com.flaty.app.model.association.expenses;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "water_meter_reads")
public class WaterMeterRead {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "water_meter_id", referencedColumnName = "id")
    private WaterMeter watermeter;

    @Column(name = "apartment_id")
    private Long apartmentId;

    @Column(name = "year")
    private Integer year;

    @Enumerated(EnumType.STRING)
    @Column(name = "month")
    private Month month;

    @Column(name = "read_value")
    private Long readValue;

    @Column(name = "unit_value")
    private Long unitValue;

    @Column(name = "payment_board_id")
    private Long paymentBoardId;

    public Long getId() {
        return id;
    }

    public WaterMeter getWatermeter() {
        return watermeter;
    }

    public void setWatermeter(WaterMeter watermeter) {
        this.watermeter = watermeter;
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

    @Override
    public String toString() {
        return "WaterMeterRead{" +
                "id=" + id +
                ", watermeter=" + watermeter +
                ", apartmentId=" + apartmentId +
                ", year=" + year +
                ", month=" + month +
                ", readValue=" + readValue +
                ", unitValue=" + unitValue +
                ", paymentBoardId=" + paymentBoardId +
                '}';
    }
}
