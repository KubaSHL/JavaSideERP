package com.PortfolioProject.ERPFullstackApp.Invoice.Entities;

import com.PortfolioProject.ERPFullstackApp.DocumentStruct.DocumentMetaData;
import com.PortfolioProject.ERPFullstackApp.DocumentStruct.Enums.DocumentTypeEnum;
import jakarta.persistence.*;

@Entity
@Table(name = "invoice_meta_data_list")
public class InvoiceMetaData extends DocumentMetaData {

    @Id
    @SequenceGenerator(
            name = "invoice_meta_data_sequence",
            sequenceName = "invoice_meta_data_sequence",
            allocationSize = 1)
    @GeneratedValue(
            strategy =  GenerationType.SEQUENCE,
            generator = "invoice_meta_data_sequence")
    Long id;

    public InvoiceMetaData() {
    }

    public InvoiceMetaData( DocumentTypeEnum type, String createdBy) {
        super(type, createdBy);
    }

    public Long getId() {
        return id;
    }

    private void setId(Long id) {
        this.id = id;
    }
}
