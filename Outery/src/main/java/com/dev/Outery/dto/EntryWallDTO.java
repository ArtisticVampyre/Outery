package com.dev.Outery.dto;

import com.dev.Outery.entities.Entry;

import javax.persistence.OneToMany;
import java.util.List;

public class EntryWallDTO {
    private Long id;

    private List<Entry> entryContainer;


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
