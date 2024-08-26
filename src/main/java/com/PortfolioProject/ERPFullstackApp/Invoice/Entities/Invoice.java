package com.PortfolioProject.ERPFullstackApp.Invoice.Entities;

import com.PortfolioProject.ERPFullstackApp.DocumentStruct.Document;
import com.PortfolioProject.ERPFullstackApp.DocumentStruct.DocumentBody;
import com.PortfolioProject.ERPFullstackApp.DocumentStruct.DocumentHeader;
import com.PortfolioProject.ERPFullstackApp.DocumentStruct.DocumentMetaData;
import jakarta.persistence.*;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

@Entity
@Table(name = "invoice_list")
@EntityListeners(AuditingEntityListener.class)
public class Invoice extends Document {

    @Id
    @SequenceGenerator(
            name = "invoice_sequence",
            sequenceName = "invoice_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "invoice_sequence"
    )
    private Long id;



    public Invoice() {
    }

    public Invoice(DocumentMetaData documentMetaData, DocumentHeader documentHeader, DocumentBody documentBody) {
        super(documentMetaData, documentHeader, documentBody);
    }

    public Long getId() {
        return id;
    }

    private void setId(Long id) {
        this.id = id;
    }
}
