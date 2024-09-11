package com.example.elNino.entities;

import jakarta.persistence.*;

import java.time.LocalDateTime;
import java.util.List;
import java.util.UUID;

@Entity
@Table(name = "Appointments")
public class Appointments {
    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "appointment_id", unique = true, nullable = false)
    private UUID appointmentId;

    @Column(name = "time_stamp", nullable = false)
    private LocalDateTime timestamp;

    @Column(name = "service_type")
    private String service_type;

    // Relationships
//    @OneToMany
//    @JoinColumn(name = "customer_id", nullable = false)
    @ManyToOne
//    @JoinColumn(name = "customer_id")
    private Customer customer;

//    @OneToMany
//    @JoinColumn(name = "stylists_id", nullable = false)
    @ManyToOne
//    @JoinColumn(name = "stylists_id")
    private Stylists stylist;

    public Appointments(LocalDateTime timestamp, String service_type, Customer customer, Stylists stylist) {
        this.appointmentId = appointmentId;
        this.timestamp = timestamp;
        this.service_type = service_type;
        this.customer = customer;
        this.stylist = stylist;
    }

    public Appointments() {
    }

    public UUID getAppointmentId() {
        return appointmentId;
    }

    public void setAppointmentId(UUID appointmentId) {
        this.appointmentId = appointmentId;
    }

    public LocalDateTime getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(LocalDateTime timestamp) {
        this.timestamp = timestamp;
    }

    public String getService_type() {
        return service_type;
    }

    public void setService_type(String service_type) {
        this.service_type = service_type;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer_id) {
        this.customer = customer_id;
    }

    public Stylists getStylist() {
        return stylist;
    }

    public void setStylist(Stylists stylists_id) {
        this.stylist = stylists_id;
    }
}
