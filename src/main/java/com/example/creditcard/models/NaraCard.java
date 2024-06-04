
package com.example.creditcard.models;

import java.time.LocalDate;

public class NaraCard extends CreditCard {

    public NaraCard(String number, String cardholder, LocalDate expiryDate) {
        super("NARA", number, cardholder, expiryDate);
    }

    @Override
    public double calculateRate(double amount) {
        return amount * (LocalDate.now().getDayOfMonth() * 0.5);
    }
}
