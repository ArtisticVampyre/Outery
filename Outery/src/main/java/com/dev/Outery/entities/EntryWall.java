package com.dev.Outery.entities;

import javax.persistence.*;
import java.util.HashMap;
import java.util.List;
@Entity
public class EntryWall {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToMany()
    private List<Entry> entryContainer;

    public EntryWall(Long id, List<Entry> entryContainer) {
        this.id = id;
        this.entryContainer = entryContainer;
    }
    public EntryWall(){

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
