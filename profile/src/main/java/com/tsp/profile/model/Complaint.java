package com.tsp.profile.model;

import jakarta.persistence.*;

@Entity
public class Complaint {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO) // the id is generated automatically
    @Column(name = "id",length = 50)
    private Long id;
    @Column(name = "Date",length = 50)
    private String date;
    @Column(name = "description")
    private String description;

    public Complaint() {
    }

    public Complaint(Long id, String date, String description) {
        this.id = id;
        this.date = date;
        this.description = description;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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

    @Override
    public String toString() {
        return "Complaint{" +
                "id=" + id +
                ", date='" + date + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}
