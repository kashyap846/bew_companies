package com.brewing_companies.model;

import com.google.gson.annotations.SerializedName;

import java.util.Objects;

public class BrewingDetails {
    @SerializedName("id")
    int id;
    @SerializedName("name")
    String name;
    @SerializedName("brewery_type")
    String breweryType;
    @SerializedName("street")
    String street;
    @SerializedName("city")
    String city;
    @SerializedName("state")
    String state;
    @SerializedName("postal_code")
    String postalCode;
    @SerializedName("country")
    String country;
    @SerializedName("longitude")
    String longitude;
    @SerializedName("latitude")
    String latitude;
    @SerializedName("phone")
    String phone;
    @SerializedName("website_url")
    String websiteUrl;

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getBreweryType() {
        return breweryType;
    }

    public String getStreet() {
        return street;
    }

    public String getCity() {
        return city;
    }

    public String getState() {
        return state;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public String getCountry() {
        return country;
    }

    public String getLongitude() {
        return longitude;
    }

    public String getLatitude() {
        return latitude;
    }

    public String getPhone() {
        return phone;
    }

    public String getWebsiteUrl() {
        return websiteUrl;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BrewingDetails that = (BrewingDetails) o;
        return id == that.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
