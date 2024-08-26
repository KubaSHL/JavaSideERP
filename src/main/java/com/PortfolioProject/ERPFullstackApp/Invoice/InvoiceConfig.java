package com.PortfolioProject.ERPFullstackApp.Invoice;

import com.PortfolioProject.ERPFullstackApp.Contractors.Entities.Contractor;
import com.PortfolioProject.ERPFullstackApp.DocumentStruct.DocumentPosition;
import com.PortfolioProject.ERPFullstackApp.DocumentStruct.Enums.DocumentTypeEnum;
import com.PortfolioProject.ERPFullstackApp.Invoice.Entities.*;
import com.PortfolioProject.ERPFullstackApp.Payment.Entities.PaymentOnline;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Configuration
public class InvoiceConfig {

    @Bean
    CommandLineRunner commandLineRunnerInvoice(
            InvoiceRepository invoiceRepository
    ){
        return  args -> {
            List<DocumentPosition> invoicePositionList1 = new ArrayList<DocumentPosition>();
            invoicePositionList1.add(new InvoicePosition(1L, "F1RS7PR0DUC7","It's first position on invoice", 14.1F, 10F, 401  ));
            InvoiceBody invoiceBody1 = new InvoiceBody(invoicePositionList1);
            InvoiceHeader invoiceHeader1 = new InvoiceHeader(new Contractor("testName1", "0938716273841"), new Date(), new Date(), new PaymentOnline());
            InvoiceMetaData invoiceMetaData1 = new InvoiceMetaData(DocumentTypeEnum.SELLINVOICE,"Admin");
            Invoice invoice1 = new Invoice(invoiceMetaData1, invoiceHeader1, invoiceBody1);
            invoiceRepository.save(invoice1);
        };
    };

}
