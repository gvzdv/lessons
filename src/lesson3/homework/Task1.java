package lesson3.homework;

import java.util.Arrays;

public class Task1 {
    public static void main(String[] args) {

        int count = 0;
        for (int i = 2; i < 21; i = i + 2) {
            ++count;
        }
        System.out.println(count);

        int[] arr = new int[count];
        int arrIndex = 0;
        for (int i = 0; i < arr.length; i++) {
            arr[i] = arrIndex + 2;
            arrIndex = arrIndex + 2;
        }
        System.out.println(Arrays.toString(arr));
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }



    }
}
