package org.renu.carrental.service;

import org.renu.carrental.dataaccesslayer.CarRepository;
import org.renu.carrental.model.Car;

import java.util.List;
import java.util.Optional;

public class CarService {
    private CarRepository carRepository;

    public CarService(CarRepository carRepository){
        this.carRepository = carRepository;
    }

    public void addCar(Car car){
        carRepository.addCar(car);
    }
    public void updateCar(Car car){
        carRepository.updateCar(car);
    }
    public void deleteCar(String licencePlate){
        carRepository.deleteCar(licencePlate);
    }
    public Optional<Car> getCarByLicencePlate(String licencePlate){
        return carRepository.getCarByLicencePlate(licencePlate);
    }
    public List<Car> getAllCars(){
        return carRepository.getAllCars();
    }
    public List<Car> searchCars(String make,String model,int year,boolean isAvailable,double rentalPricePerDay){
        return carRepository.searchCars(make,model,year,isAvailable,rentalPricePerDay);
    }
}
