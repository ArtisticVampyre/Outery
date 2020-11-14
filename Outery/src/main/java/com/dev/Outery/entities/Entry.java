package com.dev.Outery.entities;

import com.dev.Outery.enums.Reactions;

import java.sql.Time;
import java.util.HashMap;
import java.util.List;

public class Entry {
    // Basic entry data
    private String entryType;
    private UserView owner;
    private UserView creator;
    private String textData;
    private Time postTime;
    // Interaction related data
    private List<Entry> comments;
    private List<EntryReaction> reactions;

}
