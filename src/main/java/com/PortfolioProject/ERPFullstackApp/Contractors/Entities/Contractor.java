package com.PortfolioProject.ERPFullstackApp.Contractors.Entities;

import com.PortfolioProject.ERPFullstackApp.Contractors.Abstract.ContractorAbstract;
import com.PortfolioProject.ERPFullstackApp.Contractors.Abstract.ContractorInterface;
import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "ContractorsList")
public class Contractor extends ContractorAbstract implements ContractorInterface  {

    @Id
    @SequenceGenerator(name = "Contractor_sequence",
    sequenceName = "Contractor_sequence",
    allocationSize = 1
    )
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "Contractor_sequence")
    private Long id;
    public String name;
    public String code;
    public String nip;
    @OneToMany(targetEntity = SubContractors.class, cascade = {CascadeType.ALL}, mappedBy = "masterContractor")
    public List<SubContractors> subContractors;

    public Contractor(String name, String code, String nip) {
        this.name = name;
        this.code = code;
        this.nip = nip;
    }

    public Contractor() {
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

    public String getNip() {
        return nip;
    }

    public void setNip(String nip) {
        this.nip = nip;
    }

}
