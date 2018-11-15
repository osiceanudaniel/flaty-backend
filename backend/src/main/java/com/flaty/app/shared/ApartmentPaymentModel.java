package com.flaty.app.shared;

import com.flaty.app.model.association.expenses.payment.PaymentType;

import java.util.Date;

public class ApartmentPaymentModel {

    private Long apartmentId;
    private PaymentType paymentType;
    private Long boardValue;
    private String notes;
    private String referenceNo;
    private Date referenceDate;

    public Long getApartmentId() {
        return apartmentId;
    }

    public void setApartmentId(Long apartmentId) {
        this.apartmentId = apartmentId;
    }

    public PaymentType getPaymentType() {
        return paymentType;
    }

    public void setPaymentType(PaymentType paymentType) {
        this.paymentType = paymentType;
    }

    public Long getBoardValue() {
        return boardValue;
    }

    public void setBoardValue(Long boardValue) {
        this.boardValue = boardValue;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    public String getReferenceNo() {
        return referenceNo;
    }

    public void setReferenceNo(String referenceNo) {
        this.referenceNo = referenceNo;
    }

    public Date getReferenceDate() {
        return referenceDate;
    }

    public void setReferenceDate(Date referenceDate) {
        this.referenceDate = referenceDate;
    }
}
