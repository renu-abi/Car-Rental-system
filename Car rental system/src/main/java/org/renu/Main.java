package org.renu;

import org.renu.carrental.controller.CarController;
import org.renu.carrental.controller.CustomerController;
import org.renu.carrental.controller.PaymentController;
import org.renu.carrental.controller.ReservationController;
import org.renu.carrental.dataaccesslayer.*;
import org.renu.carrental.model.Car;
import org.renu.carrental.model.Customer;
import org.renu.carrental.model.Payment;
import org.renu.carrental.model.Reservation;
import org.renu.carrental.service.CarService;
import org.renu.carrental.service.CustomerService;
import org.renu.carrental.service.PaymentService;
import org.renu.carrental.service.ReservationService;

import java.util.Date;
import java.util.List;
import java.util.Optional;

public class Main {
    public static void main(String[] args) {
        // Initialize repositories
        CarRepository carRepository = new InMemoryCarRepository();
        CustomerRepository customerRepository = new InMemoryCustomerRepository();

        ReservationRepository reservationRepository = new InMemoryReservationRepository();
        PaymentRepository paymentRepository = new InMemoryPaymentRepository();

        
        //Initialize services
        CarService carService = new CarService(carRepository);
        CustomerService customerService = new CustomerService(customerRepository);
        ReservationService reservationService = new ReservationService(reservationRepository);
        PaymentService paymentService = new PaymentService(paymentRepository);

        //Initialize controllers
        CarController carController = new CarController(carService);
        CustomerController customerController = new CustomerController(customerService);
        ReservationController reservationController = new ReservationController(reservationService);
        PaymentController paymentController = new PaymentController(paymentService);

        //Car operations
        Car car = new Car("Toyoto","Corolla",2020,true,50.0,"ABC123");
        carController.addCar(car);
        Optional<Car> fetchedCar = carController.getCarByLicencePlate("ABC123");
        fetchedCar.ifPresent(c-> System.out.println("Fetched car:" + c) );

        //Customer operations
        Customer customer = new Customer("Manik","manik@gmail.com","12345567890","TN3456","34 Main St");
        customerController.addCustomer(customer);
        Optional<Customer> fetchedCustomer = customerController.getCustomerByEmail("manik@gmail.com");
        fetchedCustomer.ifPresent(c -> System.out.println("Fetched customer:" + c));

        //Reservation operations

        Reservation reservation = new Reservation(1,1,1,null,null,"Pending");
        Date startDate = new Date();
        Date endDate = new Date(System.currentTimeMillis() + (1000 * 60 * 60 * 24 * 7));
        reservation.setStartDate(startDate);
        reservation.setEndDate(endDate);
        reservationController.addReservation(reservation);
        Optional<Reservation> fetchedReservation = reservationController.getReservationById(1);
        fetchedReservation.ifPresent(r -> System.out.println("Fetched reservation:" + r));

        //Payment operations
        Payment payment = new Payment("P123","R123","Credit Card","Completed",100,new java.util.Date());
        paymentController.addPayment(payment);
        Optional<Payment> fetchedPayment = paymentController.getPaymentById("P123");
        fetchedPayment.ifPresent(p -> System.out.println("Fetched payment:" + p));

        //fetch all cars,customers,reservations,payments
        List<Car> allCars = carController.getAllCars();
        List<Customer> allCustomers = customerController.getAllCustomers();
        List<Reservation> allReservations = reservationController.getAllReservations();
        List<Payment> allPayments = paymentController.getAllPayments();

        System.out.println("All cars:" + allCars);
        System.out.println("All customers:" + allCustomers);
        System.out.println("All reservations:" + allReservations);
        System.out.println("All payment:" + allPayments);

    }
}