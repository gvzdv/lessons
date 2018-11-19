//package lesson9.storage;
//
//import lesson9.classes.Book;
//import lesson9.classes.Car;
//import lesson9.classes.ChildBook;
//import lesson9.storage.Storage;
//
//public class Main {
//
//    public static void main(String[] args) {
//        Book tails = new Book("Сказки", 500);
//        Book flowers = new Book("Цветы", 600);
//
//        Car car = new Car("green", 1000);
//
//        Storage<Book> bookStorage = new Storage<>();
//        bookStorage.add(tails);
//        bookStorage.add(flowers);
////        bookStorage.add(car);
//
//        // ClassCastException возникает на моменте исполнения
//        Book bookFromStorage = bookStorage.get(1);
//        System.out.println(bookFromStorage);
//
//        Storage<ChildBook> childBookStorage = new Storage<>();
//        ChildBook bears = new ChildBook("Маша и медведи", 200, "pic");
//        ChildBook coloring = new ChildBook("Coloring", 100, "pic");
//        childBookStorage.add(bears);
//
////        Book firstBook = getFirstBook(bookStorage);
//
//        Book firstBook = getFirstBook(childBookStorage);
//
//    }
//
////
//
//    public static Book getFirstBook(Storage<? extends Book> storage){
//        return storage.get(0);
//    }
//
//    //super
//    public static void addToStorage(Storage<? super Book> storage){
//        Book book = new Book("book", 10);
//        storage.add(book);
//
//        Object b = storage.get(0);
//        System.out.println(b);
//    }
//
//    public static void addGet(Storage<?> storage){
//        Book book = new Book("book", 10);
////        storage.add(book); можем добавить/получить только объект
//        storage.add(null);
//        Object b = storage.get(0);
//        System.out.println(b);
//    }
////    нельзя:
//    public void someVoid(Storage<String> storage){}
//    public void someVoid(Storage<Integer> storage){} - для компилятора это один и тот же метод для одного и того же типа
//    T someType = new T();
////    public static T staticVoid(){}
//
//
//}
