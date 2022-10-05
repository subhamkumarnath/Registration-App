package model;


import lombok.Data;

import java.time.LocalDate;

public class UserData {


//    Form 1 Data
    private String name;
    private LocalDate dob;
    private String email;
    private String fatherName;
    private String motherName;
    private String gender;
    private String nationality;
    private String streetAddress;
    private String city;
    private String country;
    private String telephoneHome;
    private String telephoneMobile;


//    Form 2 Data
    private String HSCInstitutionName;
    private String HSCBoardName;
    private String HSCScore;
    private String SSCInstitutionName;
    private String SSCBoardName;
    private String SSCScore;
    private String currentlyPursuing;
    private String currentEducationalInstitutionName;
    private String overallPercentage;
    private String currentBacklogs;


//    Form 3 Data
    private String passportPhotoPath;
    private String HSCMarkSheetPath;
    private String SSCMarkSheetPath;
    private String allSemesterMarkSheetsPath;


//    Getters & Setters, toString

    @Override
    public String toString() {
        return "UserData{" +
                "name='" + name + '\'' +
                ", dob=" + dob +
                ", email='" + email + '\'' +
                ", fatherName='" + fatherName + '\'' +
                ", motherName='" + motherName + '\'' +
                ", gender='" + gender + '\'' +
                ", nationality='" + nationality + '\'' +
                ", streetAddress='" + streetAddress + '\'' +
                ", city='" + city + '\'' +
                ", country='" + country + '\'' +
                ", telephoneHome='" + telephoneHome + '\'' +
                ", telephoneMobile='" + telephoneMobile + '\'' +
                ", HSCInstitutionName='" + HSCInstitutionName + '\'' +
                ", HSCBoardName='" + HSCBoardName + '\'' +
                ", HSCScore='" + HSCScore + '\'' +
                ", SSCInstitutionName='" + SSCInstitutionName + '\'' +
                ", SSCBoardName='" + SSCBoardName + '\'' +
                ", SSCScore='" + SSCScore + '\'' +
                ", currentlyPursuing='" + currentlyPursuing + '\'' +
                ", currentEducationalInstitutionName='" + currentEducationalInstitutionName + '\'' +
                ", overallPercentage='" + overallPercentage + '\'' +
                ", currentBacklogs='" + currentBacklogs + '\'' +
                ", passportPhotoPath='" + passportPhotoPath + '\'' +
                ", HSCMarkSheetPath='" + HSCMarkSheetPath + '\'' +
                ", SSCMarkSheetPath='" + SSCMarkSheetPath + '\'' +
                ", allSemesterMarkSheetsPath='" + allSemesterMarkSheetsPath + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getDob() {
        return dob;
    }

    public void setDob(LocalDate dob) {
        this.dob = dob;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getFatherName() {
        return fatherName;
    }

    public void setFatherName(String fatherName) {
        this.fatherName = fatherName;
    }

    public String getMotherName() {
        return motherName;
    }

    public void setMotherName(String motherName) {
        this.motherName = motherName;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public String getStreetAddress() {
        return streetAddress;
    }

    public void setStreetAddress(String streetAddress) {
        this.streetAddress = streetAddress;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getTelephoneHome() {
        return telephoneHome;
    }

    public void setTelephoneHome(String telephoneHome) {
        this.telephoneHome = telephoneHome;
    }

    public String getTelephoneMobile() {
        return telephoneMobile;
    }

    public void setTelephoneMobile(String telephoneMobile) {
        this.telephoneMobile = telephoneMobile;
    }

    public String getHSCInstitutionName() {
        return HSCInstitutionName;
    }

    public void setHSCInstitutionName(String HSCInstitutionName) {
        this.HSCInstitutionName = HSCInstitutionName;
    }

    public String getHSCBoardName() {
        return HSCBoardName;
    }

    public void setHSCBoardName(String HSCBoardName) {
        this.HSCBoardName = HSCBoardName;
    }

    public String getHSCScore() {
        return HSCScore;
    }

    public void setHSCScore(String HSCScore) {
        this.HSCScore = HSCScore;
    }

    public String getSSCInstitutionName() {
        return SSCInstitutionName;
    }

    public void setSSCInstitutionName(String SSCInstitutionName) {
        this.SSCInstitutionName = SSCInstitutionName;
    }

    public String getSSCBoardName() {
        return SSCBoardName;
    }

    public void setSSCBoardName(String SSCBoardName) {
        this.SSCBoardName = SSCBoardName;
    }

    public String getSSCScore() {
        return SSCScore;
    }

    public void setSSCScore(String SSCScore) {
        this.SSCScore = SSCScore;
    }

    public String getCurrentlyPursuing() {
        return currentlyPursuing;
    }

    public void setCurrentlyPursuing(String currentlyPursuing) {
        this.currentlyPursuing = currentlyPursuing;
    }

    public String getCurrentEducationalInstitutionName() {
        return currentEducationalInstitutionName;
    }

    public void setCurrentEducationalInstitutionName(String currentEducationalInstitutionName) {
        this.currentEducationalInstitutionName = currentEducationalInstitutionName;
    }

    public String getOverallPercentage() {
        return overallPercentage;
    }

    public void setOverallPercentage(String overallPercentage) {
        this.overallPercentage = overallPercentage;
    }

    public String getCurrentBacklogs() {
        return currentBacklogs;
    }

    public void setCurrentBacklogs(String currentBacklogs) {
        this.currentBacklogs = currentBacklogs;
    }

    public String getPassportPhotoPath() {
        return passportPhotoPath;
    }

    public void setPassportPhotoPath(String passportPhotoPath) {
        this.passportPhotoPath = passportPhotoPath;
    }

    public String getHSCMarkSheetPath() {
        return HSCMarkSheetPath;
    }

    public void setHSCMarkSheetPath(String HSCMarkSheetPath) {
        this.HSCMarkSheetPath = HSCMarkSheetPath;
    }

    public String getSSCMarkSheetPath() {
        return SSCMarkSheetPath;
    }

    public void setSSCMarkSheetPath(String SSCMarkSheetPath) {
        this.SSCMarkSheetPath = SSCMarkSheetPath;
    }

    public String getAllSemesterMarkSheetsPath() {
        return allSemesterMarkSheetsPath;
    }

    public void setAllSemesterMarkSheetsPath(String allSemesterMarkSheetsPath) {
        this.allSemesterMarkSheetsPath = allSemesterMarkSheetsPath;
    }
}
