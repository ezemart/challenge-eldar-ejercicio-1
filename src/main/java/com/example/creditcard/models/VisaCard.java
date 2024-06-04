
package com.example.creditcard.models;

import java.time.LocalDate;

public class VisaCard extends CreditCard {

    public VisaCard(String number, String cardholder, LocalDate expiryDate) {
        super("VISA", number, cardholder, expiryDate);
    }

    @Override
    public double calculateRate(double amount) {
        LocalDate now = LocalDate.now();
        return amount * (now.getYear() / (double) now.getMonthValue());
    }
}
