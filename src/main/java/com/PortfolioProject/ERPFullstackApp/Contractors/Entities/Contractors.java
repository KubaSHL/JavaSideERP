package com.PortfolioProject.ERPFullstackApp.Contractors.Entities;

import com.PortfolioProject.ERPFullstackApp.Contractors.Abstract.ContractorAbstract;
import com.PortfolioProject.ERPFullstackApp.Contractors.Abstract.ContractorInterface;
import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "ContractorsList")
public class Contractors extends ContractorAbstract implements ContractorInterface  {

    @Id
    @SequenceGenerator(name = "Contractor_sequence",
    sequenceName = "Contractor_sequence",
    allocationSize = 1
    )
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "Contractor_sequence")
    Long id;
    String name;
    String code;
    String nip;
    @OneToMany(targetEntity = SubContractors.class, cascade = {CascadeType.ALL}, mappedBy = "masterContractor")
    private List<SubContractors> subContractors;



}
