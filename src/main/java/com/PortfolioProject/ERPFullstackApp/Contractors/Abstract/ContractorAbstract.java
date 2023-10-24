package com.PortfolioProject.ERPFullstackApp.Contractors.Abstract;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;

public abstract class ContractorAbstract {

    Long id;
    String name;
    String code;
}
