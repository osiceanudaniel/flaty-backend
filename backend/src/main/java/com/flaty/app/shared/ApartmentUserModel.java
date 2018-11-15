package com.flaty.app.shared;

import com.flaty.app.model.association.Apartment;
import com.flaty.app.model.management.User;

public class ApartmentUserModel {

    private User user;
    private Apartment apartment;
    private Long buildingId;

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Apartment getApartment() {
        return apartment;
    }

    public void setApartment(Apartment apartment) {
        this.apartment = apartment;
    }

    public Long getBuildingId() {
        return buildingId;
    }

    public void setBuildingId(Long buildingId) {
        this.buildingId = buildingId;
    }
}
