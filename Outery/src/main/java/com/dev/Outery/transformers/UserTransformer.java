package com.dev.Outery.transformers;

import com.dev.Outery.dto.UserDTO;
import com.dev.Outery.entities.Entry;
import com.dev.Outery.entities.User;
import com.dev.Outery.enums.AccountStats;
import com.dev.Outery.enums.UserRole;
import com.fasterxml.jackson.databind.util.BeanUtil;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Component;

import java.util.Date;

@Component
public class UserTransformer {
    public User convertDTOToEntity(UserDTO userDTO){
        User user = new User();
        user.setCountry(userDTO.getCountry());
        user.setEmail(userDTO.getEmail());
        user.setAccountStats(AccountStats.ACTIVE);
        user.setFirstName(userDTO.getFirstName());
        user.setLastName(userDTO.getLastName());
        user.setUsername(userDTO.getUsername());
        user.setPassword(userDTO.getPassword());
        user.setUserBirthDate(userDTO.getUserBirthDate());
        user.setUserRole(UserRole.GENERAL);
        user.setAccountCreation(new Date());
        return user;
    }

    public UserDTO convertEntityToDTO(User user){
        UserDTO userDTO = new UserDTO();
        BeanUtils.copyProperties(user,userDTO);
        return userDTO;
    }
}
