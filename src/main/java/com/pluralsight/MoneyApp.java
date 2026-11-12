package com.pluralsight;
import java.math.BigDecimal;

public class MoneyApp {
    public static void main(String[] args) {

        // VARIABLES
        float floatAmount = 0;
        double doubleAmount = 0.0;
        BigDecimal bigAmount = BigDecimal.ZERO;

        // Loop for 10x
        for (int i = 0; i < 10; i++) {
            floatAmount += 0.10f;
            doubleAmount += 0.10;
            bigAmount = bigAmount.add(new BigDecimal("0.10"));





        }
    }
}
