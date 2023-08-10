package services;

import entities.Medication;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

/**
 * Singleton class to manage medication services.
 */
public class MedicationService {

    private static MedicationService instance;
    private static List<Medication> data = new ArrayList<>();

    // Add medications
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

    /**
     * Get the single instance of MedicationService.
     *
     * @return The instance of MedicationService.
     */
    public static MedicationService getInstance(){
        if (instance == null){
            instance = new MedicationService();
        }
        return instance;
    }



    /**
     * Retrieves a medication by its ID.
     *
     * @param id The ID of the medication.
     * @return The medication with the specified ID.
     */
    public Medication getMedication(int id) { return data.get(id); }

    /**
     * Retrieves all medications.
     *
     * @return A list of all medications.
     */
    public List<Medication> getAllMedications() { return data; }
}
