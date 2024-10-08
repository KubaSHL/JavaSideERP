package com.PortfolioProject.ERPFullstackApp.Contractors.Entities;

import com.PortfolioProject.ERPFullstackApp.Contractors.Abstract.ContractorAbstract;
import jakarta.persistence.*;

import java.util.Arrays;
import java.util.List;

@Entity
@Table(name = "ContractorsList")
public class IContractor extends ContractorAbstract implements com.PortfolioProject.ERPFullstackApp.Contractors.Abstract.IContractor {

    @Id
    @SequenceGenerator(name = "Contractor_sequence",
    sequenceName = "Contractor_sequence",
    allocationSize = 1
    )
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "Contractor_sequence")
    private Long id;
    @Column(unique = true)
    public String name;
    @Column(unique = true)
    public String code;
    @Column(unique = true)
    public String nip;
    @OneToMany(targetEntity = SubContractors.class, cascade = {CascadeType.ALL}, mappedBy = "masterContractor")
    public List<SubContractors> subContractors;

    public IContractor(String name, String nip) {
        this.name = name;
        this.code = Arrays.toString(name.getBytes()) ;
        this.nip = nip;
    }

    public IContractor() {
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
