package com.dev.Outery.entities;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
@Entity
public class EntryWall {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToMany(cascade = CascadeType.ALL)
    private List<Entry> entryContainer = new ArrayList<>();

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

    public List<Entry> getEntryContainer() {
        return entryContainer;
    }

    public void setEntryContainer(List<Entry> entryContainer) {
        this.entryContainer = entryContainer;
    }
}
