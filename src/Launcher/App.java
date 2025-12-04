package Launcher;

import Controllers.PatientsController;
import Controllers.CliniciansController;
import Model.CliniciansForm;
import Views.PatientsForm;
import Model.Patients;
import Views.StaffForm;

public class App {
    public static void main(String[] args) {
        Patients model = new Patients();
        PatientsForm view = new PatientsForm();
        new PatientsController(view, model);

        CliniciansForm model2 = new CliniciansForm();
        StaffForm view2 = new StaffForm();
        new CliniciansController(view2, model2);
    }
}
