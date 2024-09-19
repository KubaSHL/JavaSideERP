package com.PortfolioProject.ERPFullstackApp.Invoice.Entities;

import com.PortfolioProject.ERPFullstackApp.AbstractModels.DocumentStruct.Document;
import jakarta.persistence.*;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

@Entity
@Table(name = "invoice_list")
@EntityListeners(AuditingEntityListener.class)
public class Invoice extends Document {

    public Invoice() {
    }

    public Invoice(InvoiceMetaData documentMetaData, InvoiceHeader documentHeader, InvoiceBody documentBody) {
        super(documentMetaData, documentHeader, documentBody);
    }

}
