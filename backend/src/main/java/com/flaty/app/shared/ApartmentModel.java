package com.flaty.app.shared;

import com.flaty.app.model.association.Association;
import com.flaty.app.model.association.Building;

public class ApartmentModel {

    private Building building;
    private Association association;
    private String number;
    private Integer rooms;
    private Integer persons;
    private Integer allocators;
    private Long currentBallance;
    private String uniqueIdentifier;

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

    public Integer getPersons() {
        return persons;
    }

    public void setPersons(Integer persons) {
        this.persons = persons;
    }

    public Integer getAllocators() {
        return allocators;
    }

    public void setAllocators(Integer allocators) {
        this.allocators = allocators;
    }

    public Long getCurrentBallance() {
        return currentBallance;
    }

    public void setCurrentBallance(Long currentBallance) {
        this.currentBallance = currentBallance;
    }

    public String getUniqueIdentifier() {
        return uniqueIdentifier;
    }

    public void setUniqueIdentifier(String uniqueIdentifier) {
        this.uniqueIdentifier = uniqueIdentifier;
    }
}
