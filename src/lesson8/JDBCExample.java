package lesson8;

import org.sqlite.JDBC;

import java.sql.*;

public class JDBCExample { // библ JDBC позволяет работать с БД
    // создать таблицу
    public static void createTable() throws SQLException {
        String sql = "CREATE TABLE IF NOT EXISTS Example (" +
                "id INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL," +
                "firstColumn TEXT NOT NULL," +
                "secondColumn INTEGER NOT NULL);"; // капсом пишется синтаксис,
                                        // имена маленькими буквами, строка запроса должна заканчиваться ;
        // типы данных в sqlite: TEXT, REAL, INTEGER, BLOB, NUMERIC

        // регистрируем драйвер
        DriverManager.registerDriver(new JDBC());
        try (Connection connection =
                     DriverManager.getConnection("jdbc:sqlite:lesson8.db")){ // если после try соеднение в (), то соединение закроется автоматически
            Statement statement = connection.createStatement();
            int row = statement.executeUpdate(sql);
            System.out.println(row);
        }
    }

    // вставить данные в таблицу
    public static void insertIntoTable() throws SQLException{
        String sql = "INSERT INTO Example (firstColumn, secondColumn)" +
                "VALUES ('Value 1', 123);"; // строка в одинарных кавычках
        try (Connection connection =
                     DriverManager.getConnection("jdbc:sqlite:lesson8.db")) {
            Statement statement = connection.createStatement();
            int row = statement.executeUpdate(sql);
            System.out.println(row);
        }
    }

    // получить данные из таблицы
    public static void selectData()throws SQLException {
        String sql = "SELECT * FROM Example;"; // через запятую имена колонок или * если по всей таблице
        try (Connection connection =
                     DriverManager.getConnection("jdbc:sqlite:lesson8.db")) {
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(sql);
            while (resultSet.next()) {
                String str = resultSet.getString("firstColumn");
                int i = resultSet.getInt("secondColumn");
                System.out.println("str = " + str);
                System.out.println("i = " + i);
            }
        }
    }
    public static void main(String[] args) {
        try {
//            JDBCExample.createTable();
//            JDBCExample.insertIntoTable();
            JDBCExample.selectData();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

}


