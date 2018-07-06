package net.vitalii.dao.impl;

import net.vitalii.dao.UserDao;
import net.vitalii.dao.exceptions.DaoSystemException;
import net.vitalii.dao.exceptions.NoSuchEntityException;
import net.vitalii.entity.User;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class UserDaoMock implements UserDao {
    private static Map<Integer, User> userDB = new ConcurrentHashMap<>();

    public UserDaoMock() {
        this.userDB.put(1, new User("Vitalii", "password"));
        this.userDB.put(2, new User("Kristina", "password"));
        this.userDB.put(3, new User("Vlada", "password"));
    }

    @Override
    public User getUserById(int id) throws DaoSystemException, NoSuchEntityException {
        if (!userDB.containsKey(id)){
            throw new NoSuchEntityException("No such user");
        }
        return userDB.get(id);
    }
}
