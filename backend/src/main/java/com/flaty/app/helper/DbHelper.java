package com.flaty.app.helper;

import com.flaty.app.model.association.Apartment;
import com.flaty.app.model.association.ApartmentUser;
import com.flaty.app.model.association.Association;
import com.flaty.app.model.association.AssociationUser;
import com.flaty.app.model.association.Building;
import com.flaty.app.model.association.communications.Announce;
import com.flaty.app.model.association.communications.BuildingObservation;
import com.flaty.app.model.association.expenses.ApartmentExpense;
import com.flaty.app.model.association.expenses.PaymentBoard;
import com.flaty.app.model.association.expenses.WaterMeter;
import com.flaty.app.model.association.expenses.WaterMeterRead;
import com.flaty.app.model.association.expenses.payment.ApartmentPayment;
import com.flaty.app.model.management.User;
import com.flaty.app.shared.AnnounceModel;
import com.flaty.app.shared.ApartmentExpenseModel;
import com.flaty.app.shared.ApartmentModel;
import com.flaty.app.shared.ApartmentPaymentModel;
import com.flaty.app.shared.ApartmentUserModel;
import com.flaty.app.shared.AssociationModel;
import com.flaty.app.shared.AssociationUserModel;
import com.flaty.app.shared.BuildingModel;
import com.flaty.app.shared.BuildingObservationModel;
import com.flaty.app.shared.PaymentBoardModel;
import com.flaty.app.shared.UserModel;
import com.flaty.app.shared.WaterMeterModel;
import com.flaty.app.shared.WaterMeterReadModel;

public class DbHelper {

    private DbHelper(){
        // Empty private constructor
    }

    public static Announce createAnnounceEntity(AnnounceModel announceModel) {
        Announce announceEntity = new Announce();

        announceEntity.setApartmentId(announceModel.getApartmentId());
        announceEntity.setContent(announceModel.getContent());
        announceEntity.setName(announceModel.getName());

        return announceEntity;
    }

    public static ApartmentExpense createApartmentExpenseEntity(
            ApartmentExpenseModel apartmentExpenseModel) {
        ApartmentExpense apartmentExpenseEntity = new ApartmentExpense();

        apartmentExpenseEntity.setApartmentId(apartmentExpenseModel.getApartmentId());
        apartmentExpenseEntity.setAssociationId(apartmentExpenseModel.getAssociationId());
        apartmentExpenseEntity.setBuildingId(apartmentExpenseModel.getBuildingId());
        apartmentExpenseEntity.setExpenseType(apartmentExpenseModel.getExpenseType());
        apartmentExpenseEntity.setMonth(apartmentExpenseModel.getMonth());
        apartmentExpenseEntity.setPaymentBoardId(apartmentExpenseModel.getPaymentBoardId());
        apartmentExpenseEntity.setValue(apartmentExpenseModel.getValue());
        apartmentExpenseEntity.setYear(apartmentExpenseModel.getYear());

        return apartmentExpenseEntity;
    }

    public static Apartment createApartmentEntity(ApartmentModel apartmentModel) {
        Apartment apartmentEntity = new Apartment();

        apartmentEntity.setAllocators(apartmentModel.getAllocators());
        apartmentEntity.setAssociation(apartmentModel.getAssociation());
        apartmentEntity.setBuilding(apartmentModel.getBuilding());
        apartmentEntity.setCurrentBalance(apartmentModel.getCurrentBallance());
        apartmentEntity.setNumber(apartmentModel.getNumber());
        apartmentEntity.setPersons(apartmentModel.getPersons());
        apartmentEntity.setRooms(apartmentModel.getRooms());
        apartmentEntity.setUniqueIdentifier(apartmentModel.getUniqueIdentifier());

        return apartmentEntity;
    }

    public static ApartmentPayment createApartmentPaymentEntity(
            ApartmentPaymentModel apartmentPaymentModel) {
        ApartmentPayment apartmentPaymentEntity = new ApartmentPayment();

        apartmentPaymentEntity.setApartmentId(apartmentPaymentModel.getApartmentId());
        apartmentPaymentEntity.setBoardValue(apartmentPaymentModel.getBoardValue());
        apartmentPaymentEntity.setNotes(apartmentPaymentModel.getNotes());
        apartmentPaymentEntity.setPaymentType(apartmentPaymentModel.getPaymentType());
        apartmentPaymentEntity.setReferenceDate(apartmentPaymentModel.getReferenceDate());
        apartmentPaymentEntity.setReferenceNo(apartmentPaymentModel.getReferenceNo());

        return apartmentPaymentEntity;
    }

