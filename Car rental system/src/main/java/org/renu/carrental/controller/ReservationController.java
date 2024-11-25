package org.renu.carrental.controller;

import org.renu.carrental.model.Reservation;
import org.renu.carrental.service.ReservationService;

import java.util.List;
import java.util.Optional;

public class ReservationController {
    private ReservationService reservationService;

    public ReservationController(ReservationService reservationService){
        this.reservationService = reservationService;
    }
    public void addReservation(Reservation reservation){
        reservationService.addReservation(reservation);
    }
    public void updateReservation(Reservation reservation){
        reservationService.updateReservation(reservation);
    }
    public void deleteReservation(int reservationId){
        reservationService.deleteReservation(reservationId);
    }
    public List<Reservation> getReservationByCustomer(int customerId){
        return reservationService.getReservationByCustomer(customerId);
    }
    public Optional<Reservation> getReservationById(int reservationId){
        return reservationService.getReservationById(reservationId);
    }
    public List<Reservation> getReservationByCar(int carId){
        return reservationService.getReservationByCar(carId);
    }
    public List<Reservation> getAllReservations(){
        return reservationService.getAllReservations();
    }
}
