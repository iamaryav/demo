package com.example.demo.user.service;

import java.util.List;
import java.util.Optional;
import org.springframework.stereotype.Service;
import com.example.demo.user.dao.UserRepository;
import com.example.demo.user.mapper.UserMapper;
import com.example.demo.user.model.User;

@Service
public class UserService {

    private final UserMapper userMapper;
    private final UserRepository userRepository;

    public UserService(UserMapper userMapper, UserRepository userRepository) {
        this.userMapper = userMapper;
        this.userRepository = userRepository;
    }

    public List<User> findAllUser() {
        return Optional.of(userRepository.findAll()).map(userMapper::mapToDtoUsers)
                .orElse(List.of());
    }

}
