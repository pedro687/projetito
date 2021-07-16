package com.example.demo.resources;

import com.example.demo.dto.UserDTO;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping(value = "/users")
public interface IUserResource {

    @PostMapping
    ResponseEntity<UserDTO> createUser(@RequestBody UserDTO userDTO);


}
