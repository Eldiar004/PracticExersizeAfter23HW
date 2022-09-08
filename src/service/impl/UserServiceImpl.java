package service.impl;

import dao.UserDao;
import model.User;
import service.UserService;

import java.util.ArrayList;

public class UserServiceImpl implements UserService {
    UserDao userDao;
    @Override
    public void addUser(ArrayList<User> users,User[] users1) {
        users.add(users1[0]);
        users.add(users1[1]);
        users.add(users1[2]);
    }

    @Override
    public void findByID(int idNum, ArrayList<User> users) {
        try {
            for (int i = 0; i < 1; i++) {
                if (idNum == 1) {
                    System.out.println(users.get(0));
                } else if (idNum == 2) {
                    System.out.println(users.get(1));
                } else if (idNum == 3) {
                    System.out.println(users.get(2));
                } else
                    throw new RuntimeException("You're answer incorrect ID");
            }
        } catch (RuntimeException e) {
            System.err.println(e.getMessage());
        }
    }

    @Override
    public void deleteByID(int d, ArrayList<User> user) {
        for (int i = 0; i < user.size(); i++) {
            if (user.get(i).getID() == d) {
                user.remove(user.get(i));
                break;
            }
        }
    }

    @Override
    public void getAllUsers(ArrayList<User> users) {
        System.out.println("-------THIS IS ALL USERS---------");
        for (User q : users) {
            System.out.println(q + "\n-------------------");
        }
    }
}
