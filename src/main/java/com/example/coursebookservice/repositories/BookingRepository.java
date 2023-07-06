package com.example.coursebookservice.repositories;

import com.example.coursebookservice.models.Booking;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookingRepository extends JpaRepository<Booking,Long> {
}
