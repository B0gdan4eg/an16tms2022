package by.tms.main;

import by.tms.user.User;

public class Main {
    public static void main(String[] args) {
        User user = new User("Bogdan", "Shcherbakov", 19, "Male");
        System.out.println(user);
        user.ageIncrease();
        System.out.println(user.age);
        System.out.println(user.getNameSur());
    }
}
