package com.digitae.dsmovie.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.digitae.dsmovie.entities.Movie;

public interface MovieRepository extends JpaRepository<Movie, Long>{

}
