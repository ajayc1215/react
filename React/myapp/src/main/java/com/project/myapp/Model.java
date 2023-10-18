package com.project.myapp;

import jakarta.persistence.*;
import org.springframework.data.jpa.repository.JpaRepository;


@Entity
@Table(name = "models")
public class Model {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "model_name")
    private String modelName;

    @Column(name = "manufacturer")
    private String manufacturer;

    @Column(name = "year")
    private int year;

    // Default constructor
    public Model() {
    }

    // Parameterized constructor
    public Model(String modelName, String manufacturer, int year) {
        this.modelName = modelName;
        this.manufacturer = manufacturer;
        this.year = year;
    }

    // Getter method for ID
    public Long getId() {
        return id;
    }

    // Setter method for ID (generally not recommended for the ID)
    public void setId(Long id) {
        this.id = id;
    }

    // Getter method for modelName
    public String getModelName() {
        return modelName;
    }

    // Setter method for modelName
    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    // Getter method for manufacturer
    public String getManufacturer() {
        return manufacturer;
    }

    // Setter method for manufacturer
    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    // Getter method for year
    public int getYear() {
        return year;
    }

    // Setter method for year
    public void setYear(int year) {
        this.year = year;
    }
}
