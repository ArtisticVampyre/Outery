package com.dev.Outery.entities;

import com.dev.Outery.enums.AccountStats;
import com.dev.Outery.enums.ProfileType;
import com.dev.Outery.enums.UserRole;

import javax.persistence.*;
import java.util.Date;
import java.util.HashMap;
import java.util.List;

@Entity
@Table(name="User")
public class User {
    // Base profile data

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;




    private String username;

    private String password;

    private String userProfileImage;

    // Other profile data
    @Temporal()
    private Date accountCreation;
    @Temporal()
    private Date userBirthDate;

    private String description;

    private String lastName;

    private String firstName;

    private String country;

    private String email;
    // Enums

    private AccountStats accountStats;

    private ProfileType profileType;

    private UserRole userRole;
    // Link Data
    @OneToMany()
    private List<User> followers;
    @OneToMany()
    private List<User> following;
    // Entry data
    private EntryWall userEntries;
    private EntryWall userWall;

}
