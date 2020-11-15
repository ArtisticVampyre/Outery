package com.dev.Outery.service;

import com.dev.Outery.dto.UserDTO;
import com.dev.Outery.entities.User;
import com.dev.Outery.enums.AccountStats;
import com.dev.Outery.enums.UserRole;
import com.dev.Outery.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;

    public void addUser(UserDTO userDTO){
        User user = new User();
        user.setCountry(userDTO.getCountry());
        user.setEmail(userDTO.getEmail());
        user.setAccountStats(AccountStats.ACTIVE);
        user.setFirstName(userDTO.getFirstName());
        user.setLastName(userDTO.getLastName());
        user.setUserBirthDate(userDTO.getUserBirthDate());
        user.setUserRole(UserRole.GENERAL);
        userRepository.save(user);
    }

    public List<UserDTO> getUsers(){
        List<User> userList = userRepository.findAll();
        List<UserDTO> userDTOList = new ArrayList<>();
        for (User user: userList) {
            UserDTO userDTO = new UserDTO();
            userDTO.setAccountCreation(user.getAccountCreation());
            userDTO.setAccountStats(user.getAccountStats());
            userDTO.setUserBirthDate(user.getUserBirthDate());
            userDTO.setProfileType(user.getProfileType());
            userDTO.setId(user.getId());
            userDTO.setUserRole(user.getUserRole());
            userDTO.setFollowing(user.getFollowing());
            userDTO.setFollowers(user.getFollowers());
            userDTO.setDescription(user.getDescription());
            userDTO.setPassword(user.getPassword());
            userDTO.setCountry(user.getCountry());
            userDTO.setUsername((user.getUsername()));
            userDTO.setFirstName(user.getFirstName());
            userDTO.setLastName(user.getLastName());
            userDTO.setEmail(user.getEmail());
            userDTOList.add(userDTO);
        }
        return userDTOList;
    }
}
