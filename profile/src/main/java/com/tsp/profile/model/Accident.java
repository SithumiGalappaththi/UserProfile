package com.tsp.profile.model;

import jakarta.persistence.*;

@Entity
public class Accident {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO) // the id is generated automatically
    @Column(name = "id",length = 50)
    private Long id;
    @Column(name = "Name",length = 50)
    private String name;
    @Column(name = "Date",length = 50)
    private String date;
    @Column(name = "Description")
    private String description;
    @Column(name = "mobile",length = 20)
    private String mobile;
    @Column(name = "email",length = 50)
    private String email;

    public Accident() {
    }

    public Accident(Long id, String name, String date, String description, String mobile, String email) {
        this.id = id;
        this.name = name;
        this.date = date;
        this.description = description;
        this.mobile = mobile;
        this.email = email;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Accident{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", date='" + date + '\'' +
                ", description='" + description + '\'' +
                ", mobile='" + mobile + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
