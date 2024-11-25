package org.renu.carrental.controller;

import org.renu.carrental.model.Car;
import org.renu.carrental.service.CarService;

import java.util.List;
import java.util.Optional;

public class CarController {
    private CarService carService;

    public CarController(CarService carService){
        this.carService = carService;
    }
    public List<Car> searchCars(String make, String model, int year, boolean isAvailable, double rentalPricePerDay){
        return carService.searchCars( make, model, year,  isAvailable, rentalPricePerDay);
    }
    public List<Car> getAllCars(){
        return carService.getAllCars();
    }
    public void addCar(Car car){
        carService.addCar(car);
    }
    public void updateCar(Car car){
        carService.updateCar(car);
    }
    public void deleteCar(String licencePlate){
        carService.deleteCar(licencePlate);
    }
    public Optional<Car> getCarByLicencePlate(String licencePlate){
        return carService.getCarByLicencePlate(licencePlate);
    }
}
