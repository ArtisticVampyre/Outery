package com.dev.Outery.repository;


import com.dev.Outery.entities.Entry;
import com.dev.Outery.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EntryRepository extends JpaRepository<Entry,Long> {
    List<Entry> getEntriesByCreator(User creator);

    List<Entry> getEntriesByOwner(User owner);
}
