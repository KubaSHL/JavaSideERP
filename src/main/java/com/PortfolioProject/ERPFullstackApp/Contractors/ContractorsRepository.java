package com.PortfolioProject.ERPFullstackApp.Contractors;

import com.PortfolioProject.ERPFullstackApp.Contractors.Entities.Contractor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ContractorsRepository extends JpaRepository<Contractor, Long> {
}
