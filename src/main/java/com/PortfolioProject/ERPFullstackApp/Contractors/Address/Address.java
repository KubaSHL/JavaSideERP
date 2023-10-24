package com.PortfolioProject.ERPFullstackApp.Contractors.Address;

import com.fasterxml.jackson.databind.annotation.JsonTypeResolver;
import jakarta.persistence.*;

@Entity
@Table(name = "Address")
public class Address {
    @Id
    @SequenceGenerator(name = "Address_sequence",
    sequenceName = "Address_sequence",
    allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE,
    generator = "Address_sequence")
    Long id;

    @ManyToOne
    Cities city;
    @ManyToOne
    PostalCodes postalCode;
    @ManyToOne
    Streets street;
    String details;
    String comments;

    public Address() {
    }

    public Address(Cities city, PostalCodes postalCode, Streets street, String details, String comments) {
        this.city = city;
        this.postalCode = postalCode;
        this.street = street;
        this.details = details;
        this.comments = comments;
    }

    public Long getId() {
        return id;
    }

    private void setId(Long id) {
        this.id = id;
    }

    public Cities getCity() {
        return city;
    }

    public void setCity(Cities city) {
        this.city = city;
    }

    public PostalCodes getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(PostalCodes postalCode) {
        this.postalCode = postalCode;
    }

    public Streets getStreet() {
        return street;
    }

    public void setStreet(Streets street) {
        this.street = street;
    }

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }
}
