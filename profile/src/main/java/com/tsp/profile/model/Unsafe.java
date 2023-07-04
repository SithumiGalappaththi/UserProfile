package com.tsp.profile.model;

import jakarta.persistence.*;

@Entity
public class Unsafe {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO) // the id is generated automatically
    @Column(name = "id",length = 50)
    private Long id;
    @Column(name = "Name",length = 50)
    private String name;
    @Column(name = "mobile",length = 20)
    private String mobile;
    @Column(name = "email",length = 50)
    private String email;
    @Column(name = "Description")
    private String description;

    public Unsafe() {
    }

    public Unsafe(Long id, String name, String mobile, String email, String description) {
        this.id = id;
        this.name = name;
        this.mobile = mobile;
        this.email = email;
        this.description = description;
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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "Unsafe{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", mobile='" + mobile + '\'' +
                ", email='" + email + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}
