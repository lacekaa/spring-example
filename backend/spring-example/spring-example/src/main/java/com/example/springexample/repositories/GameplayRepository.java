package com.example.springexample.repositories;

import com.example.springexample.domain.gameplay.Game;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface GameplayRepository extends JpaRepository <UUID, Game> {
}
