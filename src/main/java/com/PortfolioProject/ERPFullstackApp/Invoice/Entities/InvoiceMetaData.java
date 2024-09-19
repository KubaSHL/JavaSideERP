package com.PortfolioProject.ERPFullstackApp.Invoice.Entities;

import com.PortfolioProject.ERPFullstackApp.DocumentStruct.DocumentMetaData;
import com.PortfolioProject.ERPFullstackApp.DocumentStruct.Enums.DocumentTypeEnum;
import jakarta.persistence.*;

@Entity
@Table(name = "invoice_meta_data_list")
public class InvoiceMetaData extends DocumentMetaData {


    public InvoiceMetaData() {
    }

    public InvoiceMetaData( DocumentTypeEnum type, String createdBy) {
        super(type, createdBy);
    }

}
