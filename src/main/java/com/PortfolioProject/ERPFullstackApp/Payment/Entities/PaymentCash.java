package com.PortfolioProject.ERPFullstackApp.Payment.Entities;

import com.PortfolioProject.ERPFullstackApp.Payment.Abstract.Payment;

public class PaymentCash extends Payment {
    public PaymentCash() {
    }

    public PaymentCash(String code, String type) {
        super(code, type);
    }
}
