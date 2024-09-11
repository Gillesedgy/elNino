package com.example.elNino.entities;

import jakarta.persistence.*;

import java.time.LocalDateTime;
import java.util.List;
import java.util.UUID;

@Entity
@Table(name = "Appointments")
public class Appointments {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "appointment_id", unique = true, nullable = false)
    private UUID appointmentId;

    @Column(name = "time_stamp", nullable = false)
    private LocalDateTime timestamp;

    @Column(name = "service_type")
    private String service_type;

    // Relationships
    @OneToMany
    @JoinColumn(name = "customer_id", nullable = false)
    private List<Customer> customer_id;

    @OneToMany
    @JoinColumn(name = "stylists_id", nullable = false)
    private List<Stylists> stylists_id;

    public Appointments(LocalDateTime timestamp, String service_type, List<Customer> customer_id, List<Stylists> stylists_id) {
        this.appointmentId = appointmentId;
        this.timestamp = timestamp;
        this.service_type = service_type;
        this.customer_id = customer_id;
        this.stylists_id = stylists_id;
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

    public List<Customer> getCustomer_id() {
        return customer_id;
    }

    public void setCustomer_id(List<Customer> customer_id) {
        this.customer_id = customer_id;
    }

    public List<Stylists> getStylists_id() {
        return stylists_id;
    }

    public void setStylists_id(List<Stylists> stylists_id) {
        this.stylists_id = stylists_id;
    }
}
