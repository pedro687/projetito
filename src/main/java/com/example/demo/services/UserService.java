package com.example.demo.services;

import com.example.demo.dto.UserDTO;
import com.example.demo.repository.UserRepository;
import com.example.demo.utils.UserConverter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;

    @Autowired
    private UserConverter userConverter;

    public UserDTO createUser(UserDTO userDTO) {
        var convertedUser = userConverter.toUser(userDTO);
        var createdUser = userRepository.save(convertedUser);
        return userConverter.toDto(createdUser);
    }
}
