package Views;

public class PatientsForm extends BaseForm {

    private static final String[] labels = {
            "ID:", "First Name:", "Last Name:", "Phone Number:", "Email:",
            "NHS Number:", "Gender:", "Birth Date:", "Address:", "PostCode:",
            "Emergency Name:", "Emergency Number:", "Registration:", "GP - ID:"
    };

    public PatientsForm() {
        super("Patients Form", labels);
    }
}