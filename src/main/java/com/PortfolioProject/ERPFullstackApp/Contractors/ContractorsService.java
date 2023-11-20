package com.PortfolioProject.ERPFullstackApp.Contractors;

import com.PortfolioProject.ERPFullstackApp.Contractors.Entities.Contractor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ContractorsService {

    private final ContractorsRepository contractorsRepository;

    @Autowired
    public ContractorsService(ContractorsRepository contractorsRepository){
        this.contractorsRepository = contractorsRepository;
    }

    public List<Contractor> getListOfContractors(){
        return contractorsRepository.findAll();
    }


}