    public static ApartmentUser createApartmentUserEntity(ApartmentUserModel apartmentUserModel) {
        ApartmentUser apartmentUserEntity = new ApartmentUser();

        apartmentUserEntity.setApartment(apartmentUserModel.getApartment());
        apartmentUserEntity.setBuildingId(apartmentUserModel.getBuildingId());
        apartmentUserEntity.setUser(apartmentUserModel.getUser());

        return apartmentUserEntity;
    }

    public static Association createAssociationEntity(AssociationModel associationModel) {
        Association associationEntity = new Association();

        associationEntity.setApartments(associationModel.getApartments());
        associationEntity.setBankAccount(associationModel.getBankAccount());
        associationEntity.setBuildings(associationModel.getBuildings());
        associationEntity.setCui(associationModel.getCui());
        associationEntity.setName(associationModel.getName());
        associationEntity.setRegistrationNo(associationModel.getRegistrationNo());
        associationEntity.setUniqueIdentifier(associationModel.getUniqueIdentifier());

        return associationEntity;
    }

    public static AssociationUser createAssociationUserEntity(
            AssociationUserModel associationUserModel) {
        AssociationUser associationUserEntity = new AssociationUser();

        associationUserEntity.setAssociation(associationUserModel.getAssociation());
        associationUserEntity.setUser(associationUserModel.getUser());

        return associationUserEntity;
    }

    public static Building createBuildingEntity(BuildingModel buildingModel) {
        Building buildingEntity = new Building();

        buildingEntity.setAddress(buildingModel.getAddress());
        buildingEntity.setAssociation(buildingModel.getAssociation());
        buildingEntity.setLat(buildingModel.getLatitude());
        buildingEntity.setLng(buildingModel.getLongitude());
        buildingEntity.setName(buildingModel.getName());

        return buildingEntity;
    }

    public static BuildingObservation createBuildingObservationEntity(
            BuildingObservationModel buildingObservationModel) {
        BuildingObservation buildingObservationEntity = new BuildingObservation();

        buildingObservationEntity.setApartmentId(buildingObservationModel.getApartmentId());
        buildingObservationEntity.setAssociationId(buildingObservationModel.getAssociationId());
        buildingObservationEntity.setTitle(buildingObservationModel.getTitle());
        buildingObservationEntity.setObservation(buildingObservationModel.getObservation());

        return buildingObservationEntity;
    }

    public static PaymentBoard createPaymentBoardEntity(PaymentBoardModel paymentBoardModel) {
        PaymentBoard paymentBoardEntity = new PaymentBoard();

        paymentBoardEntity.setAssociationId(paymentBoardModel.getAssociationId());
        paymentBoardEntity.setBuildingId(paymentBoardModel.getBuildingId());
        paymentBoardEntity.setMonth(paymentBoardModel.getMonth());
        paymentBoardEntity.setYear(paymentBoardModel.getYear());

        return paymentBoardEntity;
    }

    public static User createUserEntity(UserModel userModel) {
        User userEntity = new User();

        userEntity.setCreationDate(userModel.getCreationDate());
        userEntity.setEmail(userModel.getEmail());
        userEntity.setName(userModel.getName());
        userEntity.setPassword(userModel.getPassword());
        userEntity.setUserType(userModel.getUserType());

        return userEntity;
    }

    public static WaterMeter createWaterMeterEntity(WaterMeterModel waterMeterModel) {
        WaterMeter waterMeterEntity = new WaterMeter();

        waterMeterEntity.setApartmentId(waterMeterModel.getApartmentId());
        waterMeterEntity.setName(waterMeterModel.getName());
        waterMeterEntity.setWaterMeterType(waterMeterModel.getWaterMeterType());

        return waterMeterEntity;
    }

    public static WaterMeterRead createWaterMeterReadEntity(
            WaterMeterReadModel waterMeterReadModel) {
        WaterMeterRead waterMeterReadEntity = new WaterMeterRead();

        waterMeterReadEntity.setApartmentId(waterMeterReadModel.getApartmentId());
        waterMeterReadEntity.setMonth(waterMeterReadModel.getMonth());
        waterMeterReadEntity.setPaymentBoardId(waterMeterReadModel.getPaymentBoardId());
        waterMeterReadEntity.setReadValue(waterMeterReadModel.getReadValue());
        waterMeterReadEntity.setUnitValue(waterMeterReadModel.getUnitValue());
        waterMeterReadEntity.setWatermeter(waterMeterReadModel.getWaterMeter());
        waterMeterReadEntity.setYear(waterMeterReadModel.getYear());

        return waterMeterReadEntity;
    }
}
