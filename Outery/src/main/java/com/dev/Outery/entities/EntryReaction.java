package com.dev.Outery.entities;

import com.dev.Outery.enums.Reactions;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="EntryReaction")
public class EntryReaction {
    private Reactions reaction;
}
