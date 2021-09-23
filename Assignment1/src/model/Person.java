/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.awt.Image;
import java.util.Date;

/**
 *
 * @author shashwatshrey
 */
public class Person {
    private String name;
    private String geoData;
    private int deviceIndentifier;
    private String linkedin;
    private Date DOB;
    private String ipAddress;
    private int telPhone;
    private String idNumber;
    private int faxNo;
    private int healthPlanNo;
    private String email;
    private int bankAcc;
    private String SSN;
    private int certificateNo;
    private int medicalRecordNo;
    private String vehichleNo;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGeographicData() {
        return geoData;
    }

    public void setGeographicData(String geoData) {
        this.geoData = geoData;
    }

    public int getDeviceIndentifiers() {
        return deviceIndentifier;
    }

    public void setDeviceIndentifiers(int dateIndentifier) {
        this.deviceIndentifier = deviceIndentifier;
    }

    public String getLinkedIn() {
        return linkedin;
    }

    public void setLinkedIn(String linkedin) {
        this.linkedin = linkedin;
    }

    public Date getDOB() {
        return DOB;
    }

    public void setDOB(Date DOB) {
        this.DOB = DOB;
    }

    public String getIpAddress() {
        return ipAddress;
    }

    public void setIpAddress(String ipAddress) {
        this.ipAddress = ipAddress;
    }

    public int getTelephoneNumber() {
        return telPhone;
    }

    public void setTelephoneNumber(int telPhone) {
        this.telPhone = telPhone;
    }

    public String getID() {
        return idNumber;
    }

    public void setID(String idNumber) {
        this.idNumber = idNumber;
    }

    public int getFaxNumber() {
        return faxNo;
    }

    public void setFaxNumber(int faxNo) {
        this.faxNo = faxNo;
    }

    public int getHealthBeneficiaryNumber() {
        return healthPlanNo;
    }

    public void setHealthBeneficiaryNumber(int healthPlanNo) {
        this.healthPlanNo = healthPlanNo;
    }

    public String getEmailAddress() {
        return email;
    }

    public void setEmailAddress(String email) {
        this.email = email;
    }

    public int getBankAccountNumber() {
        return bankAcc;
    }

    public void setBankAccountNumber(int bankAcc) {
        this.bankAcc = bankAcc;
    }

    public String getSSN() {
        return SSN;
    }

    public void setSSN(String SSN) {
        this.SSN = SSN;
    }

    public int getLicenseNumber() {
        return certificateNo;
    }

    public void setLicenseNumber(int certificateNo) {
        this.certificateNo = certificateNo;
    }

    public int getMedicalRecordNumber() {
        return medicalRecordNo;
    }

    public void setMedicalRecordNumber(int medicalRecordNo) {
        this.medicalRecordNo = medicalRecordNo;
    }

    public String getVehichleLicencePlate() {
        return vehichleNo;
    }

    public void setVehichleLicencePlate(String vehichleNo) {
        this.vehichleNo = vehichleNo;
    }

    public Image getPicture() {
        return photo;
    }

    public void setImage(Image photo) {
        this.photo = photo;
    }

    public Image getBiometric() {
        return biometric;
    }

    public void setBiometric(Image biometric) {
        this.biometric = biometric;
    }
    private Image photo;
    
    
    
    private Image biometric;
    
    
}
