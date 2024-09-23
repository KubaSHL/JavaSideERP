package com.PortfolioProject.ERPFullstackApp.AbstractModels.DocumentStruct;

import com.PortfolioProject.ERPFullstackApp.ProductCard.Entities.ProductCard;
import jakarta.persistence.*;


@Entity
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public abstract class DocumentPosition {
    @Id
    @SequenceGenerator(
            name = "document_position_sequence",
            sequenceName = "document_position_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "document_position_sequence"
    )
    private Long positionId;
    @OneToOne(targetEntity = ProductCard.class, cascade = CascadeType.MERGE)
    private Long productCardId;
    private String productCode;
    private String description;
    private Float priceGross;
    private Float priceNet;
    private Integer vat;

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

    public Long getProductCardId() {
        return productCardId;
    }

    public void setProductCardId(Long productCardId) {
        this.productCardId = productCardId;
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