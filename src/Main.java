import enums.Gender;
import model.User;
import service.impl.UserServiceImpl;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        User user1 = new User(1, "Eldiar", 18, Gender.MALE);
        User user2 = new User(2, "Bolot", 19, Gender.MALE);
        User user3 = new User(3, "Aizirek", 27, Gender.FEMALE);
        User[] users1 = {user1,user2,user3};
        UserServiceImpl userService = new UserServiceImpl();
        ArrayList<User> users = new ArrayList<>();
        userService.addUser(users,users1);
        userService.getAllUsers(users);

        System.out.print("Write user's id:");

        userService.findByID(sc.nextInt(), users);

        System.out.print("Write user's ID that you wanna delete:");

        userService.deleteByID(sc.nextInt(), users);

        userService.getAllUsers(users);
    }
}