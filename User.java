package javaoop;

import java.util.Scanner;

/**
 *
 * @author VQ
 */
public class User {
     private String username;
    private String email;
    private String phoneNumber;

    public User() {
    }

    public User(String username, String email, String phoneNumber) {
        this.username = username;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void input() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter username: ");
        this.username = scanner.nextLine();

        System.out.print("Enter email: ");
        this.email = scanner.nextLine();

        System.out.print("Enter phone number: ");
        this.phoneNumber = scanner.nextLine();
    }

    public void display() {
        System.out.println("Username: " + this.username);
        System.out.println("Email: " + this.email);
        System.out.println("Phone number: " + this.phoneNumber);
    }
}

