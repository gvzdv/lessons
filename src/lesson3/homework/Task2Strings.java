package lesson3.homework;

import java.util.Scanner;

public class Task2Strings {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Введите строку");
        String userString = in.nextLine();
        String updated = userString.replaceAll("\\s", "");
        System.out.println(updated);
    }
}
