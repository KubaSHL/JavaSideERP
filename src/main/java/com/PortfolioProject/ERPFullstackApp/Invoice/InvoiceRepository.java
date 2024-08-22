package com.PortfolioProject.ERPFullstackApp.Invoice;

import com.PortfolioProject.ERPFullstackApp.Invoice.Entities.Invoice;
import org.springframework.data.jpa.repository.JpaRepository;

public interface InvoiceRepository extends JpaRepository<Invoice, Long> {
}
