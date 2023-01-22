package com.example.demo.user.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.demo.user.dao.model.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
