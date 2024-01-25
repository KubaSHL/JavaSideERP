package com.PortfolioProject.ERPFullstackApp.ProductCard;

import com.PortfolioProject.ERPFullstackApp.ProductCard.Entities.ProductCard;
import com.PortfolioProject.ERPFullstackApp.ProductCard.Enums.ProductTypeEnum;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import java.util.Arrays;
import java.util.List;

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
        List<ProductTypeEnum> listOfProductTypeEnum = Arrays.asList(ProductTypeEnum.WARE, ProductTypeEnum.SERVICE, ProductTypeEnum.DELIVERY);
        model.addAttribute("typesOfProduct", listOfProductTypeEnum);
        return "/ProductCard/add_product_card_form";
    }

    @PostMapping("/addProductCardForm")
    public String submitForm(@Valid @ModelAttribute("productCard") ProductCard productCard, BindingResult result) {
        try{
        System.out.println(productCard);
        productCardService.addProductCard(productCard);
        }catch (Exception ex){
            ObjectError error = new ObjectError("ResponseError", ex.getMessage());
            result.addError(error);
        }

        if (result.hasErrors()) {
            return "/ProductCard/add_product_card_form";
        }
        return "/ProductCard/conformation_add_product_card";
    }

}
