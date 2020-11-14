package entities;

import enums.AccountStats;
import enums.ProfileType;
import enums.UserRole;

import java.util.Date;
import java.util.HashMap;

public class User {
    // Base profile data
    private String userProfileImage;
    private String username;
    private String password;
    private String id;
    // Other profile data
    private Date accountCreationTime;
    private Date userBirthDate;
    private String secondName;
    private String firstName;
    private String country;
    private String email;
    // Enums
    private AccountStats accountStats;
    private ProfileType profileType;
    private UserRole userRole;
    // Link Data
    private HashMap<Object,User> followers;
    private HashMap<Object,User> following;
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
}
