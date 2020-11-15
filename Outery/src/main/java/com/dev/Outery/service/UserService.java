package com.dev.Outery.service;

import com.dev.Outery.dto.UserDTO;
import com.dev.Outery.entities.User;
import com.dev.Outery.repository.UserRepository;
import com.dev.Outery.transformers.UserTransformer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;
    @Autowired
    private UserTransformer userTransformer;

    public void addUser(UserDTO userDTO){
        User user = userTransformer.convertDTOToEntity(userDTO);
        userRepository.save(user);
    }

    public List<UserDTO> getUsers(){
        List<User> userList = userRepository.findAll();
        List<UserDTO> userDTOList = new ArrayList<>();
        for (User user: userList) {
            UserDTO userDTO = userTransformer.convertEntityToDTO(user);
            userDTOList.add(userDTO);
        }
        return userDTOList;
    }
}
