package model;

import java.time.LocalDateTime;

/**
 *
 * @author daniel
 */

public class User {
    private String userName;
    private String email;
    private String password;
    private LocalDateTime dateCreated;
    
    //constructor

    public User() {
        this.userName = "NoName";
        this.email = "NoMail";
        this.password = "NoPassword";
        this.dateCreated = LocalDateTime.now();
    }

    public User(String userName, String email, String password, LocalDateTime dateCreated) {
        this.userName = userName;
        this.email = email;
        this.password = password;
        this.dateCreated = dateCreated;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public LocalDateTime getDateCreated() {
        return dateCreated;
    }

    public void setDateCreated(LocalDateTime dateCreated) {
        this.dateCreated = dateCreated;
    }

    @Override
    public String toString() {
        return "User{" +
               "username='" + userName + '\'' +
               ", email='" + email + '\'' +
               ", dateCreated=" + dateCreated +
               '}';
    }
    
    
}
