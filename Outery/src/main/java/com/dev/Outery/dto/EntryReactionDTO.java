package com.dev.Outery.dto;

import com.dev.Outery.enums.Reactions;

import javax.persistence.EnumType;
import javax.persistence.Enumerated;

public class EntryReactionDTO {
    private Long id;

    private Reactions reaction;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Reactions getReaction() {
        return reaction;
    }

    public void setReaction(Reactions reaction) {
        this.reaction = reaction;
    }
}
