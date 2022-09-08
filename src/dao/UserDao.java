package dao;

import model.User;

import java.util.ArrayList;

public class UserDao {
    private ArrayList<User> users;

    public UserDao(ArrayList<User> users) {
        this.users = users;
    }

    public ArrayList<User> getUsers() {
        return users;
    }

    public void setUsers(ArrayList<User> users) {
        this.users = users;
    }
}