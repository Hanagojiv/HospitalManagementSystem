/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hsmmodel;

/**
 *
 * @author prathamesh
 */
public class Encounter {

    public String getPatientID() {
        return PatientID;
    }

    public void setPatientID(String PatientID) {
        this.PatientID = PatientID;
    }

    public String getPatientName() {
        return PatientName;
    }

    public void setPatientName(String PatientName) {
        this.PatientName = PatientName;
    }

    public int getPatientAge() {
        return PatientAge;
    }

    public void setPatientAge(int PatientAge) {
        this.PatientAge = PatientAge;
    }

    public String getGender() {
        return Gender;
    }

    public void setGender(String PatientGender) {
        this.Gender = PatientGender;
    }

    public String getDate() {
        return Date;
    }

    public void setDate(String Date) {
        this.Date = Date;
    }

    public String getPatientContact() {
        return PatientContact;
    }

    public void setPatientContact(String PatientContact) {
        this.PatientContact = PatientContact;
    }

    public String getPatientEmail() {
        return PatientEmail;
    }

    public void setPatientEmail(String PatientEmail) {
        this.PatientEmail = PatientEmail;
    }

    public int getPatientHeight() {
        return PatientHeight;
    }

    public void setPatientHeight(int PatientHeight) {
        this.PatientHeight = PatientHeight;
    }

    public int getPatientWeight() {
        return PatientWeight;
    }

    public void setPatientWeight(int PatientWeight) {
        this.PatientWeight = PatientWeight;
    }

    public String getBloodType() {
        return BloodType;
    }

    public void setBloodType(String PatientBloodType) {
        this.BloodType = PatientBloodType;
    }

    public int getDocID() {
        return DocID;
    }

    public void setDocID(int DocID) {
        this.DocID = DocID;
    }

    public String getDocName() {
        return DocName;
    }

    public void setDocName(String DocName) {
        this.DocName = DocName;
    }

    public int getHospID() {
        return HospID;
    }

    public void setHospID(int HospID) {
        this.HospID = HospID;
    }

    public String getHospName() {
        return HospName;
    }

    public void setHospName(String HospName) {
        this.HospName = HospName;
    }


    public int getTemprature() {
        return Temprature;
    }

    public void setTemprature(int Temprature) {
        this.Temprature = Temprature;
    }

    public int getPulseRate() {
        return PulseRate;
    }

    public void setPulseRate(int PulseRate) {
        this.PulseRate = PulseRate;
    }

    
    private String PatientID;
    private String PatientName;
    private int PatientAge;
    private String Gender;
    private String Date;
    private String PatientContact;
    private String PatientEmail;
    private int PatientHeight;
    private int PatientWeight;
    private String BloodType;
    private int DocID;
    private String DocName;
    private int HospID;
    private String HospName;
    private String BloodPressure;

    public String getBloodPressure() {
        return BloodPressure;
    }

    public void setBloodPressure(String BloodPressure) {
        this.BloodPressure = BloodPressure;
    }
    private int Temprature;
    private int PulseRate;
    private int PatientId;
    
    @Override
    public String toString(){
        return PatientID;
    }
}
