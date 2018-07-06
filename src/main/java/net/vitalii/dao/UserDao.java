package net.vitalii.dao;

import net.vitalii.dao.exceptions.DaoSystemException;
import net.vitalii.dao.exceptions.NoSuchEntityException;
import net.vitalii.entity.User;

public interface UserDao {

    public User getUserById(int id) throws DaoSystemException, NoSuchEntityException;

}
