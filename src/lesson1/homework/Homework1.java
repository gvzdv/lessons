package lesson1.homework;

public class Homework1 {

    public static void main(String[] args) {
//        Задайте высоту, длину и ширину прямоугольного параллелепипеда и найти его площадь.
//        Узнайте, что больше: ширина или высота и выведите информацию об этом в консоль.

        int length = 45;
        int width = 13;
        int height = 30;
        int square = 2 * (length * width + length * height + width * height);
        int result = (width > height) ? width : height;

        System.out.println("Наибольшее из значений ширины и высоты: " + result);

//        На садовом участке площадью 10 соток , разбили грядки 15 на 25 метров. Сколько м2 осталось незанято?

        int squareTotal = 10 * 100;
        int seedbedLength = 25;
        int seedbedWidth = 15;
        int free = squareTotal - seedbedLength * seedbedWidth;

        System.out.println("Свободно " + free + " кв. м.");

//         Вывести в консоль ближайшее к 10 из двух чисел, записанных в переменные m и n.
//         Например, среди чисел 8.5 и 11.45 ближайшее к десяти 11.45.
//         Метод Math.abs(n) возвращает абсолютное значение числа (модуль числа).

        double m = 8.5;
        double n = 11.45;
        double resM = Math.abs (10 - m);
        double resN = Math.abs (10 - n);
        double answer = (resM > resN) ? n : m;

        System.out.println("Ближайшее к десяти " + answer);

//        Создать программу, выводящую в консоль наибольшую цифру любого трехзначного натурального числа. Примеры работы программы:
//        В числе 208 наибольшая цифра 8
//        В числе 774 наибольшая цифра 7
//        В числе 613 наибольшая цифра 6

        int initialNumber = 613;
        int firstPos = initialNumber % 10;
        int secondPos = (initialNumber % 100 - firstPos) / 10;
        int thirdPos = (initialNumber % 1000 - secondPos) / 100;

        int largest = (firstPos > secondPos) ? firstPos : secondPos;
        largest = (largest > thirdPos) ? largest : thirdPos;

        System.out.println("Наибольшая цифра числа: " + largest);






    }
}
