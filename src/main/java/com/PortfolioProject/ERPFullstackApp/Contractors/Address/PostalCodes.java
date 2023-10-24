package com.PortfolioProject.ERPFullstackApp.Contractors.Address;

import jakarta.persistence.*;

@Entity
@Table(name = "PostalCodesList")
public class PostalCodes {

    @Id
    @SequenceGenerator(name = "PostalCode_sequence",
            sequenceName = "PostalCode_sequence",
            allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE,
            generator = "PostalCode_sequence")
    Long id;
}
