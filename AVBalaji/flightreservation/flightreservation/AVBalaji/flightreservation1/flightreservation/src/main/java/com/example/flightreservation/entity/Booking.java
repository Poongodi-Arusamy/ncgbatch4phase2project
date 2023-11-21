package com.example.flightreservation.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.Past;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Date;
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "booking_info")
public class Booking {
    @Id
    @Column(name = "booking_id")
    private String bookingId;

    @Column(name = "booking_date")
    private Date bookingDate;

    @ManyToOne
    @JoinColumn(name = "f_no")
    private Flight flight;

    @ManyToOne
    @JoinColumn(name = "c_id")
    private Customer customer;

    @Column(name = "price")
    private Integer totalPrice;

    @Column(name = "seats_book")
    private Integer seatsBooked;

    @Column(name = "depart_date")
    @Past(message = "DepartureDate must be future date")
    private Date departureDate;
}

