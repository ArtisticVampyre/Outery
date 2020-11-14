package com.dev.Outery.entities;

import com.dev.Outery.enums.AccountStats;
import com.dev.Outery.enums.ProfileType;
import com.dev.Outery.enums.UserRole;

import java.util.Date;
import java.util.HashMap;
import java.util.List;


public class User {
    // Base profile data
    private String userProfileImage;
    private String username;
    private String password;
    private Long id;
    // Other profile data
    private Date accountCreationTime;
    private Date userBirthDate;
    private String description;
    private String secondName;
    private String firstName;
    private String country;
    private String email;
    // Enums
    private AccountStats accountStats;
    private ProfileType profileType;
    private UserRole userRole;
    // Link Data
    private List<User> followers;
    private List<User> following;
    // Entry data
    private EntryWall userEntries;
    private EntryWall userWall;


    public User(String username, String password, Date userBirthDate, String secondName, String firstName, String email) {
        this.username = username;
        this.password = password;
        this.userBirthDate = userBirthDate;
        this.secondName = secondName;
        this.firstName = firstName;
        this.email = email;
    }

    public void followUser(User targetUser) {
        //
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
}
