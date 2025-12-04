package Views;

public class CliniciansForm extends BaseForm {
    private static final String[] labels = {
            "ID:", "First Name:", "Last Name:", "Phone Number:",
            "Email:", "Start Date:", "Status:", "Title:",
            "Speciality:", "GMC Number:", "Workplace:", "Type:"
    };

    public CliniciansForm() {
        super("Clinicians Form", labels);
    }
}
