package Validation;

import Interfaces.Validator;
import Model.Patients;
import java.util.ArrayList;
import java.util.List;

public class PatientValidator implements Validator<Patients> {

    @Override
    public List<String> validate(Patients patient) {
        List<String> errors = new ArrayList<>();

        if (patient.getFirst() == null || patient.getFirst().isEmpty()) {
            errors.add("First name cannot be empty");
        }
        if (patient.getNhsNumber() <= 0) {
            errors.add("NHS number must be positive");
        }
        if (patient.getGender() != 'M' && patient.getGender() != 'F') {
            errors.add("Gender must be M or F");
        }
        return errors;
    }
}