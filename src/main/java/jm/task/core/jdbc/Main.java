package jm.task.core.jdbc;

import jm.task.core.jdbc.model.User;
import jm.task.core.jdbc.service.UserService;
import jm.task.core.jdbc.service.UserServiceImpl;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        // реализуйте алгоритм здесь
        UserService userService = new UserServiceImpl();

        userService.createUsersTable();

        userService.saveUser("Bob", "LastName1", (byte) 15);
        System.out.println("User с именем — Bob добавлен в базу данных");
        userService.saveUser("Dan", "LastName2", (byte) 35);
        System.out.println("User с именем — Dan добавлен в базу данных");
        userService.saveUser("Ivan", "LastName3", (byte) 42);
        System.out.println("User с именем — Inan добавлен в базу данных");
        userService.saveUser("Igor", "LastName4", (byte) 33);
        System.out.println("User с именем — Igor добавлен в базу данных");

        List<User> allUsers = userService.getAllUsers();
        allUsers.forEach(System.out::println);

        userService.cleanUsersTable();

        userService.dropUsersTable();
    }
}
