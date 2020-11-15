package com.dev.Outery.repository;

import com.dev.Outery.entities.EntryReaction;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EntryReactionRepository extends JpaRepository<EntryReaction,Long> {
}
