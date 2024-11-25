package org.renu.carrental.dataaccesslayer;

import org.renu.carrental.model.Payment;

import java.util.List;
import java.util.Optional;

public interface PaymentRepository {
    void addPayment(Payment payment);
    void updatePayment(Payment payment);
    void deletePayment(String paymentId);
    Optional<Payment> getPaymentById(String paymentId);
    List<Payment> getPaymentByReservationId(String reservationId);
    List<Payment> getAllPayments();
}
