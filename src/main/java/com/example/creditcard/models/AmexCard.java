
package com.example.creditcard.models;

import java.time.LocalDate;

public class AmexCard extends CreditCard {

    public AmexCard(String number, String cardholder, LocalDate expiryDate) {
        super("AMEX", number, cardholder, expiryDate);
    }

    @Override
    public double calculateRate(double amount) {
        return amount * (LocalDate.now().getMonthValue() * 0.1);
    }
}
