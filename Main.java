package org.example;
import java.util.ArrayList;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String[] brands = new String[]{"Casio", "Rolex"};
        Object[][] mixedArray = new Object[brands.length][2];
        mixedArray[0][0] = brands[0];
        mixedArray[0][1] = "Illuminator";
        mixedArray[1][0] = brands[1];
        mixedArray[1][1] = "DAYTONA";
        ArrayList<Object[]> customers = new ArrayList<>();

        System.out.println("Введите ФИО");
        String name = s.nextLine();
        System.out.println("Введите email");
        String mail = s.nextLine();
        System.out.println("Введите номер телефона");
        String number = s.nextLine();

        for (int i = 0; i < 3; i++) {
            System.out.println("Выберите бренд");
            for (int j = 0; j < brands.length; j++) {
                System.out.println(brands[j]);
            }
            int choice = s.nextInt();

            if (choice >= 1 && choice <= brands.length) {
                String selectedBrand = brands[choice - 1];
                String selectedModel = (String) mixedArray[choice - 1][1];

                System.out.println("Вы выбрали " + selectedBrand + " " + selectedModel);
                s.nextLine();
                System.out.println("Введите количество");
                Integer count = s.nextInt();

                customers.add(new Object[]{name, mail, number, selectedBrand, selectedModel, count});
            } else {
                System.out.println("Неверный выбор бренда.");
            }
            s.nextLine();
        }
        System.out.println("Информация о всех заказах:");
        for (int i = 0; i < customers.size(); i++) {
            Object[] order = customers.get(i);
            System.out.println("Заказ " + (i + 1) + ":");
            System.out.println("ФИО: " + order[0]);
            System.out.println("Email: " + order[1]);
            System.out.println("Номер телефона: " + order[2]);
            System.out.println("Бренд: " + order[3]);
            System.out.println("Модель: " + order[4]);
            System.out.println("Количество: " + order[5]);
            System.out.println();

        }
    }
}
