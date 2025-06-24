package ru.netology.service;

public class CustomsService {
    public static final float weight = 100f;
    public static float calculateValue(int price, int count) {
        return (price / weight) + count * weight;
    }
}
