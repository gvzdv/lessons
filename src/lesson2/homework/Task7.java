package lesson2.homework;

public class Task7 {

    public static void main(String[] args) {

        int count = 0;
        int min;
        for (int hour = 0; hour < 24; hour++) {
            for (min = 0; min < 60; min++) {
                int pos1 = hour / 10;
                int pos2 = hour % 10;
                int pos3 = min / 10;
                int pos4 = min % 10;
                if (pos1 == pos4 && pos2 == pos3) {
                    ++count;
                }
            }
        }
        System.out.println("Количество симметиричных комбинаций: " + count);


    }
}
