package model;

import java.sql.Date;
import java.sql.Time;

public class Appointment {
    private int phone;
    private Date date;
    private Time time;
    private int appointmentID;
    private int dID;
    private int pID;
    String message;

    public Appointment() {
    }

    public Appointment(int phone, Date date, Time time, int appointmentID, int dID, int pID, String message) {
        this.phone = phone;
        this.date = date;
        this.time = time;
        this.appointmentID = appointmentID;
        this.dID = dID;
        this.pID = pID;
        this.message = message;
    }

    public int getPhone() {
        return phone;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Time getTime() {
        return time;
    }

    public void setTime(Time time) {
        this.time = time;
    }

    public int getAppointmentID() {
        return appointmentID;
    }

    public void setAppointmentID(int appointmentID) {
        this.appointmentID = appointmentID;
    }

    public int getdID() {
        return dID;
    }

    public void setdID(int dID) {
        this.dID = dID;
    }

    public int getpID() {
        return pID;
    }

    public void setpID(int pID) {
        this.pID = pID;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
