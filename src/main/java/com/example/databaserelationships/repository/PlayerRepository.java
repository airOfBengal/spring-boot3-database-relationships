package com.example.databaserelationships.repository;

import com.example.databaserelationships.entity.Player;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PlayerRepository extends JpaRepository<Player, Integer> {
}
