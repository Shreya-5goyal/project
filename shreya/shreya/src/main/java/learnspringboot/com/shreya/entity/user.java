package learnspringboot.com.shreya.entity;

import jakarta.persistence.*;

@Entity
@Table
public class user {


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    @Column
    private String username;
    @Column
    private String password;

    public user() {
        super();
    }

    @Override
    public String toString() {
        return "user{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                '}';
    }

    public user(int id, String username, String password) {
        super();
        this.username=username;
        this.password=password;
        this.id = id;
    }




    public String getUsername() {
        return username;
    }

    public int getId() {
        return id;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setUsername(String username) {
        this.username = username;
    }
}
