package com.zkrichen.userportal;

import java.util.List;

public interface UserRepository  {

    void delete(User user);

    List<User> findAll();

    User findOne(int id);

    User save(User user);
}
