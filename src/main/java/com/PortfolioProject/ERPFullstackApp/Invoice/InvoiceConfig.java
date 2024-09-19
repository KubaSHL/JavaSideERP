package com.PortfolioProject.ERPFullstackApp.Invoice;

import com.PortfolioProject.ERPFullstackApp.Contractors.Entities.IContractor;
import com.PortfolioProject.ERPFullstackApp.AbstractModels.DocumentStruct.DocumentPosition;
import com.PortfolioProject.ERPFullstackApp.AbstractModels.DocumentStruct.Enums.DocumentTypeEnum;
import com.PortfolioProject.ERPFullstackApp.Invoice.Entities.*;
import com.PortfolioProject.ERPFullstackApp.Payment.Entities.PaymentOnline;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.DependsOn;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Configuration
public class InvoiceConfig {

    @Bean("InvoiceConfig")
    @DependsOn ({"ProductCardConfig","ContractorConfig"})
    CommandLineRunner commandLineRunnerInvoice(
            InvoiceRepository invoiceRepository
    ){
        DocumentPosition invoicePosition = new InvoicePosition(1L, "F1RS7PR0DUC7","It's first position on invoice", 14.1F, 10F, 401  );
        List<DocumentPosition> documentPositionList = new ArrayList<>();
        documentPositionList.add(invoicePosition);
        InvoiceBody invoiceBody1 = new InvoiceBody(documentPositionList);
        InvoiceHeader invoiceHeader1 = new InvoiceHeader(new IContractor("testName3", "093871663451"), new Date(), new Date(), new PaymentOnline());
        InvoiceMetaData invoiceMetaData1 = new InvoiceMetaData(DocumentTypeEnum.SELLINVOICE,"Admin");
        return  args -> {

            Invoice invoice1 = new Invoice(invoiceMetaData1, invoiceHeader1, invoiceBody1);
            invoiceRepository.saveAll(List.of(invoice1));
        };
    };

}
