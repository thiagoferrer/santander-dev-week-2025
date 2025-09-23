package me.dio.service;

import me.dio.domian.model.User;

public interface UserService {
    User findById(Long id);

    User create(User userToCreate);
}
