package entities;

import java.util.HashMap;

public class EntryWall {
    private HashMap<Object,Entry> entryContainer;

    public EntryWall(HashMap<Object, Entry> entryContainer) {
        this.entryContainer = entryContainer;
    }
}
