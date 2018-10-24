package lesson3.homework;

import java.util.Arrays;
import java.util.Scanner;
import java.util.regex.*;

public class Task3Strings {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Введите адрес");
        String userString = in.nextLine();
        String[] newString = (userString.replaceAll("\\D+", " ").trim()).split(" ");
                System.out.println(Arrays.toString(newString));



    }

}
