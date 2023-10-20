package com.PortfolioProject.ERPFullstackApp.ProductCard;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
public class ProductCardConfig {

    @Bean
    CommandLineRunner commandLineRunner(
            ProductCardRepository productCardRepository){
        return  args -> {
            ProductCard pc1 = new ProductCard("FirstProduct","F1RS7PR0DUC7","123454567",true,"pack");
            ProductCard pc2 = new ProductCard("SnProduct","8nPr0Duc7","09876546578",false,"service");
            productCardRepository.saveAll(List.of(pc1,pc2));
        };
    }
}
