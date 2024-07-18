package ru.netology.services;

public class FreelanceService {
    public int calculate(int income, int expenses, int threshold) {
        int wallet = 0;
        int counter = 0;
        for (int i = 0; i < 12; i++) {
            if (wallet >= threshold) {
                // rest
                wallet = wallet - expenses;
                wallet = wallet / 3;
                counter++;
            } else {
                // working
                wallet = wallet + income;
                wallet = wallet - expenses;
            }
        }
        return counter;

    }
}
