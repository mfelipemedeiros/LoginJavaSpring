package com.example.AulaWeb;

import jakarta.persistence.*;



@Entity
@Table(name="users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, unique = true, length = 45)
    private String email;

    @Column(nullable = false, length = 64)
    private String password;

    @Column(name = "first_name", nullable = false, length = 20)
    private String firstName;

    @Column(name = "last_name", nullable = false, length = 20)
    private String lastName;

    public String getEmail(){
        return email;
    }
    public void setEmail(final String email){
        this.email = email;
    }
    public String getPassword(){
        return email;
    }
    public void setPassword(final String password){
        this.password = password;
    }
    public void setFirstName(final String firstName){
        this.firstName = firstName;
    }
    public String setFirstName(){
        return firstName;
    }
    public void setLastName(final String email){
        this.email = email;
    }
    public String setLastName(){
        return lastName;
    }
}
