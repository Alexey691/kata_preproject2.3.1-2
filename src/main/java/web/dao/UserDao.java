package web.dao;

import web.models.User;

import java.util.List;

public interface UserDao {

    void saveUser(User user);

    void delUser(User user);

    void updUser(long id, User user);

    User getUser(long id);

    List<User> getAllUsers();

}
