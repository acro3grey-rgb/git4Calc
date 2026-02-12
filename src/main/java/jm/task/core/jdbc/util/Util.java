package jm.task.core.jdbc.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Util {

    // 1) Проверь, что schema в Workbench называется именно usersdb
    private static final String URL =
            "jdbc:mysql://localhost:3306/usersbd?useSSL=false&allowPublicKeyRetrieval=true&serverTimezone=UTC";

    // 2) Пользователь/пароль от твоего MySQL
    private static final String USER = "root";
    private static final String PASSWORD = "Grey3run!";

    // 3) Метод, который будут использовать DAO классы
    public static Connection getConnection() {
        try {
            return DriverManager.getConnection(URL, USER, PASSWORD);
        } catch (SQLException e) {
            throw new RuntimeException("Failed to connect to DB: " + URL, e);
        }
    }
}
