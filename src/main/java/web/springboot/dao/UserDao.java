package web.springboot.dao;

import web.springboot.model.User;
import java.util.List;

public interface UserDao {

    List<User> getAllUsers();

    void addUser(User user);

    void updateUser(User user);

    void removeUser(int id);

    User getUserById(int id);

}
