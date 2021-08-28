package service;

import model.Appointment;

import java.util.ArrayList;

public interface Ipatient {
    public void makeAppointment(Appointment appointment);
    public void viewProfile(int id);
    public ArrayList<Appointment> myAppointments(int id);
    public void deleteAppointment(int id);
    public void editAppointment(Appointment appointment);
    public Appointment viewAppointment(int id);
}
