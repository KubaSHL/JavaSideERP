package com.PortfolioProject.ERPFullstackApp.ProductCard.Enums;

import com.PortfolioProject.ERPFullstackApp.ProductCard.Entities.ProductCard;
import com.PortfolioProject.ERPFullstackApp.ProductCard.ProductCardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class ProductCardControllerForThyme {

    private final ProductCardService productCardService;
    @Autowired
    public ProductCardControllerForThyme(ProductCardService productCardService){
        this.productCardService = productCardService;
    }

    @GetMapping("/addProductCardForm")
    public String addProductCardForm(Model model){
        ProductCard productCard = new ProductCard();
        model.addAttribute("productCard",productCard);
        return "/ProductCard/add_product_card_form";
    }


    @PostMapping("/addProductCardForm")
    public String submitForm(@ModelAttribute("productCard") ProductCard productCard) {
        System.out.println(productCard);
        productCardService.addProductCard(productCard);
        return "/ProductCard/conformation_add_product_card";
    }

}
