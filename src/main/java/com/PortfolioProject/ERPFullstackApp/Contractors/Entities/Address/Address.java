package com.PortfolioProject.ERPFullstackApp.Contractors.Entities.Address;

import com.PortfolioProject.ERPFullstackApp.Contractors.Entities.SubContractors;
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
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "city",nullable = true, insertable = true)
    public CityModel city;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "postalCode",nullable = true, insertable = true)
    public PostalCodeModel postalCode;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "street",nullable = true, insertable = true)
    public StreetModel street;
    public String details;
    public String comments;
    @OneToOne(mappedBy = "address")
    public SubContractors subContractors;

    public Address() {
    }

    public Address(CityModel city, PostalCodeModel postalCode, StreetModel street, String details, String comments) {
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

    public CityModel getCity() {
        return city;
    }

    public void setCity(CityModel city) {
        this.city = city;
    }

    public PostalCodeModel getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(PostalCodeModel postalCode) {
        this.postalCode = postalCode;
    }

    public StreetModel getStreet() {
        return street;
    }

    public void setStreet(StreetModel street) {
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

    public SubContractors getSubContractors() {
        return subContractors;
    }

    private void setSubContractors(SubContractors subContractors) {
        this.subContractors = subContractors;
    }
}
