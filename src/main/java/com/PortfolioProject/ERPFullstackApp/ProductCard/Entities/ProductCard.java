package com.PortfolioProject.ERPFullstackApp.ProductCard.Entities;

import com.PortfolioProject.ERPFullstackApp.ProductCard.Entities.ProductPrices.ListOfPrices;
import com.PortfolioProject.ERPFullstackApp.ProductCard.Enums.ProductTypeEnum;
import com.PortfolioProject.ERPFullstackApp.ProductCard.ProductCardService;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotEmpty;
import org.hibernate.annotations.JdbcTypeCode;
import org.hibernate.type.SqlTypes;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import java.time.Instant;
import java.time.LocalDateTime;

@Entity
@Table(name = "ProductCardList")
public class ProductCard {

    @Id
    @SequenceGenerator(
            name = "productCard_sequence",
            sequenceName = "productCard_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "productCard_sequence"
    )
    private Long id;
    @Column(unique = true, nullable = false)
    @NotEmpty(message = "Product's name cannot be empty.")
    private String name;
    @Column(unique = true, nullable = false)
    @NotEmpty(message = "Product's code cannot be empty.")
    private String code;
    @Column(unique = true)
    private String ean;
    private Boolean active;
    private String unitOfMeasurement;
    @Column(nullable = false)
    @NotEmpty(message = "Product's type cannot be empty.")
    private String productTypeEnum;
    @JdbcTypeCode(SqlTypes.JSON)
    @Column
    private ListOfPrices listOfPrices;
    @CreatedDate
    @Column(updatable = false)
    private Instant createdDate;
    @LastModifiedDate
    private LocalDateTime lastModifiedDate;

    public ProductCard( String name, String code, String ean, Boolean active, String unitOfMeasurement, ProductTypeEnum productTypeEnum) {

        this.name = name;
        this.code = code;
        this.ean = ean;
        this.active = active;
        this.unitOfMeasurement = unitOfMeasurement;
        this.productTypeEnum = productTypeEnum.getDisplayValue();

    }

    public ProductCard(){}

    public Long getId() {
        return id;
    }

    private void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getEan() {
        return ean;
    }

    public void setEan(String ean) {
        this.ean = ean;
    }

    public Boolean getActive() {
        return active;
    }

    public void setActive(Boolean active) {
        this.active = active;
    }

    public String getUnitOfMeasurement() {
        return unitOfMeasurement;
    }

    public void setUnitOfMeasurement(String unitOfMeasurement) {
        this.unitOfMeasurement = unitOfMeasurement;
    }

    public String getProductTypeEnum() {
        return productTypeEnum;
    }

    public void setProductTypeEnum(ProductTypeEnum productTypeEnum) {
        this.productTypeEnum = productTypeEnum.getDisplayValue();
    }

    public ListOfPrices getListOfPrices() { return listOfPrices; }

    public void setListOfPrices(ListOfPrices listOfPrices) { this.listOfPrices = listOfPrices; }

    public Instant getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Instant createdDate) {
        this.createdDate = createdDate;
    }

    public LocalDateTime getLastModifiedDate() {
        return lastModifiedDate;
    }

    public void setLastModifiedDate(LocalDateTime lastModifiedDate) {
        this.lastModifiedDate = lastModifiedDate;
    }
}
