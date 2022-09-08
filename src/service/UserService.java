package service;

import model.User;

import java.util.ArrayList;

public interface UserService{
    void addUser(ArrayList<User> users,User[] users1);

    void findByID(int idNum, ArrayList<User> users);

    void deleteByID(int d,ArrayList<User> user);
    void getAllUsers(ArrayList<User> users);
}
