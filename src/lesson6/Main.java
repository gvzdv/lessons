package lesson6;

import lesson6.battleunit.*;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Knight knight = new Knight(100, 20);
        Spearman spearman = new Spearman(60, 70);

        knight.attack(spearman);

        Doctor doctor = new Doctor(50, 10);
        doctor.attack(knight);

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите название персонажа");
        String userChoice = scanner.nextLine();
        BattleUnitFactory unitFactory = new BattleUnitFactory();
        BattleUnit unit = unitFactory.create(userChoice);

                Fight fight = new Fight(knight, spearman);
                fight.fight();
                System.out.println(fight.fightResult());

//        Пардигмы ООП:
//        Абстракция - абстрактные классы и интерфейсы
//        Инкапсуляция - private/protected
//        Полиморфизм - внутри одного класса методы с одинаковым названием, но разными аргументами;
//          полиморфизм наследования - создание объектов разных классов через общего родителя (Knight, Spearman можно создать через BattleUnit)
//        Наследование - extends
//        Посылка сообщений - вызов методов
//        Повторное использование - можно использовать класс в другом коде без изменений
//


            int a = 9;
            int b = 1;
            Operation plus = new Plus (a, b);
            plus.execute(); // 10

            Operation minus = new Minus (a, b);
            minus.execute(); // 8
            }
        }