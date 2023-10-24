package com.PortfolioProject.ERPFullstackApp.Contractors;

import com.PortfolioProject.ERPFullstackApp.Contractors.Entities.Contractors;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ContractorsRepository extends JpaRepository<Contractors, Long> {
}
