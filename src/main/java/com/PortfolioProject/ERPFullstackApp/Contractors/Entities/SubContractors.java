package com.PortfolioProject.ERPFullstackApp.Contractors.Entities;

import com.PortfolioProject.ERPFullstackApp.Contractors.Abstract.ContractorAbstract;
import com.PortfolioProject.ERPFullstackApp.Contractors.Abstract.ContractorInterface;
import com.PortfolioProject.ERPFullstackApp.Contractors.Address.Address;
import jakarta.persistence.*;

@Entity
@Table(name = "SubContractorsList")
public class SubContractors extends ContractorAbstract implements ContractorInterface {
    @Id
    @SequenceGenerator(name = "Contractor_sequence",
            sequenceName = "Contractor_sequence",
            allocationSize = 1
    )
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "Contractor_sequence")
    Long id;
    String name;
    String code;
    Address address;
    @ManyToOne
    @JoinColumn(name = "contractorId", nullable = false)
    private Contractors masterContractor;

    public SubContractors() {
    }

    public SubContractors(Long id, String name, String code, Address address, Contractors masterContractor) {
        this.id = id;
        this.name = name;
        this.code = code;
        this.address = address;
        this.masterContractor = masterContractor;
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

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public Contractors getMasterContractor() {
        return masterContractor;
    }

    private void setMasterContractor(Contractors masterContractor) {
        this.masterContractor = masterContractor;
    }
}