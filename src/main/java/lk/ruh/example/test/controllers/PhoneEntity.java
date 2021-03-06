package lk.ruh.example.test.controllers;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class PhoneEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO) // autogenerate id
    private Long id;
    private String name;
    private String brand;

    public PhoneEntity() {
    }

    public PhoneEntity(String name, String brand) {
        this.brand = brand;
        this.name = name;
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

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }
}
