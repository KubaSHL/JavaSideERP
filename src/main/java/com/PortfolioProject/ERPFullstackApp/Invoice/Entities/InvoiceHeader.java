package com.PortfolioProject.ERPFullstackApp.Invoice.Entities;

import com.PortfolioProject.ERPFullstackApp.Contractors.Entities.IContractor;
import com.PortfolioProject.ERPFullstackApp.AbstractModels.DocumentStruct.DocumentHeader;
import com.PortfolioProject.ERPFullstackApp.Payment.Abstract.Payment;
import jakarta.persistence.*;

import java.util.Date;
@Entity
@Table(name = "invoice_headers_list")
public class InvoiceHeader extends DocumentHeader {

    public InvoiceHeader() {
    }

    public InvoiceHeader(IContractor contractor, Date date, Date dueTo, Payment payment) {
        super(contractor, date, dueTo, payment);
    }
}
