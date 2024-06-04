
package com.example.creditcard.models;

import java.time.LocalDate;

public abstract class CreditCard {
    private String brand;
    private String number;
    private String cardholder;
    private LocalDate expiryDate;

    public CreditCard(String brand, String number, String cardholder, LocalDate expiryDate) {
        this.brand = brand;
        this.number = number;
        this.cardholder = cardholder;
        this.expiryDate = expiryDate;
    }

    public String getBrand() {
        return brand;
    }

    public String getNumber() {
        return number;
    }

    public String getCardholder() {
        return cardholder;
    }

    public LocalDate getExpiryDate() {
        return expiryDate;
    }

    public abstract double calculateRate(double amount);

    @Override
    public String toString() {
        return "Brand: " + brand + ", Number: " + number + ", Cardholder: " + cardholder + ", Expiry Date: " + expiryDate;
    }

    public boolean isValid() {
        return expiryDate.isAfter(LocalDate.now());
    }
}
