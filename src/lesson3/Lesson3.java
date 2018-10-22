package lesson3;

import java.util.Arrays;

public class Lesson3 {

    public static void main(String[] args) {

        // Arrays

        int[] arr; // объявление переменной массива
        int arr1[]; // второй способ, менее распространённый

        arr = new int[12]; // массив со значениями по умолчанию

        System.out.println(Arrays.toString(arr));
        System.out.println(arr.length);

        int a = 90;
        int[] arr3 = {2, 12, 45, 78, 34, a};
        System.out.println(Arrays.toString(arr3));
        System.out.println(arr3.length);

        // доступ к элементам массива
        System.out.println(arr3[2]); // 45
        System.out.println(arr3[2+2]); // 34
//        System.out.println(arr3[7]); // ArrayIndexOutOfBoundsException: 7

        arr3[1] = 123;
        System.out.println(Arrays.toString(arr3));

//        arr
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i + 10;
        }
        System.out.println(Arrays.toString(arr));

        // копирование массива
        int[] arr4 = {2, 6, 8, 3};
        int[] arr5 = arr4; // создаётся только ссылка на массив arr4, копия не создаётся

        int[] cloneArr4 = arr4.clone(); // полная копия массива
//        System.arraycopy(srcArr, int srcPos, destArr, int destPos, int length);

        int[] arr6 = new int [4];
        System.arraycopy(arr4, 0, arr6, 2, 1);
        System.out.println(Arrays.toString(arr6));

        int[] copyArr4 = Arrays.copyOf(arr4, 14);
        System.out.println(Arrays.toString(copyArr4));

        int[] copyRangeArr4 = Arrays.copyOfRange(arr4, 1, 3); // копируются эл-ты с 1 до 3, т.е. 1 и 2
        System.out.println(Arrays.toString(copyRangeArr4)); // [6, 8]

        // перебор значений массива в цикле

//      сравнение массивов
        arr4 = new int[] {2, 6, 8, 3, 8, 3, 98};
        arr5 = new int[] {2, 6, 8, 3, 8, 3, 98};

        System.out.println(arr4 == arr5); // false, так сравнивать нельзя
        System.out.println(arr4.equals(arr5)); // false, так тоже
        System.out.println(Arrays.equals(arr4, arr5)); // true

//      наполнение массивов
        int[] arr7 = new int[14];
        Arrays.fill(arr7, 233);
        System.out.println(Arrays.toString(arr7));

        // сортировка
        arr7 = new int[]{34, 1, -90, 45, 72};
        Arrays.sort(arr7, 3, 4); // сортирует выбранные позиции
        System.out.println(Arrays.toString(arr7));
        Arrays.sort(arr7); // сортирует весь массив
        System.out.println(Arrays.toString(arr7));

        System.out.println(Arrays.binarySearch(arr7, 3)); // отрицтельный результат -- если нет такого числа в массиве, возвращается результат индекса, где оно мог бы размещаться







    }

}
