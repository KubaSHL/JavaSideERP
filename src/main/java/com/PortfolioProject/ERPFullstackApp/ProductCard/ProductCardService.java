package com.PortfolioProject.ERPFullstackApp.ProductCard;

import com.PortfolioProject.ERPFullstackApp.ProductCard.Entities.ProductCard;
import jakarta.annotation.Nullable;
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

    public ProductCard getProductCardOfId(Long id){ return productCardRepository.getReferenceById(id);}

    public void addProductCard(ProductCard pc) {
        try{
        productCardRepository.save(pc);
        }
        catch(Exception ex){
            throw new IllegalStateException("EXCEPTION THROWN:"+ex.getMessage());
        }
    }

    public void deleteProductCard(Long id) {
        boolean exist = productCardRepository.existsById(id);
        if(!exist){
            throw new IllegalStateException("ID NOT FOUND:"+id);
        }
        productCardRepository.delete(productCardRepository.findById(id).get());
    }

    public void updateProductCard(Long id, @Nullable String name, @Nullable String ean, @Nullable Boolean active, @Nullable String unitOfMeasurement){
        boolean exists = productCardRepository.existsById(id);
        if(!exists){
            throw new IllegalStateException("ID NOT FOUND:"+id);
        }
        if(ean != null && !ean.isEmpty()) productCardRepository.getReferenceById(id).setEan(ean);
        if(name != null && !name.isEmpty()) productCardRepository.getReferenceById(id).setName(name);
        if(active != null) productCardRepository.getReferenceById(id).setActive(active);
        if(unitOfMeasurement != null && !unitOfMeasurement.isEmpty()) productCardRepository.getReferenceById(id).setUnitOfMeasurement(unitOfMeasurement);
        productCardRepository.save(productCardRepository.getReferenceById(id));
    }
}
