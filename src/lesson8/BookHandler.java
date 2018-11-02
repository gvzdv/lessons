package lesson8;

import org.sqlite.JDBC;

import java.sql.*;
import java.util.Arrays;

public class BookHandler {

//    public static void createTable() throws SQLException {
//        String sql = "CREATE TABLE IF NOT EXISTS Book (" +
//                "id INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL," +
//                "title TEXT NOT NULL," +
//                "pages INTEGER NOT NULL);";
//
//        DriverManager.registerDriver(new JDBC());
//        try (Connection connection =
//                     DriverManager.getConnection("jdbc:sqlite:lesson8.db")){ // если после try соеднение в (), то соединение закроется автоматически
//            Statement statement = connection.createStatement();
//            int row = statement.executeUpdate(sql);
//            System.out.println(row);
//        }
//    }

//    public static void insertIntoTable(Book book) throws SQLException{
//        String sql = "INSERT INTO Book (title, pages)" +
//                "VALUES (?, ?);";
//        try (Connection connection =
//                     DriverManager.getConnection("jdbc:sqlite:lesson8.db")) {
//            PreparedStatement statement =
//                    connection.prepareStatement(sql);
//            statement.setString(1, book.getTitle());
//            statement.setInt(2, book.getPages());
//
//            int row = statement.executeUpdate();
//            System.out.println(row);
//        }
//    }

    public static Book[] selectData(int id)throws SQLException {
//        String sql = "SELECT * FROM Book WHERE id = ?;";

//        try (Connection connection =
//                     DriverManager.getConnection("jdbc:sqlite:lesson8.db")) {
//            PreparedStatement statement = connection.prepareStatement(sql);
////            statement.setInt(1, id);
//            ResultSet resultSet = statement.executeQuery();
//            Book book = new Book();
//            Book[] books = new Book[3];
//            for (int i = 0; i <)
//                while (resultSet.next()) {
//                    book.setTitle(resultSet.getString("title"));
//                    book.setPages(resultSet.getInt("pages"));
////                String title = resultSet.getString("title");
////                int pages = resultSet.getInt("pages");
////                System.out.println("title = " + title);
////                System.out.println("pages = " + pages);
//                }
//            return book;
//        }
        String sql = "SELECT * FROM Book;";
        try (Connection connection =
                     DriverManager.getConnection("jdbc:sqlite:lesson8.db")) {
            PreparedStatement statement = connection.prepareStatement(sql);
            ResultSet resultSet = statement.executeQuery();
//            Book book = new Book();
            Book[] books = new Book[3];
            for (int i = 0; resultSet.next(); i++){
                Book book = new Book();
                book.setTitle((resultSet.getString("title")));
                book.setPages(resultSet.getInt("pages"));
                books[i] = book;
            }
            return books;
        }
    }

    public static void main(String[] args) {
//
        Book book1 = new Book ("Азбука", 500);
        Book book2 = new Book ("Азбука 2", 500);

//        Book[] books = {book1, book2, book3};


        try {
//            BookHandler.createTable();
//            BookHandler.insertIntoTable(book2);
//            BookHandler.selectData(2);
            System.out.println(Arrays.toString(BookHandler.selectData(2)));
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
