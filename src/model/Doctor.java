package model;

public class Doctor {
    int dID;
    String specialization;


    public Doctor(int dID, String specialization) {
        this.dID = dID;
        this.specialization = specialization;
    }

    public Doctor() {
    }

    public int getdID() {
        return dID;
    }

    public void setdID(int dID) {
        this.dID = dID;
    }

    public String getSpecialization() {
        return specialization;
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }
}
