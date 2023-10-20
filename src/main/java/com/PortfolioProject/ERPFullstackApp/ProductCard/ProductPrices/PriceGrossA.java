package com.PortfolioProject.ERPFullstackApp.ProductCard.ProductPrices;

import com.PortfolioProject.ERPFullstackApp.ProductCard.Enums.PriceTypeEnum;
import com.PortfolioProject.ERPFullstackApp.ProductCard.Abstract.PriceAbstract;
import com.PortfolioProject.ERPFullstackApp.ProductCard.Abstract.PriceInterface;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;

public class PriceGrossA extends PriceAbstract implements PriceInterface {

    @Id
    @SequenceGenerator(
            name = "price_sequence",
            sequenceName = "price_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "price_sequence"
    )
    private Long id;
    private double price;
    private PriceTypeEnum priceType = PriceTypeEnum.GROSS;
    private Boolean active;

    @Override
    public Long getId() {
        return this.id;
    }

    @Override
    public double getPrice() {
        return this.price;
    }

    @Override
    protected void setPrice(Double price) {
        this.price = price;
    }

    @Override
    public PriceTypeEnum getType() {
        return priceType;
    }

    @Override
    protected void setType(PriceTypeEnum type) {
        this.priceType = type;
    }

    @Override
    public Boolean getActive() {
        return active;
    }

    @Override
    protected void setActive(Boolean active) {
        this.active = active;
    }

    public PriceGrossA() {
    }

    public PriceGrossA(double price, Boolean active) {
        this.price = price;
        this.active = active;
    }
}
