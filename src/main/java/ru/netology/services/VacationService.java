package ru.netology.services;

public class VacationService {
    public int calculate(int income, int expenses, int threshold) {
        int funds = 0;
        int meter = 0;
        for (int i = 0; i < 12; i++) {
            if (funds >= threshold) {
                funds -= expenses;
                funds /= 3;
                meter++;

            } else {
                funds += income;
                funds -= expenses;
            }

        }
        return meter;
    }
}
