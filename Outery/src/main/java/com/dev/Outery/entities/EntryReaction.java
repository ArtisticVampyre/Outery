package com.dev.Outery.entities;

import com.dev.Outery.enums.Reactions;

import javax.persistence.*;

@Entity
@Table(name="EntryReaction")
public class EntryReaction {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Enumerated(EnumType.STRING)
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
