package Controllers;

import Views.PatientsGUI;
import Model.Patients;
import Validation.PatientValidator;

// java imports
import java.util.List;

public class PatientsController extends BaseController<Patients> {
    private final PatientsGUI patientsView;

    public PatientsController(PatientsGUI view, Patients model) {
        super(view, model, new PatientValidator());
        this.patientsView = view;

        view.addSubmitListener(e -> {
            List<String> data = view.getData();
            if (data.size() == 7) {
                model.setId(data.get(0));
                model.setFirst(data.get(1));
                model.setLast(data.get(2));
                model.setPhone(data.get(3));
                model.setEmail(data.get(4));
                try {
                    model.setNhsNumber(Integer.parseInt(data.get(5)));
                } catch (NumberFormatException ex) {
                    view.showErrors(List.of("NHS number must be numeric"));
                }
                if (!data.get(6).isEmpty()) {
                    model.setGender(data.get(6).charAt(0));
                }
            }
            handleSubmit();
        });
    }

    @Override
    protected void saveModel() {
        System.out.println("Patient saved: " + model.getFirst() + " " + model.getLast());
        patientsView.dispose();
    }
}
