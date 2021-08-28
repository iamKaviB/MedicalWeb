package model;

import java.sql.Date;

public class Patient extends Person{
    int pID;
    int age;

    public Patient(String fname, String lname, String email, String address, String password, Date DOB, int phone) {
        super(fname, lname, email, address, password, DOB, phone);
    }

    public Patient() {
        super();
    }

    public int getpID() {
        return pID;
    }

    public void setpID(int pID) {
        this.pID = pID;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
