package com.example.elNino.entities;

import jakarta.persistence.*;

import java.time.LocalDateTime;
import java.util.List;
import java.util.UUID;

@Entity
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


}
