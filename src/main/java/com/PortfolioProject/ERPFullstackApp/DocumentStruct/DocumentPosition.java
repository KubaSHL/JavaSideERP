package com.PortfolioProject.ERPFullstackApp.DocumentStruct;

public abstract class DocumentPosition {
    Long positionId;
    String productCode;
    String description;
    Float priceGross;
    Float priceNet;
    Integer vat;

    public DocumentPosition() {
    }

    public DocumentPosition(Long positionId, String productCode, String description, Float priceGross, Float priceNet, Integer vat) {
        this.positionId = positionId;
        this.productCode = productCode;
        this.description = description;
        this.priceGross = priceGross;
        this.priceNet = priceNet;
        this.vat = vat;
    }

    public Long getPositionId() {
        return positionId;
    }

    private void setPositionId(Long positionId) {
        this.positionId = positionId;
    }

    public String getProductCode() {
        return productCode;
    }

    public void setProductCode(String productCode) {
        this.productCode = productCode;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Float getPriceGross() {
        return priceGross;
    }

    public void setPriceGross(Float priceGross) {
        this.priceGross = priceGross;
    }

    public Float getPriceNet() {
        return priceNet;
    }

    public void setPriceNet(Float priceNet) {
        this.priceNet = priceNet;
    }

    public Integer getVat() {
        return vat;
    }

    public void setVat(Integer vat) {
        this.vat = vat;
    }
}