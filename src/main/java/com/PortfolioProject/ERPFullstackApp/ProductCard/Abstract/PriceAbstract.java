package com.PortfolioProject.ERPFullstackApp.ProductCard.Abstract;

import com.PortfolioProject.ERPFullstackApp.ProductCard.Enums.PriceTypeEnum;

public abstract class PriceAbstract {

    Long id;
    Double price;
    PriceTypeEnum type;
    Boolean active;
    public abstract Long getId();

    public abstract double getPrice();

    protected abstract void setPrice(Double price);

    public abstract PriceTypeEnum getType();

    protected abstract void setType(PriceTypeEnum type);

    public abstract Boolean getActive();

    protected abstract void setActive(Boolean active);

}
