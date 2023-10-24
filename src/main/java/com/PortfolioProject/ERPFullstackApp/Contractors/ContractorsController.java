package com.PortfolioProject.ERPFullstackApp.Contractors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.event.EventPublicationInterceptor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "api/v1/contractors")
public class ContractorsController {

    private final ContractorsService contractorsService;

    @Autowired
    public  ContractorsController(ContractorsService contractorsService){
        this.contractorsService = contractorsService;
    }

    @GetMapping("/ping")
    public String Ping(){return "ContractorsController responding.";}



}
