package com.PortfolioProject.ERPFullstackApp.Invoice.Entities;

import com.PortfolioProject.ERPFullstackApp.DocumentStruct.DocumentBody;
import com.PortfolioProject.ERPFullstackApp.DocumentStruct.DocumentPosition;
import jakarta.persistence.*;

import java.util.List;
@Entity
@Table(name = "invoice_body_list")
public class InvoiceBody extends DocumentBody {
    @Id
    @SequenceGenerator(
            name = "invoice_body_sequence",
            sequenceName = "invoice_body_sequence",
            allocationSize = 1)
    @GeneratedValue(
            strategy =  GenerationType.SEQUENCE,
            generator = "invoice_body_sequence")
    Long id;

    public InvoiceBody() {
    }

    public InvoiceBody(List<DocumentPosition> documentPositionList) {
        super(documentPositionList);
    }

    public Long getId() {
        return id;
    }

    private void setId(Long id) {
        this.id = id;
    }
}
