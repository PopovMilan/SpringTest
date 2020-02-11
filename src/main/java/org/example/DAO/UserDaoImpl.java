package org.example.DAO;

import org.example.entity.User;
import org.example.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.List;

public class UserDaoImpl implements UserDao {
    public final JdbcTemplate jdbcTemplate;

    @Autowired
    public UserDaoImpl(JdbcTemplate jdbcTemplate){
        this.jdbcTemplate = jdbcTemplate;
    }

    @Override
    public void save(User user) {
        String sql = "INSERT INTO user (name , value) VALUES (?,?)";
        jdbcTemplate.update(sql, user.getName(), user.getValue());
    }

    @Override
    public User getById(int id) {
        String sql = "SELECT * FROM user WHERE id=? ";
        return jdbcTemplate.queryForObject(sql, new UserMapper(), id);
    }

    @Override
    public User getByName(String name) {
        String sql = "SELECT * FROM user WHERE name=?";
        return jdbcTemplate.queryForObject(sql, new UserMapper(), name);
    }

    @Override
    public List<User> findAll() {
        String sql = "SELECT * FROM user";
        return jdbcTemplate.query(sql, new UserMapper());
    }

    @Override
    public void update(User user) {
        String sql = "UPDATE user SET name=?, value=? WHERE id=?";
        jdbcTemplate.update(sql, user.getName(), user.getValue(),user.getId());

    }

    @Override
    public void delete(int id) {
        String sql = "DELETE FROM user WHERE id=?";
        jdbcTemplate.update(sql,id);

    }
}
