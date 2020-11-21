package com.dev.Outery.controllers;

import com.dev.Outery.dto.EntryDTO;
import com.dev.Outery.dto.UserDTO;
import com.dev.Outery.entities.Entry;
import com.dev.Outery.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@Controller
public class UserController {
    @Autowired
    private UserService userService;

    @PostMapping("/api/addUser")
    public ResponseEntity addUser(@RequestBody UserDTO userDTO){
        userService.addUser(userDTO);
        return ResponseEntity.ok(HttpStatus.OK);
    }
    @GetMapping("/api/getAllUsers")
    public ResponseEntity getAllUsers(){
        List<UserDTO> userDTOList = userService.getUsers();
        return ResponseEntity.ok(userDTOList);
    }

    @PostMapping("/api/postEntry")
    public ResponseEntity addUser(@RequestBody EntryDTO entryDTO){
        userService.postEntry(entryDTO);
        return ResponseEntity.ok(HttpStatus.OK);
    }
}
