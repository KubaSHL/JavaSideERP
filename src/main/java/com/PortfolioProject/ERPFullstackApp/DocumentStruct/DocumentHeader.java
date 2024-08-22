package com.PortfolioProject.ERPFullstackApp.DocumentStruct;

import com.PortfolioProject.ERPFullstackApp.Contractors.Entities.Contractor;
import com.PortfolioProject.ERPFullstackApp.Payment.Payment;

import java.util.Date;

public abstract class  DocumentHeader {
    Contractor contractor;
    Date date;
    Date dueTo;
    Payment payment;

}