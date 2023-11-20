package com.PortfolioProject.ERPFullstackApp.Contractors.Entities.Address;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "PostalCodesList")
public class PostalCodeModel {

    @Id
    @SequenceGenerator(name = "PostalCode_sequence",
            sequenceName = "PostalCode_sequence",
            allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE,
            generator = "PostalCode_sequence")
    private Long id;
    @Column(unique = true)
    public String zipcode;
    @OneToMany(targetEntity = Address.class, fetch = FetchType.LAZY, mappedBy = "postalCode")
    public List<Address> addressList;

    public PostalCodeModel() {
    }

    public PostalCodeModel(String zipcode) {
        this.zipcode = zipcode;
    }

    public Long getId() {
        return id;
    }

    private void setId(Long id) {
        this.id = id;
    }

    public String getZipcode() {
        return zipcode;
    }

    public void setZipcode(String zipcode) {
        this.zipcode = zipcode;
    }

    public List<Address> getAddressList() {
        return addressList;
    }

}
