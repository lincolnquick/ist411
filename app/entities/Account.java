package entities;

public class Account {
    private int id;
    private String username;
    private String password;
    private String address;
    private String phoneNumber;

    public Account() {
    }

    public Account(int id, String username, String password, String address, String phoneNumber) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.address = address;
        this.phoneNumber = phoneNumber;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public String toString() {
        return "ID: " + id +
                "\nUsername: " + username +
                "\nPassword: " + password +
                "\nAddress: " + address +
                "\nPhone Number: " + phoneNumber;

    }
}
