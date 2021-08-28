package model;

import java.sql.Date;

abstract class Person {
    String fname,lname,email,address,password;
    Date DOB;
    int phone;

    public Person(String fname, String lname, String email, String address, String password, Date DOB, int phone) {
        this.fname = fname;
        this.lname = lname;
        this.email = email;
        this.address = address;
        this.password = password;
        this.DOB = DOB;
        this.phone = phone;
    }

    public Person() {
    }

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public String getLname() {
        return lname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Date getDOB() {
        return DOB;
    }

    public void setDOB(Date DOB) {
        this.DOB = DOB;
    }

    public int getPhone() {
        return phone;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }
}
