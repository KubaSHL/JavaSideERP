package com.PortfolioProject.ERPFullstackApp.ProductCard;

import com.PortfolioProject.ERPFullstackApp.ProductCard.Entities.ProductCard;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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

    public void addProductCard(ProductCard pc) {
        try{
        productCardRepository.save(pc);
        }
        catch(Exception ex){
            throw new IllegalStateException("EXEPTION THROWN:"+ex.getMessage());
        }
    }

    public void deleteProductCard(Long id) {
        boolean exist = productCardRepository.existsById(id);
        if(!exist){
            throw new IllegalStateException("NOT FOUND ID:"+id);
        }
        productCardRepository.delete(productCardRepository.findById(id).get());
    }
}
