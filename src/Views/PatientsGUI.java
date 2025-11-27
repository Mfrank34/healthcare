package Views;

import Model.Patients;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

public class PatientsGUI extends BaseForm {
    private final List<JTextField> fields = new ArrayList<>();
    private final JButton submitButton = new JButton("Submit");

    private final String[] labels = {
            "ID:", "First Name:", "Last Name:", "Phone Number:", "Email:",
            "NHS Number:", "Gender:", "Birth Date:", "Address:", "PostCode:",
            "Emergency Name:", "Emergency Number:", "Registration:", "GP - ID:"
    };

    public PatientsGUI() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        JPanel panel = new JPanel(new GridLayout(labels.length, 2));
        for (String label : labels) {
            panel.add(new JLabel(label));
            JTextField field = new JTextField();
            panel.add(field);
            fields.add(field);
        }
        add(panel, BorderLayout.CENTER);

        JPanel buttonPanel = new JPanel();
        buttonPanel.add(submitButton);
        add(buttonPanel, BorderLayout.SOUTH);

        setSize(400, 300);
        setVisible(true);
    }

    public List<String> getData() {
        List<String> data = new ArrayList<>();
        for (JTextField field : fields) {
            data.add(field.getText());
        }
        return data;
    }

    public void addSubmitListener(ActionListener listener) {
        submitButton.addActionListener(listener);
    }
}