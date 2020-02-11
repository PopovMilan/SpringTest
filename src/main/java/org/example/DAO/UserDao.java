package org.example.DAO;

import org.example.entity.User;

import java.util.List;

public interface UserDao {
    void save(User user);

    User getById(int id);
    User getByName(String name);

    List<User> findAll();
    void update(User user);
    void delete(int id);
}
