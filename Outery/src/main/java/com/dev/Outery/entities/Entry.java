package com.dev.Outery.entities;

import com.dev.Outery.enums.EntryType;
import com.dev.Outery.enums.Reactions;

import javax.persistence.*;
import java.sql.Time;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
@Entity
@Table(name="Entry")
public class Entry {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    // Basic entry data
    @Enumerated(EnumType.STRING)
    private EntryType entryType;
    @OneToOne
    private User owner;
    @OneToOne
    private User creator;
    private String textData;
    @Temporal(TemporalType.TIMESTAMP)
    private Date postTime;
    // Interaction related data
    @OneToMany
    private List<Entry> comments;
    @OneToMany
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
