package web.springboot.service;

import web.springboot.model.User;
import java.util.List;


public interface UserService {

    List<User> getAllUsers();

    void addUser(User user);

    void updateUser(User user);

    void removeUser(int id);

    User getUserById(int id);

}
