package lesson4;

import java.util.LinkedList;

public class Main {

    public static void main(String[] args) {

        Good door = new Good ("Дверь", 1000);
        System.out.println(door.toString());

        Good window = new Good ("Окно");
        System.out.println(window.toString());

        Good table = new Good();
        table.setTitle("Стол");
        table.setPrice(700);
        System.out.println(table.toString());
        System.out.println(table.getTitle());

        Good chair = new Good();
        chair.setTitle("Стул");
        chair.setPrice(200);
        System.out.println(chair.toString());
        System.out.println(chair.getPrice());

        Storage storage = new Storage();
        storage.addGood(table);
        storage.addGood(chair);
        storage.addGood(chair);
        storage.addGood(chair);
        storage.showGoods();

    }
}
