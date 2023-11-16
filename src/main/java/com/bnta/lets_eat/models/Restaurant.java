package com.bnta.lets_eat.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;

import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "restaurants")
public class Restaurant {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private Long id;

    @Column
    private String name;

    @Column
    private String address;

    @Column
    private String postcode;

    @Column
    private String website;

    @ElementCollection(targetClass = Cuisine.class)
    @CollectionTable (
            name = "restaurants_cuisines",
            joinColumns = @JoinColumn(name = "restaurant_id"))
    @Enumerated(EnumType.STRING)
    @Column(name = "cuisines")
    private Set<Cuisine> cuisines; // many-to-many, more efficient to use a set than an ArrayList

    @ManyToOne
    @JoinColumn(name = "location_id") // means 'restaurants' table will have location_id FK
    @JsonIgnoreProperties("restaurants")
    private Location location; // represents town and area


    @Column
    private double latitude;

    @Column
    private double longitude;

    public Restaurant(String name, String address, String postcode, String website, Location location, double latitude, double longitude) {
        this.name = name;
        this.address = address;
        this.postcode = postcode;
        this.website = website;
        this.cuisines = new HashSet<>();
        this.location = location;
        this.longitude = longitude;
        this.latitude = latitude;
    }

    public Restaurant() {
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

    public Set<Cuisine> getCuisines() {
        return cuisines;
    }

    public void setCuisines(Set<Cuisine> cuisines) {
        this.cuisines = cuisines;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public double getLongitude() {
        return longitude;
    }

    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }

    public double getLatitude() {
        return latitude;
    }

    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPostcode() {
        return postcode;
    }

    public void setPostcode(String postcode) {
        this.postcode = postcode;
    }

    public String getWebsite() {
        return website;
    }

    public void setWebsite(String website) {
        this.website = website;
    }
}
