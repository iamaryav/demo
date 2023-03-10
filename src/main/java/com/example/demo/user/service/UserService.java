package com.example.demo.user.service;

import java.util.List;
import java.util.Optional;
import org.springframework.stereotype.Service;
import com.example.demo.user.dao.UserRepository;
import com.example.demo.user.mapper.UserMapper;
import com.example.demo.user.model.User;
import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class UserService {

    private final UserMapper userMapper;
    private final UserRepository userRepository;

    public UserService(UserMapper userMapper, UserRepository userRepository) {
        this.userMapper = userMapper;
        this.userRepository = userRepository;
    }

    public List<User> findAllUser() {
        log.info("Fetched all user details.");
        return Optional.of(userRepository.findAll()).map(userMapper::mapToDtoUsers)
                .orElse(List.of());
    }

    public User createUser(User user) {
        log.info("User created.");
        return Optional.of(user).map(userMapper::mapToEntity).map(userRepository::save)
                .map(userMapper::mapToDto).orElse(null);
    }

}
