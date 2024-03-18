package com.fleet.management.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name = "taxis")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class Taxi {
    @Id
    private Integer id;
    private String plate;
    public Taxi() {
        this.plate = "";
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getPlate() {
        return plate;
    }

    public void setPlate(String plate) {
        this.plate = plate;
    }

    @Override
    public String toString() {
        return "Taxi{" +
                "id=" + id +
                ", plate='" + plate + '\'' +
                '}';
    }
}
