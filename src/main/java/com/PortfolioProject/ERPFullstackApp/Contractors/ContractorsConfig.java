package com.PortfolioProject.ERPFullstackApp.Contractors;

import com.PortfolioProject.ERPFullstackApp.Contractors.Entities.IContractor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import java.util.List;

@Configuration
public class ContractorsConfig {

    @Bean("ContractorConfig")
    CommandLineRunner commandLineRunnerContractor(
            ContractorsRepository contractorsRepository){
        return  args -> {
            IContractor c1 = new IContractor("testName1",  "9018293801" );
            IContractor c2 = new IContractor("testName2",  "88432051");
            contractorsRepository.saveAll(List.of(c1,c2));
        };
    }
}
