package Model;

public class Person {
    protected String WorkplaceId;
    protected String first;
    protected String last;
    protected String phone;
    protected String email;

    public Person() {}

    public Person(String id, String first, String last, String phone, String email) {
        this.WorkplaceId = id;
        this.first = first;
        this.last = last;
        this.phone = phone;
        this.email = email;
    }

    // setters
    public void setId(String id) {
        this.WorkplaceId = id;
    }

    public void setFirst(String first) {
        this.first = first;
    }

    public void setLast(String last) {
        this.last = last;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setEmail(String email) {this.email = email; }

    // getters
    public String getId() {
        return WorkplaceId;
    }

    public String getFirst(){
        return first;
    }

    public String getLast() {
        return last;
    }

    public String getFullname() {
        return first + " " + last;
    }

    public String getPhone() {
        return phone;
    }

    public String getEmail() {
        return email;
    }
}
