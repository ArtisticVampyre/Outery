package com.dev.Outery.repository;

import com.dev.Outery.entities.EntryWall;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EntryWallRepository extends JpaRepository<EntryWall,Long> {

}
