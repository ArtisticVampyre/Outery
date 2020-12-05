package com.dev.Outery.dto;

import com.dev.Outery.entities.EntryWall;
import com.dev.Outery.entities.User;
import com.dev.Outery.enums.AccountStats;
import com.dev.Outery.enums.ProfileType;
import com.dev.Outery.enums.UserRole;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

public class UserDTO {
    private Long id;

    private String username;

    private String password;

    private String userProfileImage;

    private Date accountCreation;

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
    private List<UserDTO> followers;

    private List<UserDTO> following;

    private EntryWallDTO userEntries;

    private EntryWallDTO userWall;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUserProfileImage() {
        return userProfileImage;
    }

    public void setUserProfileImage(String userProfileImage) {
        this.userProfileImage = userProfileImage;
    }

    public Date getAccountCreation() {
        return accountCreation;
    }

    public void setAccountCreation(Date accountCreation) {
        this.accountCreation = accountCreation;
    }

    public Date getUserBirthDate() {
        return userBirthDate;
    }

    public void setUserBirthDate(Date userBirthDate) {
        this.userBirthDate = userBirthDate;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public AccountStats getAccountStats() {
        return accountStats;
    }

    public void setAccountStats(AccountStats accountStats) {
        this.accountStats = accountStats;
    }

    public ProfileType getProfileType() {
        return profileType;
    }

    public void setProfileType(ProfileType profileType) {
        this.profileType = profileType;
    }

    public UserRole getUserRole() {
        return userRole;
    }

    public void setUserRole(UserRole userRole) {
        this.userRole = userRole;
    }

    public List<UserDTO> getFollowers() {
        return followers;
    }

    public void setFollowers(List<UserDTO> followers) {
        this.followers = followers;
    }

    public List<UserDTO> getFollowing() {
        return following;
    }

    public void setFollowing(List<UserDTO> following) {
        this.following = following;
    }

    public EntryWallDTO getUserEntries() {
        return userEntries;
    }

    public void setUserEntries(EntryWallDTO userEntries) {
        this.userEntries = userEntries;
    }

    public EntryWallDTO getUserWall() {
        return userWall;
    }

    public void setUserWall(EntryWallDTO userWall) {
        this.userWall = userWall;
    }
}
