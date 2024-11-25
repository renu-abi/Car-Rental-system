package org.renu.carrental.dataaccesslayer;

import org.renu.carrental.model.Reservation;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class InMemoryReservationRepository implements ReservationRepository{
    private List<Reservation> reservationList = new ArrayList<>();

    @Override
    public void addReservation(Reservation reservation) {
        reservationList.add(reservation);
        System.out.println("reservation added:" + reservation);
    }

    @Override
    public void updateReservation(Reservation updateReservation) {
        for (int i = 0; i < reservationList.size(); i++) {
            Reservation reservation = reservationList.get(i);
            if(reservation.getReservationId() == updateReservation.getReservationId()){
                reservationList.set(i , updateReservation);
                System.out.println("reservation updated" + updateReservation);
                return;
            }
        }
        System.out.println("reservation with ID" + updateReservation.getReservationId() + "not found");
    }

    @Override
    public void deleteReservation(int reservationId) {
        boolean removed = reservationList.removeIf(reservation -> reservation.getReservationId() == reservationId);
        if (removed) {
            System.out.println("reservation with ID" + reservationId + "deleted");
        }else{
            System.out.println("reservation with ID" + reservationId + "not found");
        }

    }

    @Override
    public List<Reservation> getReservationByCar(int carId) {
        return reservationList.stream()
                .filter(reservation -> reservation.getCarId() == carId)
                .collect(Collectors.toList());
    }

    @Override
    public List<Reservation> getReservationByCustomer(int customerId) {
        return reservationList.stream()
                .filter(reservation -> reservation.getCustomerId() == customerId)
                .collect(Collectors.toList());
    }

    @Override
    public Optional<Reservation> getReservationById(int reservationId) {
        return reservationList.stream()
                .filter(reservation -> reservation.getReservationId() == reservationId).findFirst();
    }

    @Override
    public List<Reservation> getAllReservations() {
        return new ArrayList<>(reservationList);
    }
}
