package com.digitae.dsmovie.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.digitae.dsmovie.entities.Score;
import com.digitae.dsmovie.entities.ScorePK;

public interface ScoreRepository extends JpaRepository<Score, ScorePK>{


}
