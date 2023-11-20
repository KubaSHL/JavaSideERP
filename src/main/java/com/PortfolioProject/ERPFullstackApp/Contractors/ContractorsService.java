package com.PortfolioProject.ERPFullstackApp.Contractors;

import com.PortfolioProject.ERPFullstackApp.Contractors.Entities.Address.Address;
import com.PortfolioProject.ERPFullstackApp.Contractors.Entities.Contractor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ContractorsService {

    private final ContractorsRepository contractorsRepository;
    private final AddressRepository addressRepository;

    @Autowired
    public ContractorsService(ContractorsRepository contractorsRepository, AddressRepository addressRepository){
        this.contractorsRepository = contractorsRepository;
        this.addressRepository = addressRepository;
    }


    public List<Contractor> getListOfContractors(){
        return contractorsRepository.findAll();
    }

    public List<Address> getListOfAddresses(){
        return addressRepository.findAll();
    }

    public void addContractor(Contractor c){
       try{
           contractorsRepository.save(c);
       }catch(Exception ex){
           throw new IllegalStateException("EXCEPTION THROWN:"+ex.getMessage());
       }
    }

}
