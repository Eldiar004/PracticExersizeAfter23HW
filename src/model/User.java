package model;

import enums.Gender;

public class User {
    private int ID;
    private String name;
    private int age;

    public User(int ID, String name, int age, Gender gender) {
        this.ID = ID;
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "User's name:"+name+
                "\nUser's ID:"+ID+
                "\nUser's age:"+age+
                "\nUser's gender:"+gender;

    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    private Gender gender;
}
