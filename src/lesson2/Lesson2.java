package lesson2;

import java.util.Scanner;

public class Lesson2 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Введите код. Трёхзначное число");
        int code = in.nextInt(); // 123
//        if (condition) {} // если условие верно, выпоняется то, что в фиг. скобках, иначе выполняется дальше

        if (code == 123) {
            System.out.println("Вы вошли как администратор");
        } else if (code == 345) {
            System.out.println("Вы вошли как участник");
        } else { // необязательный блок else
                System.out.println("Вы не вошли");
        }

        // ----------
        int a = 5;
        int b = 7;
        if (a == 5) {
            System.out.println("Совпадение найдено: а");
        } else if (b == 7) {
            System.out.println("Совпадение найдено: b");
        } else {
                System.out.println ("Совпадений нет");
            }
        }







    }

