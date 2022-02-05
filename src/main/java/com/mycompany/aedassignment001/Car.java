/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.aedassignment001;

/**
 *
 * @author gaurav
 */
public class Car {
    private String brand;
    private String model;
    private String color;
    private int year;
    private int engineNo;
    private String seatsNumber;
    private String licensePlates;
    private String ownerName;
    private long ownerTelephoneNumbers;
    private String ownerEmailAddresses;
    private String ownerDriverlicense;
    private String ownerSocialSecurityNumber;
    private String ownerAddress;
    private int warrantyYear;
    private String serviceRecords []= new String[3] ;
    private String Photo;

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getEngineNo() {
        return engineNo;
    }

    public void setEngineNo(int engineNo) {
        this.engineNo = engineNo;
    }

    public String getSeatsNumber() {
        return seatsNumber;
    }

    public void setSeatsNumber(String seatsNumber) {
        this.seatsNumber = seatsNumber;
    }

    public String getLicensePlates() {
        return licensePlates;
    }

    public void setLicensePlates(String licensePlates) {
        this.licensePlates = licensePlates;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public long getOwnerTelephoneNumbers() {
        return ownerTelephoneNumbers;
    }

    public void setOwnerTelephoneNumbers(long ownerTelephoneNumbers) {
        this.ownerTelephoneNumbers = ownerTelephoneNumbers;
    }

    public String getOwnerEmailAddresses() {
        return ownerEmailAddresses;
    }

    public void setOwnerEmailAddresses(String ownerEmailAddresses) {
        this.ownerEmailAddresses = ownerEmailAddresses;
    }

    public String getOwnerDriverlicense() {
        return ownerDriverlicense;
    }

    public void setOwnerDriverlicense(String ownerDriverlicense) {
        this.ownerDriverlicense = ownerDriverlicense;
    }

    public String getOwnerSocialSecurityNumber() {
        return ownerSocialSecurityNumber;
    }

    public void setOwnerSocialSecurityNumber(String ownerSocialSecurityNumber) {
        this.ownerSocialSecurityNumber = ownerSocialSecurityNumber;
    }

    public String getOwnerAddress() {
        return ownerAddress;
    }

    public void setOwnerAddress(String ownerAddress) {
        this.ownerAddress = ownerAddress;
    }

    public int getWarrantyYear() {
        return warrantyYear;
    }

    public void setWarrantyYear(int warrantyYear) {
        this.warrantyYear = warrantyYear;
    }

    public String[] getServiceRecords() {
        return serviceRecords;
    }

    public void setServiceRecords(String[] serviceRecords) {
        this.serviceRecords = serviceRecords;
    }

    public String getPhoto() {
        return Photo;
    }

    public void setPhoto(String Photo) {
        this.Photo = Photo;
    }
    
}

