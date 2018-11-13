package com.flaty.app.model.association.expenses;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "payment_board")
public class PaymentBoard {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "building_id")
    private Long buildingId;

    @Column(name = "association_id")
    private Long associationId;

    @Column(name = "year")
    private Integer year;

    @Column(name = "month")
    private Integer month;

    public Long getId() {
        return id;
    }

    public Long getBuildingId() {
        return buildingId;
    }

    public void setBuildingId(Long buildingId) {
        this.buildingId = buildingId;
    }

    public Long getAssociationId() {
        return associationId;
    }

    public void setAssociationId(Long associationId) {
        this.associationId = associationId;
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    public Integer getMonth() {
        return month;
    }

    public void setMonth(Integer month) {
        this.month = month;
    }

    @Override
    public String toString() {
        return "PaymentBoard{" +
                "id=" + id +
                ", buildingId=" + buildingId +
                ", associationId=" + associationId +
                ", year=" + year +
                ", month=" + month +
                '}';
    }
}
