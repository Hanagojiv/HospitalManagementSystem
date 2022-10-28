/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hsmmodel;

/**
 *
 * @author vivekhanagoji
 */
public class Encounter {
    
    private int PatientID;
    private String PatientName;
    private int PatientAge;
    private int Height;
    private int Weight;
    private String BloodType;
    private String Gender;
    private String HospitalName;
    private int HospitalID;
    private String PPhoneNo;
    private int DoctorID;
    private String DoctorName;
    private int PulseRate;
    private int BodyTemp;
    private String BloodPressure;
    private String Feedback;

    public int getPatientAge() {
        return PatientAge;
    }

    public void setPatientAge(int PatientAge) {
        this.PatientAge = PatientAge;
    }

    public int getHeight() {
        return Height;
    }

    public void setHeight(int Height) {
        this.Height = Height;
    }

    public int getWeight() {
        return Weight;
    }

    public void setWeight(int Weight) {
        this.Weight = Weight;
    }

    public String getBloodType() {
        return BloodType;
    }

    public void setBloodType(String BloodType) {
        this.BloodType = BloodType;
    }

    public String getGender() {
        return Gender;
    }

    public void setGender(String Gender) {
        this.Gender = Gender;
    }

    public int getHospitalID() {
        return HospitalID;
    }

    public void setHospitalID(int HospitalID) {
        this.HospitalID = HospitalID;
    }

    public String getPPhoneNo() {
        return PPhoneNo;
    }

    public void setPPhoneNo(String PPhoneNo) {
        this.PPhoneNo = PPhoneNo;
    }

    
    public int getPatientID() {
        return PatientID;
    }

    public void setPatientID(int PatientID) {
        this.PatientID = PatientID;
    }

    public String getPatientName() {
        return PatientName;
    }

    public void setPatientName(String PatientName) {
        this.PatientName = PatientName;
    }

    public int getDoctorID() {
        return DoctorID;
    }

    public void setDoctorID(int DoctorID) {
        this.DoctorID = DoctorID;
    }

    public String getDoctorName() {
        return DoctorName;
    }

    public void setDoctorName(String DoctorName) {
        this.DoctorName = DoctorName;
    }


    public String getHospitalName() {
        return HospitalName;
    }

    public void setHospitalName(String HospitalName) {
        this.HospitalName = HospitalName;
    }

    public int getPulseRate() {
        return PulseRate;
    }

    public void setPulseRate(int PulseRate) {
        this.PulseRate = PulseRate;
    }

    public int getBodyTemp() {
        return BodyTemp;
    }

    public void setBodyTemp(int BodyTemp) {
        this.BodyTemp = BodyTemp;
    }

    public String getBloodPressure() {
        return BloodPressure;
    }

    public void setBloodPressure(String BloodPressure) {
        this.BloodPressure = BloodPressure;
    }

    public String getFeedback() {
        return Feedback;
    }

    public void setFeedback(String Feedback) {
        this.Feedback = Feedback;
    }
    
       @Override
   public String toString(){
       return PatientName;
   }
    
    
}
