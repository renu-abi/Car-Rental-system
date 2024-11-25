package org.renu.carrental.controller;

import org.renu.carrental.model.Payment;
import org.renu.carrental.service.PaymentService;

import java.util.List;
import java.util.Optional;

public class PaymentController {
    private PaymentService paymentService;

    public PaymentController(PaymentService paymentService){
        this.paymentService = paymentService;
    }
    public void addPayment(Payment payment){
        paymentService.addPayment(payment);
    }
    public void updatePayment(Payment payment){
        paymentService.updatePayment(payment);
    }
    public void deletePayment(String paymentId){
        paymentService.deletePayment(paymentId);
    }
    public Optional<Payment> getPaymentById(String paymentId){
        return paymentService.getPaymentById(paymentId);
    }
    public List<Payment> getPaymentByReservationId(String reservationId){
        return paymentService.getPaymentByReservationId(reservationId);
    }
    public List<Payment> getAllPayments(){
        return paymentService.getAllPayments();
    }
}
