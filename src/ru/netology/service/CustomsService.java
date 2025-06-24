package ru.netology.service;

public class CustomsService {
    public static final float bet = 100f;
    public static float calculateValue(int price, int count) {
        return (price / bet) + count * bet;
    }
}
