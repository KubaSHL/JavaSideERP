package com.PortfolioProject.ERPFullstackApp.Contractors;

import com.PortfolioProject.ERPFullstackApp.Contractors.Entities.Contractor;
import com.PortfolioProject.ERPFullstackApp.ProductCard.Entities.ProductCard;
import com.PortfolioProject.ERPFullstackApp.ProductCard.ProductCardRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Arrays;
import java.util.List;
import java.util.zip.Checksum;

@Configuration
public class ContractorsConfig {

    @Bean
    CommandLineRunner commandLineRunnerContractor(
            ContractorsRepository contractorsRepository){
        return  args -> {
            Contractor c1 = new Contractor("testName1",  "9018293801" );
            Contractor  c2 = new Contractor("testName2",  "88432051");
            contractorsRepository.saveAll(List.of(c1,c2));
        };
    }
}
