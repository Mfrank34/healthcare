package Model;

public class Employee extends Person {
    protected String startDate;
    protected String status;

    public Employee() {
        super();
    }

    public Employee(String id, String first, String last, String phone, String email, String startDate, String status) {
        super(id, first, last, phone, email);
        this.startDate = startDate;
        this.status = status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getStatus() {
        return status;
    }

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String start_data) {
        this.startDate = start_data;
    }

}
