package org.renu.carrental.dataaccesslayer;

import org.renu.carrental.model.Payment;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class InMemoryPaymentRepository implements PaymentRepository {
    private List<Payment> pay = new ArrayList<>();

    @Override
    public void addPayment(Payment payment){
        pay.add(payment);
    }
    @Override
    public void updatePayment(Payment payment){
        Optional<Payment> existingPayment = getPaymentById(payment.getPaymentId());
        if (existingPayment.isPresent()) {
            Payment p = existingPayment.get();
            p.setAmount(payment.getAmount());
            p.setPaymentDate(payment.getPaymentDate());
            p.setPaymentStatus(payment.getPaymentStatus());
            p.setPaymentMethod(payment.getPaymentMethod());
        }
    }

    @Override
    public void deletePayment(String paymentId){
        pay.removeIf(payment -> payment.getPaymentId().equals(paymentId));

    }


    @Override
    public Optional<Payment> getPaymentById(String paymentId) {
        return pay.stream()
                .filter(payment -> payment.getPaymentId().equals(paymentId))
                .findFirst();
    }

    @Override
    public List<Payment> getPaymentByReservationId(String reservationId) {
        List<Payment> result = new ArrayList<>();
        for(Payment payment : pay){
            if(payment.getReservationId().equals(reservationId)){
                result.add(payment);
            }
        }
        return  result;
    }

    @Override
    public List<Payment> getAllPayments() {
        return new ArrayList<>(pay);
    }
}
