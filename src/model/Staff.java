package model;

public class Staff extends Employee {
    private String role;
    private String department;
    private String facility;
    private String lineManager;
    private String access;

    public Staff() {
        super();
    }

    public Staff(String id, String first, String last, String phone, String email, String startDate, String status,
            String role, String department, String facility, String lineManager, String access) {
        super(id, first, last, phone, email, startDate, status);
        this.role = role;
        this.department = department;
        this.facility = facility;
        this.lineManager = lineManager;
        this.access = access;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getRole() {
        return role;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getDepartment() {
        return department;
    }

    public void setFacility(String facility) {
        this.facility = facility;
    }

    public String getFacility() {
        return facility;
    }

    public void setLineManager(String lineManager) {
        this.lineManager = lineManager;
    }

    public String getLineManager() {
        return lineManager;
    }

    public void setAccess(String access) {
        this.access = access;
    }

    public String getAccess() {
        return access;
    }
}