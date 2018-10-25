package lesson4.homework;

import java.util.Arrays;

public class Library {
    private int size = 20;
    private Book[] books = new Book[size];

    public void put(Book book, int quantity) {
        for (int i = 0; i < quantity; i++) {
            if (books[i] == null) {
                    books[i] = book;
                        return;
                } quantity += i;
                continue;
            }
            System.out.println("Места нет");
        }
//    public int get(Book book, int quantity) {
//        for (int i = quantity; i > 0; i--) {
//            if (books[i] == book) {
//                books[i] = null;
//                quantity--;}
//            } ;
//        }

    public void showBooks() {
        System.out.println(Arrays.toString(books));
    }
}