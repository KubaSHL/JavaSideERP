package com.PortfolioProject.ERPFullstackApp.Contractors;

import com.PortfolioProject.ERPFullstackApp.Contractors.Entities.Contractor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path = "api/v1/contractors")
public class ContractorsController {

    private final ContractorsService contractorsService;

    @Autowired
    public  ContractorsController(ContractorsService contractorsService){
        this.contractorsService = contractorsService;
    }

    @GetMapping("/ping")
    public String ping(){return "ContractorsController responding.";}

    @GetMapping("/listOfAllContractors")
    public List<Contractor> getListOfContractors(){ return contractorsService.getListOfContractors();}

}
