package com.dev.Outery.service;

import com.dev.Outery.dto.EntryDTO;
import com.dev.Outery.dto.UserDTO;
import com.dev.Outery.entities.Entry;
import com.dev.Outery.entities.EntryWall;
import com.dev.Outery.entities.User;
import com.dev.Outery.repository.EntryWallRepository;
import com.dev.Outery.repository.UserRepository;
import com.dev.Outery.transformers.UserTransformer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Optional;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;
    @Autowired
    private UserTransformer userTransformer;
    @Autowired
    private EntryWallRepository entryWallRepository;

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

    public void postEntry(Long id,EntryDTO userEntry){
        Optional<User> userOptional = userRepository.findById(id);
        if(!userOptional.isPresent()){
            return;
        }
        User user = userOptional.get();
        Entry entryEntity = new Entry();
        entryEntity.setTextData(userEntry.getTextData());
        entryEntity.setCreator(user);
        entryEntity.setPostTime(new Date());
        EntryWall entryWall = user.getUserEntries();
        entryWall.getEntryContainer().add(entryEntity);
        entryWallRepository.save(entryWall);
    }

    public void addFollower(UserDTO follower,Long followedId){
        Optional<User> userFollowingOptional = userRepository.findById(follower.getId());
        Optional<User> userFollowedOptional = userRepository.findById(followedId);
        if(!userFollowingOptional.isPresent() || !userFollowedOptional.isPresent() ){
            return;
        }
        User userFollowing = userFollowingOptional.get();
        User userFollowed = userFollowedOptional.get();
        userFollowing.addFollowing(userFollowed);
        userFollowed.addFollower(userFollowing);
    }

}
