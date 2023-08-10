package com.example.databaserelationships.service.impl;

import com.example.databaserelationships.entity.Player;
import com.example.databaserelationships.entity.PlayerProfile;
import com.example.databaserelationships.repository.PlayerRepository;
import com.example.databaserelationships.service.PlayerService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class PlayerServiceImpl implements PlayerService {
    private PlayerRepository repository;

    @Override
    public Player createPlayer(Player player) {
        Player createdPlayer = repository.save(player);
        return createdPlayer;
    }

    @Override
    public Player assignProfile(int id, PlayerProfile playerProfile) {
        Player player = repository.findById(id).get();
        player.setPlayerProfile(playerProfile);
        Player updatedPlayer = repository.save(player);
        return updatedPlayer;
    }
}
