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
@Table(name = "apartment_expenses")
public class ApartmentExpense {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "association_id")
    private Long associationId;

    @Column(name = "building_id")
    private Long buildingId;

    @Column(name = "apartment_id")
    private Long apartmentId;

    @Column(name = "value")
    private Long value;

    @Column(name = "year")
    private Integer year;

    @Column(name = "month")
    private Integer month;

    @Column(name = "payment_board_id")
    private Long paymentBoardId;

    @Enumerated(EnumType.STRING)
    @Column(name = "expense_type")
    private ExpenseType expenseType;

    public Long getId() {
        return id;
    }

    public Long getAssociationId() {
        return associationId;
    }

    public void setAssociationId(Long associationId) {
        this.associationId = associationId;
    }

    public Long getBuildingId() {
        return buildingId;
    }

    public void setBuildingId(Long buildingId) {
        this.buildingId = buildingId;
    }

    public Long getApartmentId() {
        return apartmentId;
    }

    public void setApartmentId(Long apartmentId) {
        this.apartmentId = apartmentId;
    }

    public Long getValue() {
        return value;
    }

    public void setValue(Long value) {
        this.value = value;
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

    public Long getPaymentBoardId() {
        return paymentBoardId;
    }

    public void setPaymentBoardId(Long paymentBoardId) {
        this.paymentBoardId = paymentBoardId;
    }

    public ExpenseType getExpenseType() {
        return expenseType;
    }

    public void setExpenseType(ExpenseType expenseType) {
        this.expenseType = expenseType;
    }

    @Override
    public String toString() {
        return "ApartmentExpense{" +
                "id=" + id +
                ", associationId=" + associationId +
                ", buildingId=" + buildingId +
                ", apartmentId=" + apartmentId +
                ", value=" + value +
                ", year=" + year +
                ", month=" + month +
                ", paymentBoardId=" + paymentBoardId +
                ", expenseType=" + expenseType +
                '}';
    }
}
