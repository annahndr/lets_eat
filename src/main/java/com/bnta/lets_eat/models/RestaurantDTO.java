package com.bnta.lets_eat.models;

import java.util.List;

public class RestaurantDTO {

    private String name;
    private String address;
    private String postcode;
    private String website;
    private List<String> cuisines;
    private Long locationId;
    private double latitude;
    private double longitude;

    public RestaurantDTO(String name, String address, String postcode, String website, List<String> cuisines, Long locationId, double latitude, double longitude) {
        this.name = name;
        this.address = address;
        this.postcode = postcode;
        this.website = website;
        this.cuisines = cuisines;
        this.locationId = locationId;
        this.latitude = latitude;
        this.longitude = longitude;
    }

    public RestaurantDTO() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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

    public List<String> getCuisines() {
        return cuisines;
    }

    public void setCuisines(List<String> cuisines) {
        this.cuisines = cuisines;
    }

    public Long getLocationId() {
        return locationId;
    }

    public void setLocationId(Long locationId) {
        this.locationId = locationId;
    }

    public double getLatitude() {
        return latitude;
    }

    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }

    public double getLongitude() {
        return longitude;
    }

    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }
}
