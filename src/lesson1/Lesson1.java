package lesson1;

/**
 * документация
 */
public class Lesson1 {
    //psvm
    public static void main(String[] args) {
        // однострочный комментарий
        /*
        многострочный комментарий
         */
        // ctrl + / -- однострочный комментарий
        // ctrl + shift + / -- многострочный комментарий (выделить несколько строк)
        System.out.println("Lesson1"); //sout; выводимый текст пишем в "двойных кавычках"

        // объявление переменных
        // типДанных имяПеременной;

        // имяПеременной = значение;

//        типДанных имяПеременной1, имяПеременной2, имяПеременной3;

        // примитивные типы:
        // byte
        // short
        // int
        // long
        // float
        // double
        // boolean
        // char


        // ссылочные типы данных
        // String
        // массивы
        // классы
        // интерфейсы

        byte  byteVar; // (8 бит) -128 до 127
        byteVar = 1;

        short shortVar; // (16 бит) -32768 до 32768
        shortVar = 90;

        short a = 2;
        short b = 3;
//        short c = a + b; // int

//        int (32 бита)
        int intVar = 1_000_000; // 1000000
        int intVar2 = 8;
        int intVar3 = 3;
        int intVar4 = intVar3 / intVar2; // при делении дробная часть не округляется, а просто отбрасывается

//        long (64 бита)
        long x = 6000000000L; // чтобы указать, что это long, в конце ставят букву L, иначе оно воспринимается как int

        // типы данных с плавающей точкой
//        float (32 бит), double (64 бита)
        float floatVar = 0.4F; // F на конце, чтобы указать, что это float, иначе воспинимается как double
        double doubleVar = 0.4; // F нет -- значит, это double

        boolean isActive = true;
        boolean started = false;

        // приведение типов
        // автоматическое преобразование
        byte byteNum = 23;
        int intNum = byteNum;

        // явное приведение типов
//        int intNum = 23;
//        byte byteNum = (byte) intNum;

//        boolean не приводится ни к одному типу

        float floatNum = 3.545F;
        intNum = (int) floatNum;

        System.out.println(intNum);

        // арифметические операторы
        // + | - | * | / | %

        long long1 = 78;
        int int1 = 12;
        int res = (int) (long1 + int1);
        System.out.println(res);

        System.out.println(8%3);
        // % - остаток от деления, например: (6 / 3 = 2)

//        инкремент i++ ++i
        int i = 2;
        int j = 2;
        System.out.println(i++);
        System.out.println(++j);
//      декремент
        int l = 2;
        int k = 2;
        System.out.println(l--);
        System.out.println(--k);

        // операторы сравнения
//        > | < | == | >= | <= | !=

//        логические операторы
//    и   a && c -- доходит до певого false
//        a & c

//   или  a || c -- доходит до первого true
//        a | c
//        (a != 0) && (b != 0)

//        a = true;
//        !a -- меняет значение оператора на противоположное

//        a ^ b --

        // операторы присваивания
//        = | += | -+ | *= | /= | %=

        int d = 3;
//        d = d + 4; d += 4; -- это одно и то же

        // тернарный оператор
//        переменная y = (условие) ? выражение1 : выражение2;




    }
}

