package com.PortfolioProject.ERPFullstackApp.Contractors.Entities;

import com.PortfolioProject.ERPFullstackApp.Contractors.Abstract.ContractorAbstract;
import com.PortfolioProject.ERPFullstackApp.Contractors.Abstract.ContractorInterface;
import com.PortfolioProject.ERPFullstackApp.Contractors.Entities.Address.Address;
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
    @Column(unique = true)
    String code;
    @OneToOne(cascade = {CascadeType.ALL})
    @JoinColumn(name = "addressId", referencedColumnName = "id")
    Address address;
    @ManyToOne
    @JoinColumn(name = "masterContractorId", nullable = false)
    private Contractor masterContractor;

    public SubContractors() {
    }

    public SubContractors( String name, String code, Contractor masterContractor, Address address) {
        this.name = name;
        this.code = code;
        this.address = address;
        this.masterContractor = masterContractor;
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

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }


    public Contractor getMasterContractor() {
        return masterContractor;
    }

    private void setMasterContractor(Contractor masterContractor) {
        this.masterContractor = masterContractor;
    }
}