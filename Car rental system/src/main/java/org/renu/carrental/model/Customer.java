package org.renu.carrental.model;

public class Customer {
    private String name;
    private String email;
    private String phoneNumber;
    private String driverLicenseNumber;
    private String address;

    public Customer(String name,String email,String phoneNumber,String driverLicenseNumber,String address){
        this.name = name;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.driverLicenseNumber = driverLicenseNumber;
        this.address = address;
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    public String getEmail(){

        return email;
    }
    public void setEmail(String email){
        this.email = email;
    }
    public String getPhoneNumber(){

        return phoneNumber;
    }
    public void setPhoneNumber(String phoneNumber){
        this.phoneNumber = phoneNumber;
    }
    public String getDriverLicenseNumber(){

        return driverLicenseNumber;
    }
    public void setDriverLicenseNumber(String driverLicenseNumber){

        this.driverLicenseNumber = driverLicenseNumber;
    }
    public String getAddress(){

        return address;
    }
    public void setAddress(String address){
        this.address = address;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", address='" + address + '\'' +
                ", driverLicenseNumber='" + driverLicenseNumber + '\'' +
                '}';
    }
}
