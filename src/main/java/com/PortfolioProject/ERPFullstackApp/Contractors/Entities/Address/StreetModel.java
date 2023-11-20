package com.PortfolioProject.ERPFullstackApp.Contractors.Entities.Address;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "StreetsList")
public class StreetModel {

    @Id
    @SequenceGenerator(name = "Streets_sequence",
            sequenceName = "Streets_sequence",
            allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE,
            generator = "Streets_sequence")
    private Long id;
    @Column(unique = true)
    public String name;
    @OneToMany(targetEntity = Address.class, fetch = FetchType.LAZY, mappedBy = "street")
    public List<Address> addressList;

    public StreetModel() {
    }

    public StreetModel(String name, List<Address> addressList) {
        this.name = name;
        this.addressList = addressList;
    }

    public Long getId() {
        return id;
    }

    private void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Address> getAddressList() {
        return addressList;
    }


}
