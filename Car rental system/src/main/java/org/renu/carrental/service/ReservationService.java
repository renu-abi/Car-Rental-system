package org.renu.carrental.service;

import org.renu.carrental.dataaccesslayer.ReservationRepository;
import org.renu.carrental.model.Reservation;

import java.util.List;
import java.util.Optional;

public class ReservationService {
    private ReservationRepository reservationRepository;

    public ReservationService(ReservationRepository reservationRepository){
        this.reservationRepository = reservationRepository;
    }

    public Void addReservation(Reservation reservation){
        reservationRepository.addReservation(reservation);
        return null;
    }

    public void updateReservation(Reservation reservation){
        reservationRepository.updateReservation(reservation);
    }
    public void deleteReservation(int reservationId){
        reservationRepository.deleteReservation(reservationId);
    }

    public Optional<Reservation> getReservationById(int reservationId){
        return reservationRepository.getReservationById(reservationId);
    }
     public List<Reservation> getReservationByCustomer(int customerId){
        return reservationRepository.getReservationByCustomer(customerId);
     }

     public List<Reservation> getReservationByCar(int carId){
        return reservationRepository.getReservationByCar(carId);
     }
     public List<Reservation> getAllReservations(){
        return reservationRepository.getAllReservations();
     }
}
