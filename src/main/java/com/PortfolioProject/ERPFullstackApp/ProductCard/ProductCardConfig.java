package com.PortfolioProject.ERPFullstackApp.ProductCard;

import com.PortfolioProject.ERPFullstackApp.ProductCard.Entities.ProductCard;
import com.PortfolioProject.ERPFullstackApp.ProductCard.Enums.ProductTypeEnum;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
public class ProductCardConfig {

    @Bean
    CommandLineRunner commandLineRunnerProductCard(
            ProductCardRepository productCardRepository){
//        ListOfPrices list1 = new ListOfPrices();
//        list1.addToListOfPrices(new PriceGrossA(99.99,true ));
//        ListOfPrices list2 = new ListOfPrices();
//        list2.addToListOfPrices(new PriceNetA(25.50,true ));
        return  args -> {
            ProductCard pc1 = new ProductCard("FirstProduct","F1RS7PR0DUC7","123454567",true,"pack", ProductTypeEnum.WARE);
            ProductCard pc2 = new ProductCard("SnProduct", "8nPr0Duc7", "09876546578", false, "service", ProductTypeEnum.SERVICE);
            productCardRepository.saveAll(List.of(pc1,pc2));
        };
    }
}
