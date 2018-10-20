package lesson2.homework;

public class Task3 {

    public static void main(String[] args) {

//        Создайте программу, выводящую на экран первые 20 элементов последовательности 2 4 8 16 32 64 128 ….
        int i = 2;
        int count = 0;
        do {
            System.out.println(i);
            i = i * 2;
            count ++;
        } while (count < 20);
        }

    }

