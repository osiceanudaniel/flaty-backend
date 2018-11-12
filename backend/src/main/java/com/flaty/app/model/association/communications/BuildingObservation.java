package com.flaty.app.model.association.communications;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "building_observations")
public class BuildingObservation {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "apartment_id")
    private Long apartmentId;

    @Column(name = "association_id")
    private Long associationId;

    @Column(name = "title")
    private String title;

    @Column(name = "observations")
    private String observations;

    public Long getId() {
        return id;
    }

    public Long getApartmentId() {
        return apartmentId;
    }

    public void setApartmentId(Long apartmentId) {
        this.apartmentId = apartmentId;
    }

    public Long getAssociationId() {
        return associationId;
    }

    public void setAssociationId(Long associationId) {
        this.associationId = associationId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getObservations() {
        return observations;
    }

    public void setObservations(String observations) {
        this.observations = observations;
    }

    @Override
    public String toString() {
        return "BuildingObservation{" +
                "id=" + id +
                ", apartmentId=" + apartmentId +
                ", associationId=" + associationId +
                ", title='" + title + '\'' +
                ", observations='" + observations + '\'' +
                '}';
    }
}
