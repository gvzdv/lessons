package lesson3.homework;

import java.util.Arrays;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Введите чётное положительное число");
        int user = in.nextInt();
        if (user % 2 != 0 || user <= 0) {
            System.out.println("Это не чётное положительное число, повторите ввод");
        } else {
            int arr[] = new int[user];
            for (int i = 0; i < arr.length; i++){
                arr[i] = ((int)(Math.random() * 11) - 5);
            }
                System.out.println(Arrays.toString(arr));

            int[] arr1 = new int[user / 2];
            int sum1 = 0;
            arr1 = Arrays.copyOfRange(arr, 0, user / 2);
            for (int i = 0; i < arr1.length; i++) {
                sum1 += Math.abs(arr1[i]);
            }
            System.out.println(sum1);
            int[] arr2 = new int[user / 2];
            int sum2 = 0;
            arr2 = Arrays.copyOfRange(arr, user / 2, arr.length);
            for (int i = 0; i < arr2.length; i++) {
                sum2 += Math.abs(arr2[i]);
            }
            System.out.println(sum2);
            if (sum1 == sum2) {
                System.out.println("Суммы модулей равны");}
                else if (sum1 > sum2) {
                System.out.println("Сумма модулей левой стороны больше");
                } else {
                System.out.println("Сумма модулей правой стороны больше");}



        }




    }
}
