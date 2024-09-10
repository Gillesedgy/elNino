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

    public Long getId() {
        return id;
    }

    public Long getStylist_id() {
        return stylist_id;
    }

    public String getStylist_name() {
        return stylist_name;
    }

    public String getSpecilizations() {
        return specilizations;
    }

    public String getAvailability() {
        return availability;
    }

    public List<Customer> getCustomer_id() {
        return customer_id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setStylist_id(Long stylist_id) {
        this.stylist_id = stylist_id;
    }

    public void setStylist_name(String stylist_name) {
        this.stylist_name = stylist_name;
    }

    public void setSpecilizations(String specilizations) {
        this.specilizations = specilizations;
    }

    public void setAvailability(String availability) {
        this.availability = availability;
    }

    public void setCustomer_id(List<Customer> customer_id) {
        this.customer_id = customer_id;
    }

    public Stylists(Long id, Long stylist_id, String stylist_name, String specilizations, String availability, List<Customer> customer_id) {
        this.id = id;
        this.stylist_id = stylist_id;
        this.stylist_name = stylist_name;
        this.specilizations = specilizations;
        this.availability = availability;
        this.customer_id = customer_id;
    }

    public Stylists() {}

}
