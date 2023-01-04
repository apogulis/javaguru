package lv.javaguru.demo.finalproject.model;

public class WebStoreUser {

    private String firstName;

    private String lastName;

    private String email;

    private String phoneNumber;

    public WebStoreUser(String firstName, String lastName, String email, String phoneNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getEmail() {
        return email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }
}
