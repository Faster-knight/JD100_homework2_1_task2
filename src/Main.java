import java.util.Scanner;

import ru.netology.service.CustomsService;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите цену товара (в руб.): ");
        int price = scanner.nextInt();
        System.out.print("Введите вес товара (в кг.): ");
        int count = scanner.nextInt();
        float temp = CustomsService.calculateValue(price, count);
        System.out.printf("Размер пошлины (в руб.) составит: %f\n", temp);
    }
}
