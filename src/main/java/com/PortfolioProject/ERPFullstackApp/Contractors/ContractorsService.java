package com.PortfolioProject.ERPFullstackApp.Contractors;

import com.PortfolioProject.ERPFullstackApp.Contractors.Entities.Address.Address;
import com.PortfolioProject.ERPFullstackApp.Contractors.Entities.IContractor;
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


    public List<IContractor> getListOfContractors(){
        return contractorsRepository.findAll();
    }

    public List<Address> getListOfAddresses(){
        return addressRepository.findAll();
    }

    public void addContractor(IContractor c){
       try{
           contractorsRepository.save(c);
       }catch(Exception ex){
           throw new IllegalStateException("EXCEPTION THROWN:"+ex.getMessage());
       }
    }

}
