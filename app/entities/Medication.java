package entities;

import java.time.LocalDate;

public class Medication {
    private int id;
    private LocalDate date;
    private String prescriptionName;
    private String prescribingPhysician;
    private int refillsRemaining;
    private LocalDate expires;

    public Medication() {
    }

    public Medication(int id, LocalDate date, String prescriptionName, String prescribingPhysician, int refillsRemaining, LocalDate expires) {
        this.id = id;
        this.date = date;
        this.prescriptionName = prescriptionName;
        this.prescribingPhysician = prescribingPhysician;
        this.refillsRemaining = refillsRemaining;
        this.expires = expires;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public String getPrescriptionName() {
        return prescriptionName;
    }

    public void setPrescriptionName(String prescriptionName) {
        this.prescriptionName = prescriptionName;
    }

    public String getPrescribingPhysician() {
        return prescribingPhysician;
    }

    public void setPrescribingPhysician(String prescribingPhysician) {
        this.prescribingPhysician = prescribingPhysician;
    }

    public int getRefillsRemaining() {
        return refillsRemaining;
    }

    public void setRefillsRemaining(int refillsRemaining) {
        this.refillsRemaining = refillsRemaining;
    }

    public LocalDate getExpires() {
        return expires;
    }

    public void setExpires(LocalDate expires) {
        this.expires = expires;
    }

    @Override
    public String toString() {
        return "Medication: " +
                "ID: " + id +
                "\nDate: " + date +
                "\nPrescription Name: " + prescriptionName +
                "\nPrescribing Physician: " + prescribingPhysician +
                "\nRefills Remaining: " + refillsRemaining +
                "\nExpires: " + expires;
    }
}
