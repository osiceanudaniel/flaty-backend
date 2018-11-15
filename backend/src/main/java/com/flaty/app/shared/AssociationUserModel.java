package com.flaty.app.shared;

import com.flaty.app.model.association.Association;
import com.flaty.app.model.management.User;

public class AssociationUserModel {

    private User user;
    private Association association;

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Association getAssociation() {
        return association;
    }

    public void setAssociation(Association association) {
        this.association = association;
    }
}
