package com.PortfolioProject.ERPFullstackApp.Invoice;

import com.PortfolioProject.ERPFullstackApp.Invoice.Entities.Invoice;
import com.PortfolioProject.ERPFullstackApp.Invoice.Entities.InvoiceBody;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class InvoiceService {

    private final InvoiceRepository invoiceRepository;

    @Autowired
    public InvoiceService(InvoiceRepository invoiceRepository) {
        this.invoiceRepository = invoiceRepository;
    }

    public List<Invoice> getAllInvoices(){ return invoiceRepository.findAll();
    }

    public Invoice getInvoiceOfId(Long id){return invoiceRepository.getReferenceById(id);
    }

    public void addInvoice(Invoice invoice){
        try {
            invoiceRepository.save(invoice);
        }catch (Exception ex){
            throw new IllegalStateException("ERROR ADDING INVOICE, EXCEPTION:" + ex.getMessage());
        }
    }

}
