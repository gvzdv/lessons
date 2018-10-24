package lesson3.homework;

import java.util.Scanner;

public class Task1Strings {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Введите строку");
        String userString = in.next();
        Scanner in2 = new Scanner(System.in);
        System.out.println("Введите подстроку для поиска");
        String substr = in2.next();
        Scanner in3 = new Scanner(System.in);
        System.out.println("Введите подстроку для замены");
        String substitute = in3.next();

        if (userString.contains(substr)) {
            String newString = userString.replace(substr, substitute);
            System.out.println(newString);
        }
            else {
            System.out.println("Искомой подстроки нет");
        }




    }

}
