package com.TKA.SpringBoot_GURD.dao;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Repository;

import com.TKA.SpringBoot_GURD.entity.Booking;

import java.util.List;

@Repository
public class BookingDAOImpl implements BookingDAO {

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    @Transactional
    public void insertBooking(Booking booking) {
        entityManager.persist(booking);
    }

    @Override
    public Booking getBookingByBookingCode(int bookingCode) {
        return entityManager.find(Booking.class, bookingCode);
    }

    @Override
    public List<Booking> getAllBookings() {
        return entityManager.createQuery("from Booking", Booking.class).getResultList();
    }

    @Override
    @Transactional
    public void deleteBooking(int bookingCode) {
        Booking booking = entityManager.find(Booking.class, bookingCode);
        if (booking != null) {
            entityManager.remove(booking);
        }
    }

}
