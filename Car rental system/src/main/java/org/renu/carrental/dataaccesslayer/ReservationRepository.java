package org.renu.carrental.dataaccesslayer;

import org.renu.carrental.model.Reservation;

import java.util.List;
import java.util.Optional;

public interface ReservationRepository {
    void addReservation(Reservation reservation);
    void updateReservation(Reservation reservation);
    void deleteReservation(int reservationId);
    Optional<Reservation> getReservationById(int reservationId);
    List<Reservation> getReservationByCustomer(int customerId);
    List<Reservation> getReservationByCar(int carId);
    List<Reservation> getAllReservations();
}
