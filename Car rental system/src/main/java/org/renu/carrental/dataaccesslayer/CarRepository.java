package org.renu.carrental.dataaccesslayer;

import org.renu.carrental.model.Car;

import java.util.List;
import java.util.Optional;

public interface CarRepository {
    List<Car> searchCars(String make, String model, int year, boolean isAvailable, double RentalPricePerDay);
    List<Car> getAllCars();
    void addCar(Car car);
    void updateCar(Car car);
    void deleteCar(String licencePlate);
    Optional<Car> getCarByLicencePlate(String licencePlate);
}
