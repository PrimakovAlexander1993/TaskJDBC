package jm.task.core.jdbc;

import jm.task.core.jdbc.model.User;
import jm.task.core.jdbc.service.UserServiceImpl;

public class Main {
    public static void main(String[] args) {
        UserServiceImpl userService = new UserServiceImpl();
        userService.createUsersTable();
        userService.saveUser("Alexander", "Primakov", (byte) 27);
        userService.saveUser("Ivan", "Black", (byte) 53);
        userService.saveUser("John", "Dao", (byte) 88);
        userService.saveUser("Den", "Brown", (byte) 10);
        for (User user : userService.getAllUsers()) {
            System.out.println(user);
        }
        userService.cleanUsersTable();
        userService.dropUsersTable();
    }
}
