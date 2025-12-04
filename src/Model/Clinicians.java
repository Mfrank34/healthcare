package Model;

public class Clinicians extends Employee {
    private String title;
    private String speciality;
    private String gmc;
    private String Workplace;
    private String type;

    public Clinicians() {
        super();
    }

    public Clinicians(String id, String first, String last, String phone, String email, String startDate, String status,
            String title, String speciality, String gmc, String Workplace, String type) {
        super(id, first, last, phone, email, startDate, status);
        // current setters 
        this.title = title;
        this.speciality = speciality;
        this.gmc = gmc;
        this.Workplace = Workplace;
        this.type = type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void setSpeciality(String speciality) {
        this.speciality = speciality;
    }

    public String getSpeciality() {
        return speciality;
    }

    public void setGmc(String gmc) {
        this.gmc = gmc;
    }

    public String getGmc() {
        return gmc;
    }

    public void setWorkplaceId(String Workplace) {
        this.Workplace = Workplace;
    }

    public String getWorkplaceId() {
        return Workplace;
    }
}

