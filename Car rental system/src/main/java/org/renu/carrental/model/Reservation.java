package org.renu.carrental.model;

import java.util.Date;

public class Reservation {
    private int reservationId;
    private int customerId;
    private int carId;
    private Date startDate;
    private Date endDate;
    private String reservationStatus;

    public Reservation(int reservationId,int customerId,int carId,Date startDate,Date endDate,String reservationStatus){
        this.reservationId = reservationId;
        this.customerId = customerId;
        this.carId = carId;
        this.startDate = startDate;
        this.endDate = endDate;
        this.reservationStatus = reservationStatus;
    }
    public int getReservationId(){
        return reservationId;
    }
    public void setReservationId(int reservationId){
        this.reservationId = reservationId;
    }
    public int getCustomerId(){
        return customerId;
    }
    public void setCustomerId(int customerId){
        this.customerId = customerId;
    }
    public int getCarId(){
        return carId;
    }
    public void setCarId(int carId){
        this.carId = carId;
    }
    public Date getStartDate(){
        return startDate;
    }
    public void setStartDate(Date startDate){
        this.startDate = startDate;
    }
    public Date getEndDate(){
        return endDate;
    }
    public void setEndDate(Date endDate){
        this.endDate = endDate;
    }
    public String getReservationStatus(){
        return reservationStatus;
    }
    public void setReservationStatus(String reservationStatus){
        this.reservationStatus = reservationStatus;
    }

    @Override
    public String toString() {
        return "Reservation{" +
                "reservationId=" + reservationId +
                ", customerId=" + customerId +
                ", carId=" + carId +
                ", startDate=" + startDate +
                ", endDate=" + endDate +
                ", reservationStatus='" + reservationStatus + '\'' +
                '}';
    }
}
