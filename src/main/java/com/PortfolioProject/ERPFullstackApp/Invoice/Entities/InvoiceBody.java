package com.PortfolioProject.ERPFullstackApp.Invoice.Entities;

import com.PortfolioProject.ERPFullstackApp.AbstractModels.DocumentStruct.DocumentBody;
import com.PortfolioProject.ERPFullstackApp.AbstractModels.DocumentStruct.DocumentPosition;
import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "invoice_body_list")
public class InvoiceBody extends DocumentBody {

    public InvoiceBody() {
    }

    public InvoiceBody(List<DocumentPosition> documentPositionList) {
        super(documentPositionList);
    }

}
