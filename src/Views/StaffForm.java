package Views;

public class StaffForm extends BaseForm {
    private static final String[] labels = {
            "ID:", "First Name:", "Last Name:", "Phone Number:",
            "Email:", "Start Date:", "Status:", "Role:",
            "Department:", "Facility:", "Line Manager:", "Access:"
    };

    public StaffForm() {
        super("Staff Form", labels);
    }
}
