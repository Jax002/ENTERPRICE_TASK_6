package com.example.hilelenterpracetask6;

import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;
@Service
public class UserService {
    private Map<String, User> users = new HashMap<>();

    public void addUser(String username) {
        users.put(username, new User(username));
    }

    public void removeUser(String username) {
        users.remove(username);
    }

    public User getUser(String username) {
        return users.get(username);
    }
}
