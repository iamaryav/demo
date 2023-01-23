package com.example.demo.user.mapper;

import java.util.List;
import org.mapstruct.Mapper;
import com.example.demo.user.model.User;

@Mapper(componentModel = "spring")
public interface UserMapper {

    List<User> mapToDtoUsers(List<com.example.demo.user.dao.model.User> users);

    User mapToDto(com.example.demo.user.dao.model.User user);

    com.example.demo.user.dao.model.User mapToEntity(User user);

}
