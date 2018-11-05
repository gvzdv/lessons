package lesson4.homework;

public class Library {
    int quantity;
    int size;
    int left;
    private int reserved;
    Book[] books;

    public Library(int size) {
        this.size = size;
        Book[] books = new Book[size];
        this.books = books;
    }


    public void put(Book book, int quantity) {
        if (reserved < size) {
            left = quantity;
            for (int i = 0; i < size; i++) {
                if (books[i] == null && left > 0) {
                    books[i] = book;
                    left--;
                    reserved++;
                    if (reserved == size) {
                        System.out.println("Места нет, внесено " + (quantity - left) + " шт. книги " + book.getTitle());
                        if (left > 0) {
                            System.out.println("Не внесено " + left + " шт. книги " + book.getTitle());
                        }
                    }
                }
            }
            System.out.println("Bнесено " + quantity + "шт. книги" + book.getTitle());

        } else System.out.println("Места нет");
    }

    public int get(Book book, int quantity) {
        left = quantity;
        for (int i = 0; i < size; i++) {
            if (left == 0) {
                System.out.println("Извлечено " + quantity + " шт. книги " + book.getTitle());
                break;
            }
            if (book.equals(books[i])) {
                books[i] = null;
                left--;
                reserved--;
            }
        }
        if (left > 0) {
            System.out.println("Извлечено " + (quantity - left) + " шт. книги " + book.getTitle() + "; не извлечено " + left + "шт.; больше в библиотеке нет.");
        }
        return quantity;
    }
}