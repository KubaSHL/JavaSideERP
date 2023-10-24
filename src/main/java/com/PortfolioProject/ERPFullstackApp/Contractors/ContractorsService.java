package com.PortfolioProject.ERPFullstackApp.Contractors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ContractorsService {

    private final ContractorsRepository contractorsRepository;

    @Autowired
    public ContractorsService(ContractorsRepository contractorsRepository){
        this.contractorsRepository = contractorsRepository;
    }



}
