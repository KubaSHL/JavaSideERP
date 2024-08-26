package com.PortfolioProject.ERPFullstackApp.Payment.Entities;

import com.PortfolioProject.ERPFullstackApp.Payment.Abstract.Payment;

public class PaymentOnline extends Payment {

    public PaymentOnline() {
    }

    public PaymentOnline(String code, String type) {
        super(code, type);
    }
}
