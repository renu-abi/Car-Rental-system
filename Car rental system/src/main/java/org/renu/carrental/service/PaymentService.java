package org.renu.carrental.service;

import org.renu.carrental.dataaccesslayer.PaymentRepository;
import org.renu.carrental.model.Payment;

import java.util.List;
import java.util.Optional;

public class PaymentService {
    private PaymentRepository paymentRepository;

    public PaymentService(PaymentRepository paymentRepository){
        this.paymentRepository = paymentRepository;
    }
    public void addPayment(Payment payment){
        paymentRepository.addPayment(payment);
    }
    public void updatePayment(Payment payment){
        Optional<Payment> existingPayment = paymentRepository.getPaymentById(payment.getPaymentId());
        if (existingPayment.isPresent()) {
            paymentRepository.updatePayment(payment);
        } else {
            throw new RuntimeException("Payment with ID " + payment.getPaymentId() + " not found.");
        }
    }
    public void deletePayment(String paymentId){
        Optional<Payment> existingPayment = paymentRepository.getPaymentById(paymentId);
        if (existingPayment.isPresent()) {
            paymentRepository.deletePayment(paymentId);
        } else {
            throw new RuntimeException("Payment with ID " + paymentId + " not found.");
        }
    }
    public Optional<Payment> getPaymentById(String paymentId){
        return paymentRepository.getPaymentById(paymentId);
    }
    public List<Payment> getPaymentByReservationId(String reservationId){
        return paymentRepository.getPaymentByReservationId(reservationId);
    }
    public List<Payment> getAllPayments(){
        return paymentRepository.getAllPayments();
    }
}
