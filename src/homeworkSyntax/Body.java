package homeworkSyntax;

import java.util.Scanner;

class Body {
    private static double weight;
    private static double height;

    static void weightInput() {
        System.out.println("Введите вес в кг");
        Scanner in = new Scanner(System.in);
        if (in.hasNextDouble()) {
            weight = in.nextDouble();
            if ((weight <= 0) || (weight > 200)) {
                System.out.println("Вес не может быть меньше или равен 0 или больше 200 кг");
                System.exit(-1);
            } else {
                System.out.println("Вес: " + weight);
            }
        } else {
            System.out.println("Некорректно указан вес");
            System.exit(-1);
        }
    }

    static void heightInput() {
        System.out.println("Введите рост в м");
        Scanner in = new Scanner(System.in);
        if (in.hasNextDouble()) {
            height = in.nextDouble();
            if ((height <= 0) || (height > 3)) {
                System.out.println("Рост не может быть меньше или равен 0 или больше 3 м");
                System.exit(-1);
            } else {
                System.out.println("Рост: " + height);
            }
        } else {
            System.out.println("Некорректно указан рост");
            System.exit(-1);
        }
    }

    static void bodyIndex() {
        double index = weight / (height * height);
        if (index < 18.5) {
            System.out.println("Недовес: меньше чем 18.5");
        }
        if ((index >= 18.5) & (index < 25)) {
            System.out.println("Нормальный: между 18.5 и 24.9");
        }
        if ((index >= 25) & (index < 30)) {
            System.out.println("Избыточный вес: между 25 и 29.9");
        }
        if (index >= 30){
            System.out.println("Ожирение: 30 или больше");
        }
    }
}
