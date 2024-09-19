package com.PortfolioProject.ERPFullstackApp.Invoice.Entities;

import com.PortfolioProject.ERPFullstackApp.DocumentStruct.DocumentPosition;
import jakarta.persistence.*;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

@Entity
@Table(name = "invoice_position_list")
@EntityListeners(AuditingEntityListener.class)
public class InvoicePosition extends DocumentPosition {



    public InvoicePosition() {
    }

    public InvoicePosition(Long positionId, String productCode, String description, Float priceGross, Float priceNet, Integer vat) {
        super(positionId, productCode, description, priceGross, priceNet, vat);
    }


}

