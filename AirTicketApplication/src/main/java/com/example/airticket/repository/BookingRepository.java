package com.example.airticket.repository;

import com.example.airticket.entity.Booking;
import org.springframework.data.jpa.repository.JpaRepository;

import java.time.LocalDate;
import java.util.List;

public interface BookingRepository extends JpaRepository<Booking,Integer> {
    List<Booking> findByBookingDate(LocalDate bookingDate);
}
