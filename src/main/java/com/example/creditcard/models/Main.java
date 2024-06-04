
package com.example.creditcard.models;

import com.example.creditcard.services.CreditCardService;
import com.example.creditcard.services.exceptions.InvalidCardException;
import com.example.creditcard.services.exceptions.InvalidOperationException;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {
        CreditCard visaCard = new VisaCard("1234567812345678", "Juan Jose", LocalDate.of(2025, 12, 31));
        CreditCard naraCard = new NaraCard("8765432187654321", "Carla Torres", LocalDate.of(2024, 6, 30));
        CreditCard amexCard = new AmexCard("1111222233334444", "Leonel Messi", LocalDate.of(2023, 9, 30));

        CreditCardService service = new CreditCardService();

        try {
            System.out.println("Visa Card Info: " + visaCard);
            System.out.println("Nara Card Info: " + naraCard);
            System.out.println("Amex Card Info: " + amexCard);

            service.validateCard(visaCard);
            service.validateOperation(500);
            System.out.println("Visa Card is valid and operation is valid.");

            double rate = service.calculateRate(visaCard, 500);
            System.out.println("Rate for Visa Card: " + rate);

            boolean areDifferent = service.areCardsDifferent(visaCard, naraCard);
            System.out.println("Visa and Nara cards are different: " + areDifferent);
        } catch (InvalidCardException | InvalidOperationException e) {
            System.err.println(e.getMessage());
        }
    }
}
