package com.PortfolioProject.ERPFullstackApp.Contractors.Entities.Address;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "CitiesList")
public class CityModel {

    @Id
    @SequenceGenerator(name = "Cities_sequence",
            sequenceName = "Cities_sequence",
            allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE,
            generator = "Cities_sequence")
    private Long id;
    @Column(unique = true)
    public String name;
    @Column(unique = true)
    public String shortcut;
    @OneToMany(targetEntity = Address.class,fetch = FetchType.LAZY, mappedBy = "city")
    private List<Address> addressList;

    public CityModel() {
    }

    public CityModel(String name, String shortcut) {
        this.name = name;
        this.shortcut = shortcut;
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

    public String getShortcut() {
        return shortcut;
    }

    public void setShortcut(String shortcut) {
        this.shortcut = shortcut;
    }

    public List<Address> getAddresList() {
        return addressList;
    }

}
