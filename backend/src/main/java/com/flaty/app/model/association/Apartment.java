package com.flaty.app.model.association;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "apartments")
public class Apartment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @ManyToOne
    @JoinColumn(name = "building_id", referencedColumnName = "id")
    private Building building;

    @ManyToOne
    @JoinColumn(name = "association_id", referencedColumnName = "id")
    private Association association;

    @Column(name = "number")
    private String number;

    @Column(name = "rooms")
    private Integer rooms;

    @Column(name = "persons")
    private String persons;

    @Column(name = "allocators")
    private Integer allocators;

    @Column(name = "current_balance")
    private Long currentBalance;

    @Column(name = "unique_identifier")
    private String unique_identifier;

    public Long getId() {
        return id;
    }

    public Building getBuilding() {
        return building;
    }

    public void setBuilding(Building building) {
        this.building = building;
    }

    public Association getAssociation() {
        return association;
    }

    public void setAssociation(Association association) {
        this.association = association;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public Integer getRooms() {
        return rooms;
    }

    public void setRooms(Integer rooms) {
        this.rooms = rooms;
    }

    public String getPersons() {
        return persons;
    }

    public void setPersons(String persons) {
        this.persons = persons;
    }

    public Integer getAllocators() {
        return allocators;
    }

    public void setAllocators(Integer allocators) {
        this.allocators = allocators;
    }

    public Long getCurrentBalance() {
        return currentBalance;
    }

    public void setCurrentBalance(Long currentBalance) {
        this.currentBalance = currentBalance;
    }

    public String getUnique_identifier() {
        return unique_identifier;
    }

    public void setUnique_identifier(String unique_identifier) {
        this.unique_identifier = unique_identifier;
    }

    @Override
    public String toString() {
        return "Apartment{" +
                "id=" + id +
                ", building=" + building +
                ", association=" + association +
                ", number='" + number + '\'' +
                ", rooms=" + rooms +
                ", persons='" + persons + '\'' +
                ", allocators=" + allocators +
                ", currentBalance=" + currentBalance +
                ", unique_identifier='" + unique_identifier + '\'' +
                '}';
    }
}