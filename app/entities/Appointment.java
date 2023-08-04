package entities;

import java.time.LocalDateTime;

public class Appointment {
    private int id;
    private LocalDateTime time;
    private String location;
    private Account patient;

    public Appointment() {
    }

    public Appointment(int id, LocalDateTime time, String location, Account patient) {
        this.id = id;
        this.time = time;
        this.location = location;
        this.patient = patient;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public LocalDateTime getTime() {
        return time;
    }

    public void setTime(LocalDateTime time) {
        this.time = time;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public Account getPatient() {
        return patient;
    }

    public void setPatient(Account patient) {
        this.patient = patient;
    }

    @Override
    public String toString() {
        return "ID: " + id +
                "\nTime: " + time +
                "\nLocation: " + location +
                "\nPatient: " + patient;
    }
}
