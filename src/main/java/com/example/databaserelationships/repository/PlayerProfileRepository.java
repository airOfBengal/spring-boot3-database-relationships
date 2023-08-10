package com.example.databaserelationships.repository;

import com.example.databaserelationships.entity.PlayerProfile;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PlayerProfileRepository extends JpaRepository<PlayerProfile, Integer> {
}
