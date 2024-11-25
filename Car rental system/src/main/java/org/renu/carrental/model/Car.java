package org.renu.carrental.model;

public class Car {
    private String make;
    private String model;
    private int year;
    private boolean isAvailable;
    private double rentalPricePerDay;
    private String licencePlate;

    public Car(String make,String model,int year,boolean isAvailable,double rentalPricePerDay,String licencePlate){
        this.make = make;
        this.model = model;
        this.year = year;
        this.isAvailable = isAvailable;
        this.rentalPricePerDay = rentalPricePerDay;
        this.licencePlate = licencePlate;
    }
    public String getMake(){
        return make;
    }
    public void setMake(String make){
        this.make = make;
    }
    public String getModel(){

        return model;
    }
    public void setModel(String model){
        this.model = model;
    }
    public int getYear(){
        return year;
    }
    public void setYear(int year){
        this.year = year;

    }
    public boolean isAvailable(){

        return isAvailable;
    }
    public void setAvailable(boolean isAvailable){

        this.isAvailable = isAvailable;
    }
    public double getRentalPricePerDay(){

        return rentalPricePerDay;
    }
    public void setRentalPricePerDay(double rentalPricePerDay){

        this.rentalPricePerDay = rentalPricePerDay;
    }
    public String getLicencePlate(){

        return licencePlate;
    }
    public void setLicencePlate(String licencePlate){

        this.licencePlate = licencePlate;
    }

    @Override
    public String toString() {
        return "Car{" +
                "make='" + make + '\'' +
                ", model='" + model + '\'' +
                ", year=" + year +
                ", licencePlate='" + licencePlate + '\'' +
                ", rentalPricePerDay=" + rentalPricePerDay +
                ", isAvailable=" + isAvailable +
                '}';
    }
}
