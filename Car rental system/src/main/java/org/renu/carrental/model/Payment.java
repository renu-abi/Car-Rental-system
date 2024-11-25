package org.renu.carrental.model;

import java.util.Date;

public class Payment {
    private String paymentId;
    private String reservationId;
    private double amount;
    private Date paymentDate;
    private String paymentStatus;
    private String paymentMethod;

    public Payment(String paymentId,String reservationId,String paymentMethod,String paymentStatus,double amount,Date paymentDate){
        this.paymentId = paymentId;
        this.reservationId = reservationId;
        this.amount = amount;
        this.paymentDate = paymentDate;
        this.paymentMethod = paymentMethod;
        this.paymentStatus = paymentStatus;
    }
    public String getPaymentId(){

        return paymentId;
    }
    public void setPaymentId(String paymentId){

        this.paymentId = paymentId;
    }
    public String getReservationId(){

        return reservationId;
    }
    public void setReservationId(String reservationId){

        this.reservationId = reservationId;
    }
    public double getAmount(){

        return amount;
    }
    public void setAmount(double amount){

        this.amount = amount;
    }
    public String getPaymentStatus(){

        return paymentStatus;
    }
    public void setPaymentStatus(String paymentStatus){

        this.paymentStatus = paymentStatus;
    }
    public String getPaymentMethod(){

        return paymentMethod;
    }
    public void setPaymentMethod(String paymentMethod){

        this.paymentMethod = paymentMethod;
    }
    public Date getPaymentDate(){

        return paymentDate;
    }
    public void setPaymentDate(Date paymentDate){

        this.paymentDate = paymentDate;
    }

    @Override
    public String toString() {
        return "Payment{" +
                "paymentId='" + paymentId + '\'' +
                ", reservationId='" + reservationId + '\'' +
                ", amount=" + amount +
                ", paymentMethod='" + paymentMethod + '\'' +
                ", paymentDate=" + paymentDate +
                ", paymentStatus='" + paymentStatus + '\'' +
                '}';
    }
}
