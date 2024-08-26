package com.PortfolioProject.ERPFullstackApp.Invoice;

import com.PortfolioProject.ERPFullstackApp.Invoice.Entities.Invoice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path = "api/v1/Invoice")
public class InvoiceController {

    private final InvoiceService invoiceService;
    @Autowired
    public InvoiceController(InvoiceService invoiceService) {
        this.invoiceService = invoiceService;
    }

    @GetMapping("/ping")
    public String ping(){return "Invoice Controller Responding.";}

    @GetMapping("/listOfAllInvoices")
    public List<Invoice> getListOfInvoices(){return invoiceService.getAllInvoices();}

    @GetMapping("/addInvoice")
    public void addInvoice(@RequestBody Invoice invoice){invoiceService.addInvoice(invoice);}

}
