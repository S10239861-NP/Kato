package com.example.kato_android_application;

import java.util.ArrayList;

public class Tester {
    public ArrayList<User> placeholderUsers = new ArrayList<>();

    public Tester()
    {
        placeholderUsers.add(
            new User("S001", "abc")
        );

        placeholderUsers.add(
            new User("S002", "jxt5")
        );

        placeholderUsers.add(
            new User("S003", "tyler34")
        );
    }
}
