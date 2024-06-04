
package com.example.creditcard.services;

import com.example.creditcard.models.CreditCard;
import com.example.creditcard.services.exceptions.InvalidCardException;
import com.example.creditcard.services.exceptions.InvalidOperationException;

public class CreditCardService {

    public void validateCard(CreditCard card) throws InvalidCardException {
        if (!card.isValid()) {
            throw new InvalidCardException("Card is expired.");
        }
    }

    public void validateOperation(double amount) throws InvalidOperationException {
        if (amount > 1000) {
            throw new InvalidOperationException("Operation exceeds the limit of 1000 pesos.");
        }
    }

    public boolean areCardsDifferent(CreditCard card1, CreditCard card2) {
        return !card1.getNumber().equals(card2.getNumber());
    }

    public double calculateRate(CreditCard card, double amount) {
        return card.calculateRate(amount);
    }
}
