package services;

import entities.Medication;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class MedicationService {

    private static MedicationService instance;
    private static List<Medication> data = new ArrayList<>();

    static {
        data.add(new Medication(0, LocalDate.of(2023, getRandomMonth(), getRandomDay()), "Atorvastatin", "Dr. Gregory House", 5, LocalDate.of(2024, getRandomMonth(), getRandomDay())));
        data.add(new Medication(1,  LocalDate.of(2023, getRandomMonth(), getRandomDay()), "Lisinopril", "Dr. Meredith Grey", 4, LocalDate.of(2024, getRandomMonth(), getRandomDay())));
        data.add(new Medication(2, LocalDate.of(2023, getRandomMonth(), getRandomDay()), "Metformin", "Dr. John Carter", 3, LocalDate.of(2024, getRandomMonth(), getRandomDay())));
        data.add(new Medication(3, LocalDate.of(2023, getRandomMonth(), getRandomDay()), "Levothyroxine", "Dr. Leonard McCoy", 2, LocalDate.of(2024, getRandomMonth(), getRandomDay())));
        data.add(new Medication(4, LocalDate.of(2023, getRandomMonth(), getRandomDay()), "Amoxicillin", "Dr. Shaun Murphy", 6, LocalDate.of(2024, getRandomMonth(), getRandomDay())));
    }

    private static int getRandomMonth() {
        return 1 + (int) (Math.random() * 12);
    }

    private static int getRandomDay() {
        return 1 + (int) (Math.random() * 28);
    }

    public static MedicationService getInstance(){
        if (instance == null){
            instance = new MedicationService();
        }
        return instance;
    }

    public Medication getMedication(int id) { return data.get(id); }

    public List<Medication> getAllMedications() { return data; }
}
