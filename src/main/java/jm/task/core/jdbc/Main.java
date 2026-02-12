package jm.task.core.jdbc;

import jm.task.core.jdbc.model.User;
import jm.task.core.jdbc.service.UserService;
import jm.task.core.jdbc.service.UserServiceImpl;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        UserService userService = new UserServiceImpl();

        // 1) Создание таблицы
        userService.createUsersTable();

        // 2) Добавление 4 пользователей + вывод после каждого добавления
        userService.saveUser("Ivan", "Ivanov", (byte) 25);
        System.out.println("User с именем — Ivan добавлен в базу данных");

        userService.saveUser("Petr", "Petrov", (byte) 30);
        System.out.println("User с именем — Petr добавлен в базу данных");

        userService.saveUser("Sergey", "Sidorov", (byte) 28);
        System.out.println("User с именем — Sergey добавлен в базу данных");

        userService.saveUser("Anna", "Smirnova", (byte) 22);
        System.out.println("User с именем — Anna добавлен в базу данных");

        // 3) Получение всех пользователей и вывод
        List<User> users = userService.getAllUsers();
        for (User u : users) {
            System.out.println(u);
        }

        // 4) Очистка таблицы
        userService.cleanUsersTable();

        // 5) Удаление таблицы
        userService.dropUsersTable();
    }
}
