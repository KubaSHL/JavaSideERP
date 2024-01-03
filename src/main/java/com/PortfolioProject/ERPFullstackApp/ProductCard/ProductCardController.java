package com.PortfolioProject.ERPFullstackApp.ProductCard;

import com.PortfolioProject.ERPFullstackApp.ProductCard.Entities.ProductCard;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "api/v1/productCard")
public class ProductCardController {


    private final ProductCardService productCardService;
    @Autowired
    public ProductCardController(ProductCardService productCardService){
        this.productCardService = productCardService;
    }

    @GetMapping("/ping")
    public String ping(){ return "ProductController responding.";}

    @GetMapping("/listOfAllProductCards")
    public  List<ProductCard> getListOfProductCards() {
         return productCardService.getListOfProducts();
    }

    @PostMapping("/addProductCard")
    public void addProductCard(@RequestBody ProductCard productCard){
        productCardService.addProductCard(productCard);
    }

    @DeleteMapping(path = "deleteId={deleteProductCard}")
    public void deleteProductCard(@PathVariable("deleteProductCard") Long id){ productCardService.deleteProductCard(id);}

    @PutMapping("/updateProductCard")
    public void updateProductCard(@RequestBody ProductCard productCard) { productCardService.updateProductCard(productCard.getId(),productCard.getName(), productCard.getEan(), productCard.getActive(), productCard.getUnitOfMeasurement());}

}
