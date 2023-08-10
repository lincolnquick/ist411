package controllers;

import entities.Medication;
import play.mvc.Controller;
import play.mvc.Result;
import services.MedicationService;
import java.util.List;

/**
 * Controller for handling medication-related actions.
 */
public class MedicationController extends Controller {

    /**
     * Retrieves a specific medication by its ID. Detail View.
     *
     * @param id The ID of the medication.
     * @return A Result object with the medication details.
     */
    public Result getMedication(int id) {
        return ok(views.html.DetailView.medication.render(MedicationService.getInstance().getMedication(id).toString()));
    }

    /**
     * Retrieves a list of all medications. List View.
     *
     * @return A Result object with the list of medications.
     */
    public Result getMedications() {
        List<Medication> medications = MedicationService.getInstance().getAllMedications();
        String output = new String();
        for (int i = 0; i < medications.size(); i++) {
            output += medications.get(i).toString() + "\n";
        }
        return ok(views.html.ListView.medication.render(output));
    }

    public Result index() {
        return ok(views.html.index.render("Mediconnect Landing Page"));
    }

}
