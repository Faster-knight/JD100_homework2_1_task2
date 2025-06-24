package ru.netology.service;

import java.util.Scanner;

public class CustomsService {
    public static final float bet = 100f;
    public static float calculateValue(int price, int count) {
        return (price / bet) + count * bet;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите цену товара (в руб.): ");
        int price = scanner.nextInt();
        System.out.print("Введите вес товара (в кг.): ");
        int count = scanner.nextInt();
        float temp = calculateValue(price, count);
        System.out.printf("Размер пошлины (в руб.) составит: %f\n", temp);
    }
}
