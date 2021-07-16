package com.example.demo.controllers;

import com.example.demo.dto.UserDTO;
import com.example.demo.resources.IUserResource;
import com.example.demo.services.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
public class UserController implements IUserResource {

    @Autowired
    private UserService userService;

    @Override
    public ResponseEntity<UserDTO> createUser(UserDTO userDTO) {
        log.info("Recebendo usuario: {}", userDTO);
        var user = userService.createUser(userDTO);
        return ResponseEntity.ok().body(user);
    }
}
