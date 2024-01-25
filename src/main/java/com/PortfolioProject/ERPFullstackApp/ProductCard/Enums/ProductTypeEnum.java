package com.PortfolioProject.ERPFullstackApp.ProductCard.Enums;

public enum ProductTypeEnum {
    WARE("Ware"),
    SERVICE("Service"),
    DELIVERY("Delivery");

    private final String displayValue;

    private ProductTypeEnum(String displayValue) {
        this.displayValue = displayValue;
    }

    public String getDisplayValue() {
        return displayValue;
    }
}
