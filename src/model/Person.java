package model;

public class Person {
    protected String WorkplaceId;
    protected String first;
    protected String last;
    protected String phone;
    protected String email;

    public Person() {

    }

    public Person(String id, String first, String last, String phone, String email) {
        this.WorkplaceId = id;
        this.first = first;
        this.last = last;
        this.phone = phone;
        this.email = email;
    }

    // setters
    public void set_id(String id) {
        this.WorkplaceId = id;
    }

    public void set_first(String first) {
        this.first = first;
    }

    public void set_last(String last) {
        this.last = last;
    }

    public void set_phone(String phone) {
        this.phone = phone;
    }

    public void set_email(String email) {
        this.email = email;
    }

    // getters
    public String get_id() {
        return WorkplaceId;
    }

    public String get_first(){
        return first;
    }

    public String get_last() {
        return last;
    }

    public String get_fullname() {
        return first + " " + last;
    }

    public String get_phone() {
        return phone;
    }

    public String get_email() {
        return email;
    }
}
