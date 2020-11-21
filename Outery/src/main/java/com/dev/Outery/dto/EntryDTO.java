package com.dev.Outery.dto;

import com.dev.Outery.entities.Entry;
import com.dev.Outery.entities.EntryReaction;
import com.dev.Outery.entities.User;
import com.dev.Outery.enums.EntryType;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

public class EntryDTO {

    private Long id;
    // Basic entry data

    private EntryType entryType;

    private User owner;

    private User creator;

    private String textData;

    private Date postTime;
    // Interaction related data

    private List<Entry> comments;

    private List<EntryReaction> reactions;

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

    public User getOwner() {
        return owner;
    }

    public void setOwner(User owner) {
        this.owner = owner;
    }

    public User getCreator() {
        return creator;
    }

    public void setCreator(User creator) {
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

    public List<Entry> getComments() {
        return comments;
    }

    public void setComments(List<Entry> comments) {
        this.comments = comments;
    }

    public List<EntryReaction> getReactions() {
        return reactions;
    }

    public void setReactions(List<EntryReaction> reactions) {
        this.reactions = reactions;
    }
}
