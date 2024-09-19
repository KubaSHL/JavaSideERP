package com.PortfolioProject.ERPFullstackApp.Contractors;

import com.PortfolioProject.ERPFullstackApp.Contractors.Entities.IContractor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ContractorsRepository extends JpaRepository<IContractor, Long> {
}
