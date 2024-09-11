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

    @Column(name = "Style_image", nullable = false)
    private String style_image;

//    @OneToMany
////    @JoinColumn(name = "customer_id", nullable = false)
//    private List<Customer> customer_id;

    @OneToMany(mappedBy = "stylist")
//    @JoinColumn(name = "customer_id", nullable = false)
    private List<Appointments> appointments;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getStylist_id() {
        return stylist_id;
    }

    public void setStylist_id(Long stylist_id) {
        this.stylist_id = stylist_id;
    }

    public String getStylist_name() {
        return stylist_name;
    }

    public void setStylist_name(String stylist_name) {
        this.stylist_name = stylist_name;
    }

    public String getSpecilizations() {
        return specilizations;
    }

    public void setSpecilizations(String specilizations) {
        this.specilizations = specilizations;
    }

    public String getAvailability() {
        return availability;
    }

    public void setAvailability(String availability) {
        this.availability = availability;
    }

//    public List<Customer> getCustomer_id() {
//        return customer;
//    }
//
//    public void setCustomer_id(List<Customer> customer_id) {
//        this.customer = customer_id;
//    }

    public String getStyle_image() {
        return style_image;
    }
    public void setStyle_image(String style_image) {
        this.style_image = style_image;
    }
}
