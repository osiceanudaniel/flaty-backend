package com.flaty.app.model.association.expenses.payment;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Entity
@Table(name = "apartment_payment")
public class ApartmentPayment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "apartment_id")
    private Long apartmentId;

    @Enumerated(EnumType.STRING)
    @Column(name = "payment_type")
    private PaymentType paymentType;

    @Column(name = "board_value")
    private Long boardValue;

    @Column(name = "notes")
    private String notes;

    @Column(name = "reference_no")
    private String referenceNo;

    @Column(name = "reference_date")
    private Date referenceDate;

    public Long getId() {
        return id;
    }

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

    @Override
    public String toString() {
        return "ApartmentPayment{" +
                "id=" + id +
                ", apartmentId=" + apartmentId +
                ", paymentType=" + paymentType +
                ", boardValue=" + boardValue +
                ", notes='" + notes + '\'' +
                ", referenceNo='" + referenceNo + '\'' +
                ", referenceDate=" + referenceDate +
                '}';
    }
}
