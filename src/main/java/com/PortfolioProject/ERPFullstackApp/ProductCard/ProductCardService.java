package com.PortfolioProject.ERPFullstackApp.ProductCard;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Service
public class ProductCardService {

    private final ProductCardRepository productCardRepository;

    @Autowired
    public ProductCardService(ProductCardRepository productCardRepository){
        this.productCardRepository = productCardRepository;
    }

    public List<ProductCard> getListOfProducts(){
        return productCardRepository.findAll();
    }
    public void addProductCard(ProductCard pc){
         productCardRepository.save(pc);
         System.out.println(pc);
    }
}
