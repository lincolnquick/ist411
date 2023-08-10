package controllers;

import entities.Medication;
import play.mvc.Controller;
import play.mvc.Result;
import services.MedicationService;
import java.util.List;


public class MedicationController extends Controller {

    public Result getMedication(int id) {
        return ok(views.html.DetailView.medication.render(MedicationService.getInstance().getMedication(id).toString()));
    }

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
