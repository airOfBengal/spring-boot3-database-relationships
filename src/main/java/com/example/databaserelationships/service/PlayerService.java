package com.example.databaserelationships.service;

import com.example.databaserelationships.entity.Player;
import com.example.databaserelationships.entity.PlayerProfile;

public interface PlayerService {
    Player createPlayer(Player player);
    Player assignProfile(int id, PlayerProfile playerProfile);
}
