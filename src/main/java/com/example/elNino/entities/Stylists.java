package com.example.elNino.entities;


import jakarta.persistence.*;

import java.util.List;


@Entity
@Table(name = "Stylists")
public class Stylists {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "stylist_id", nullable = false)
    private Long stylist_id;

    @Column(name = "Stylist_name", nullable = false)
    private String stylist_name;

    @Column(name = "Specilizations", nullable = false)
    private String specilizations;

    @Column(name = "Availability", nullable = false)
    private String availability;

    @OneToMany
    @JoinColumn(name = "customer_id", nullable = false)
    private List<Customer> customer_id;

}
