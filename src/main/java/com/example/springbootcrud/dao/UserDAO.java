package com.example.springbootcrud.dao;



import com.example.springbootcrud.model.User;

import java.util.List;

public interface UserDAO {
    List<User> getAllUsers();

    void saveUser(User user);

    User getUser(int id);

    void deleteUser(int id);
}
