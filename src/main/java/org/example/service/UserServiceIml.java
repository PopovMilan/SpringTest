package org.example.service;

import org.example.DAO.UserDao;
import org.example.entity.User;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class UserServiceIml implements UserService{
    @Autowired
    public UserDao userDao;

    @Override
    public void save(User user) {
       // if (user.getName().equals("^[a-z A-Z]+$")&& user.getName().length()<5 && user.getValue().equals("[1-9]+") && user.getValue().length()<6)
            userDao.save(user);
      /*  else {
           userDao.save(null);
        }*/
    }

    @Override
    public User getById(int id) {
        return userDao.getById(id);
    }

    @Override
    public User getByName(String name) {
        return userDao.getByName(name);
    }

    @Override
    public List<User> findAll() {
        return userDao.findAll();
    }

    @Override
    public void update(User user) {
        userDao.update(user);

    }

    @Override
    public void delete(int id) {
        userDao.delete(id);
    }
}
