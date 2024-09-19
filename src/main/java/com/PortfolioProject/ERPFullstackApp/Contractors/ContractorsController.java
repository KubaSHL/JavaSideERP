package com.PortfolioProject.ERPFullstackApp.Contractors;

import com.PortfolioProject.ERPFullstackApp.Contractors.Entities.IContractor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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
    public List<IContractor> getListOfContractors(){ return contractorsService.getListOfContractors();}

    @PostMapping("/addContractor")
    public void addContractor(@RequestBody IContractor contractor){
        contractorsService.addContractor(new IContractor(contractor.name, contractor.nip));
    }

}
