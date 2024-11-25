package org.renu.carrental.dataaccesslayer;

import org.renu.carrental.model.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class InMemoryCarRepository implements CarRepository{
    private List<Car> carList = new ArrayList<>();

    @Override
    public void addCar(Car car){
        carList.add(car);
        System.out.println("car added:" + car);
    }
    @Override
    public void updateCar(Car car){
        Optional<Car> existingCar = getCarByLicencePlate(car.getLicencePlate());
        existingCar.ifPresent(c -> {
            c.setMake(car.getMake());
            c.setModel(car.getModel());
            c.setYear(car.getYear());
            c.setAvailable(car.isAvailable());
            c.setRentalPricePerDay(car.getRentalPricePerDay());
        });


    }
    @Override
    public void deleteCar(String licencePlate){
        carList.removeIf(car -> car.getLicencePlate() .equals(licencePlate));
        System.out.println("Car with licencePlate" + licencePlate + "deleted");
    }

    @Override
    public Optional<Car> getCarByLicencePlate(String licencePlate) {
        return carList.stream()
                .filter(car -> car.getLicencePlate().equalsIgnoreCase(licencePlate))
                .findFirst();
    }

    @Override
    public List<Car> searchCars(String make, String model, int year, boolean isAvailable, double RentalPricePerDay ) {
        return carList.stream()
                .filter(car -> (make == null || car.getMake().equalsIgnoreCase(make)) &&
                               (model == null || car.getModel().equalsIgnoreCase(model)) &&
                               (year == 0 || car.getYear() == year) &&
                               (car.isAvailable() == isAvailable) &&
                               (RentalPricePerDay == 0 || car.getRentalPricePerDay() <= RentalPricePerDay))

                .collect(Collectors.toList());
    }
    @Override
    public List<Car> getAllCars(){
        return new ArrayList<>(carList);
    }
}
