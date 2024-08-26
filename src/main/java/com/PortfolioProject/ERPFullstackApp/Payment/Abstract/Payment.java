package com.PortfolioProject.ERPFullstackApp.Payment.Abstract;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;

public abstract class Payment {
    @Id
    @SequenceGenerator(
            name = "payment_sequence",
            sequenceName = "payment_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "payment_sequence"
    )
    Long id;
    String code;
    String type;

    public Payment() {
    }

    public Payment( String code, String type) {
        this.code = code;
        this.type = type;
    }
}