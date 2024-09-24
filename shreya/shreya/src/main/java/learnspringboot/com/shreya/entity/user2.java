package learnspringboot.com.shreya.entity;

import jakarta.persistence.*;

@Entity
@Table
public class user2 {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
@Column
    private String username;
@Column
    private String city;
@Column
    private String status;

    // Default constructor is needed for JPA
    public user2() {}

    // Constructor for initialization
    public user2(int id, String username, String city, String status) {
        this.id = id;
        this.username = username;
        this.city = city;
        this.status = status;
    }

    // Getter and Setter for id
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    // Getter and Setter for username
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    // Getter and Setter for city
    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    // Getter and Setter for status
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "user2{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", city='" + city + '\'' +
                ", status='" + status + '\'' +
                '}';
    }

}
