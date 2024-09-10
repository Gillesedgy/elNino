package com.example.elNino.entities;

import java.util.Date;
import java.util.UUID;

public class Appointments {
    private UUID appointmentId;
    private Date appointmentDate;
    private String service_type;

    // Relationships
    private Customer customer;
    private

    public UUID getAppointmentId() {
        return appointmentId;
    }

    public void setAppointmentId(UUID appointmentId) {
        this.appointmentId = appointmentId;
    }

    public Date getAppointmentDate() {
        return appointmentDate;
    }

    public void setAppointmentDate(Date appointmentDate) {
        this.appointmentDate = appointmentDate;
    }

    public String getService_type() {
        return service_type;
    }

    public void setService_type(String service_type) {
        this.service_type = service_type;
    }
}
