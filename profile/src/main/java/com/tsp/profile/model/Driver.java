package com.tsp.profile.model;

import jakarta.persistence.*;

@Entity
public class Driver {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO) // the id is generated automatically
    @Column(name = "id",length = 50)
    private Long id;
    @Column(name = "firstName",length = 50)
    private String firstName;
    @Column(name = "lastName",length = 50)
    private String lastName;
    @Column(name = "email",length = 50)
    private String email;
    @Column(name = "mobile",length = 10)
    private Integer mobile;
    @Column(name = "password",length = 50)
    private String password;
    @Column(name = "location",length = 50)
    private String location;
    @Column(name = "NIC")
    private String nic;
    @Column(name = "licence")
    private String licence;

    public Driver() {
    }

    public Driver(Long id, String firstName, String lastName, String email, Integer mobile, String password, String location, String nic, String licence) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.mobile = mobile;
        this.password = password;
        this.location = location;
        this.nic = nic;
        this.licence = licence;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Integer getMobile() {
        return mobile;
    }

    public void setMobile(Integer mobile) {
        this.mobile = mobile;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getNic() {
        return nic;
    }

    public void setNic(String nic) {
        this.nic = nic;
    }

    public String getLicence() {
        return licence;
    }

    public void setLicence(String licence) {
        this.licence = licence;
    }

    @Override
    public String toString() {
        return "Driver{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", email='" + email + '\'' +
                ", mobile=" + mobile +
                ", password='" + password + '\'' +
                ", location='" + location + '\'' +
                ", nic='" + nic + '\'' +
                ", licence='" + licence + '\'' +
                '}';
    }
}
