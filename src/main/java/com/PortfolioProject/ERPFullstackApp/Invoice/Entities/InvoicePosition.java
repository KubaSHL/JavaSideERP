package com.PortfolioProject.ERPFullstackApp.Invoice.Entities;

import com.PortfolioProject.ERPFullstackApp.DocumentStruct.DocumentPosition;
import jakarta.persistence.*;

@Entity
@Table(name = "invoice_position_list")
public class InvoicePosition extends DocumentPosition {

    @Id
    @SequenceGenerator(
            name = "invoice_body_sequence",
            sequenceName = "invoice_body_sequence",
            allocationSize = 1)
    @GeneratedValue(
            strategy =  GenerationType.SEQUENCE,
            generator = "invoice_body_sequence")
    Long id;

    public InvoicePosition() {
    }

    public InvoicePosition(Long positionId, String productCode, String description, Float priceGross, Float priceNet, Integer vat) {
        super(positionId, productCode, description, priceGross, priceNet, vat);
    }

    public Long getId() {
        return id;
    }

    private void setId(Long id) {
        this.id = id;
    }
}

