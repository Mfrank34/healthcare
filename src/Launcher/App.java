package Launcher;

import Controllers.PatientsController;
import Views.PatientsGUI;
import Model.Patients;

public class App {
    public static void main(String[] args) {
        Patients model = new Patients();
        PatientsGUI view = new PatientsGUI();
        new PatientsController(view, model);
    }
}
