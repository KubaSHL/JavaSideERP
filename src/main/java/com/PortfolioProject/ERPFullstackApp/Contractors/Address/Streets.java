package com.PortfolioProject.ERPFullstackApp.Contractors.Address;

import jakarta.persistence.*;

@Entity
@Table(name = "StreetsList")
public class Streets {

    @Id
    @SequenceGenerator(name = "Streets_sequence",
            sequenceName = "Streets_sequence",
            allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE,
            generator = "Streets_sequence")
    Long id;
}
