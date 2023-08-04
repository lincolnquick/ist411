package entities;

import java.time.LocalDate;

public class Record {
    private int id;
    private LocalDate recordDate;
    private String diagnosticCode;
    private String diagnosis;
    private Medication prescription;
    private String dosage;
    private String physician;
    private String notes;

    public Record() {
    }

    public Record(int id, LocalDate recordDate, String diagnosticCode, String diagnosis, Medication prescription, String dosage, String physician, String notes) {
        this.id = id;
        this.recordDate = recordDate;
        this.diagnosticCode = diagnosticCode;
        this.diagnosis = diagnosis;
        this.prescription = prescription;
        this.dosage = dosage;
        this.physician = physician;
        this.notes = notes;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public LocalDate getRecordDate() {
        return recordDate;
    }

    public void setRecordDate(LocalDate recordDate) {
        this.recordDate = recordDate;
    }

    public String getDiagnosticCode() {
        return diagnosticCode;
    }

    public void setDiagnosticCode(String diagnosticCode) {
        this.diagnosticCode = diagnosticCode;
    }

    public String getDiagnosis() {
        return diagnosis;
    }

    public void setDiagnosis(String diagnosis) {
        this.diagnosis = diagnosis;
    }

    public Medication getPrescription() {
        return prescription;
    }

    public void setPrescription(Medication prescription) {
        this.prescription = prescription;
    }

    public String getDosage() {
        return dosage;
    }

    public void setDosage(String dosage) {
        this.dosage = dosage;
    }

    public String getPhysician() {
        return physician;
    }

    public void setPhysician(String physician) {
        this.physician = physician;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    @Override
    public String toString() {
        return "Record: " +
                "ID: "+ id +
                "\nDate: " + recordDate +
                "\nDiagnostic Code: '" + diagnosticCode +
                "\nDiagnosis: " + diagnosis +
                  prescription +
                "\nDosage: "+ dosage +
                "\nDiagnosing Physician: " + physician +
                "\nNotes: " + notes;
    }
}
