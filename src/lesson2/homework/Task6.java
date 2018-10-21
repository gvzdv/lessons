package lesson2.homework;

public class Task6 {

    public static void main(String[] args) {
        int souvenir = 0;
        for (int ticket = 1; ticket <= 999999; ticket++) {
            int part1 = ticket / 100000 + ticket / 10000 % 10 + ticket / 1000 % 10;
            int part2 = ticket / 100 % 10 + ticket / 10 % 10 + ticket % 10;
            if (part1 == part2) {
                ++souvenir;
            }

        } System.out.println("Количество сувениров: " + souvenir);




    }
}
