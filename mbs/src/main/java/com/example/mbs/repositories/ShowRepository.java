package com.example.mbs.repositories;

import com.example.mbs.models.show.Show;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.sql.Date;
import java.util.Set;

@Repository
public interface ShowRepository extends JpaRepository<Show, Integer> {
    @Query("SELECT sh FROM Show sh " +
            "JOIN sh.screen sc " +
            "JOIN sc.theatre th " +
            "WHERE th.theatreId = :theatreId AND sh.showDate = :showDate")
    Set<Show> findShowsByTheatreId(@Param("theatreId") Integer theatreId, @Param("showDate") Date showDate);
}
