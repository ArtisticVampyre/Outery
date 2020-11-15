package com.dev.Outery.entities;

import com.dev.Outery.enums.EntryType;
import com.dev.Outery.enums.Reactions;

import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import java.sql.Time;
import java.util.HashMap;
import java.util.List;
@Entity
@Table(name="Entry")
public class Entry {
    // Basic entry data
    private EntryType entryType;
    @OneToOne()
    private User owner;
    @OneToOne()
    private User creator;
    private String textData;
    private Time postTime;
    // Interaction related data
    @OneToMany()
    private List<Entry> comments;
    @OneToMany()
    private List<EntryReaction> reactions;
}
