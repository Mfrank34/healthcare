package Launcher;

import Controllers.PatientsController;
import Controllers.StaffController;
import Model.Staff;
import Views.PatientsGUI;
import Model.Patients;
import Views.StaffGUI;

public class App {
    public static void main(String[] args) {
        Patients model = new Patients();
        PatientsGUI view = new PatientsGUI();
        new PatientsController(view, model);

        Staff model2 = new Staff();
        StaffGUI view2 = new StaffGUI();
        new StaffController(view2, model2);
    }
}
