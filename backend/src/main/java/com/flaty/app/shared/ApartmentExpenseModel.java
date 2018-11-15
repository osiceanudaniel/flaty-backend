package com.flaty.app.shared;

import com.flaty.app.model.association.expenses.ExpenseType;
import com.flaty.app.model.association.expenses.Month;

public class ApartmentExpenseModel {

    private Long associationId;
    private Long buildingId;
    private Long apartmentId;
    private Long value;
    private Integer year;
    private Month month;
    private Long paymentBoardId;
    private ExpenseType expenseType;

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

    public Month getMonth() {
        return month;
    }

    public void setMonth(Month month) {
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
}
