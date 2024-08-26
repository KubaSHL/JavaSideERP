package com.PortfolioProject.ERPFullstackApp.DocumentStruct;

import com.PortfolioProject.ERPFullstackApp.Contractors.Entities.Contractor;
import com.PortfolioProject.ERPFullstackApp.Payment.Payment;

import java.util.Date;

public abstract class  DocumentHeader {
    Contractor contractor;
    Date date;
    Date dueTo;
    Payment payment;

    public DocumentHeader() {
    }

    public DocumentHeader(Contractor contractor, Date date, Date dueTo, Payment payment) {
        this.contractor = contractor;
        this.date = date;
        this.dueTo = dueTo;
        this.payment = payment;
    }

    public Contractor getContractor() {
        return contractor;
    }

    public void setContractor(Contractor contractor) {
        this.contractor = contractor;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Date getDueTo() {
        return dueTo;
    }

    public void setDueTo(Date dueTo) {
        this.dueTo = dueTo;
    }

    public Payment getPayment() {
        return payment;
    }

    public void setPayment(Payment payment) {
        this.payment = payment;
    }
}