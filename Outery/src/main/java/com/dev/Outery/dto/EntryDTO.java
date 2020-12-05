package com.dev.Outery.dto;

import com.dev.Outery.entities.Entry;
import com.dev.Outery.entities.EntryReaction;
import com.dev.Outery.entities.User;
import com.dev.Outery.enums.EntryType;

import java.util.Date;
import java.util.List;

public class EntryDTO {

    private Long id;
    // Basic entry data

    private EntryType entryType;

    private UserDTO owner;

    private UserDTO creator;

    private String textData;

    private Date postTime;
    // Interaction related data

    private List<EntryDTO> comments;

    private List<EntryReactionDTO> reactions;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public EntryType getEntryType() {
        return entryType;
    }

    public void setEntryType(EntryType entryType) {
        this.entryType = entryType;
    }

    public UserDTO getOwner() {
        return owner;
    }

    public void setOwner(UserDTO owner) {
        this.owner = owner;
    }

    public UserDTO getCreator() {
        return creator;
    }

    public void setCreator(UserDTO creator) {
        this.creator = creator;
    }

    public String getTextData() {
        return textData;
    }

    public void setTextData(String textData) {
        this.textData = textData;
    }

    public Date getPostTime() {
        return postTime;
    }

    public void setPostTime(Date postTime) {
        this.postTime = postTime;
    }

    public List<EntryDTO> getComments() {
        return comments;
    }

    public void setComments(List<EntryDTO> comments) {
        this.comments = comments;
    }

    public List<EntryReactionDTO> getReactions() {
        return reactions;
    }

    public void setReactions(List<EntryReactionDTO> reactions) {
        this.reactions = reactions;
    }
}
