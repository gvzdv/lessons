package lesson2.homework;

public class Task9 {

    public static void main(String[] args) {

        int plates = 10;
        double fairy = 5;
        for (; plates > 0; plates--) {
            if (fairy > 0) {
                fairy = fairy - 0.5;
                System.out.println("Осталось " + fairy + " мл моющего средства"); continue;

            } else System.out.println("Закончилось моющее средство, не вымыто " + plates + " шт. тарелок");
            break;
        }
        if (fairy > 0) {
            System.out.println("Хватит ещё на " + fairy / 0.5 + "шт. тарелок");
        } else if (fairy == 0 && plates == 0) {
        System.out.println("Закончилось моющее средство, но, к счастью, все тарелки вымыты");}
    }
}
