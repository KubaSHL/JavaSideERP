package com.PortfolioProject.ERPFullstackApp.ProductCard;

import com.PortfolioProject.ERPFullstackApp.ProductCard.Entities.ProductCard;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "api/v1/productCard")
public class ProductCardControler {


    private final ProductCardService productCardService;
    @Autowired
    public ProductCardControler(ProductCardService productCardService){
        this.productCardService = productCardService;
    }


    @GetMapping("/list")
    public  List<ProductCard> listAll() {
         return productCardService.getListOfProducts();
    }

    @PostMapping("/addProductCard")
    public void addProductCard(@RequestBody ProductCard productCard){
        productCardService.addProductCard(productCard);
    }

    @DeleteMapping(path = "{deleteProductCard}")
    public void deleteProductCard(@PathVariable("deleteProductCard") Long id){ productCardService.deleteProductCard(id);}



}
