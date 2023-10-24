package com.PortfolioProject.ERPFullstackApp.Contractors.Address;

import jakarta.persistence.*;

@Entity
@Table(name = "CitiesList")
public class Cities {

    @Id
    @SequenceGenerator(name = "Cities_sequence",
            sequenceName = "Cities_sequence",
            allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE,
            generator = "Cities_sequence")
    Long id;
    String name;
    String shortcut;
}
