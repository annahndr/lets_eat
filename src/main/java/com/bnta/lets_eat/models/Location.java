package com.bnta.lets_eat.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "locations")
public class Location {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private Long id;

    @Column
    private String town; // glasgow

    @Column
    private String neighbourhood; // shawlands

    @JsonIgnoreProperties({"location"})
    @OneToMany(mappedBy = "location")
    private List<Restaurant> restaurants;

    public Location(String town, String neighbourhood) {
        this.town = town;
        this.neighbourhood = neighbourhood;
        this.restaurants = new ArrayList<>();
    }

    public Location() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTown() {
        return town;
    }

    public void setTown(String town) {
        this.town = town;
    }

    public String getNeighbourhood() {
        return neighbourhood;
    }

    public void setArea(String neighbourhood) {
        this.neighbourhood = neighbourhood;
    }

    public List<Restaurant> getRestaurants() {
        return restaurants;
    }

    public void setRestaurants(List<Restaurant> restaurants) {
        this.restaurants = restaurants;
    }
}
