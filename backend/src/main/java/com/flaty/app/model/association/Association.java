package com.flaty.app.model.association;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.util.List;

@Entity
@Table(name = "associations")
public class Association {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "cui")
    private String cui;

    @Column(name = "registration_no")
    private String registrationNo;

    @Column(name = "name")
    private String name;

    @Column(name = "unique_identifier")
    private String uniqueIdentifier;

    @Column(name = "bank_account")
    private String bankAccount;

    @OneToMany(targetEntity = Apartment.class, mappedBy = "association")
    private List<Apartment> apartments;

    @OneToMany(targetEntity = Building.class, mappedBy = "association")
    private List<Building> buildings;

    public Long getId() {
        return id;
    }

    public String getCui() {
        return cui;
    }

    public void setCui(String cui) {
        this.cui = cui;
    }

    public String getRegistrationNo() {
        return registrationNo;
    }

    public void setRegistrationNo(String registrationNo) {
        this.registrationNo = registrationNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUniqueIdentifier() {
        return uniqueIdentifier;
    }

    public void setUniqueIdentifier(String uniqueIdentifier) {
        this.uniqueIdentifier = uniqueIdentifier;
    }

    public String getBankAccount() {
        return bankAccount;
    }

    public void setBankAccount(String bankAccount) {
        this.bankAccount = bankAccount;
    }

    public List<Apartment> getApartments() {
        return apartments;
    }

    public void setApartments(List<Apartment> apartments) {
        this.apartments = apartments;
    }

    public List<Building> getBuildings() {
        return buildings;
    }

    public void setBuildings(List<Building> buildings) {
        this.buildings = buildings;
    }

    @Override
    public String toString() {
        return "Association{" +
                "id=" + id +
                ", cui='" + cui + '\'' +
                ", registrationNo='" + registrationNo + '\'' +
                ", name='" + name + '\'' +
                ", uniqueIdentifier='" + uniqueIdentifier + '\'' +
                ", bankAccount='" + bankAccount + '\'' +
                ", apartments=" + apartments +
                ", buildings=" + buildings +
                '}';
    }
}
