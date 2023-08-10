package com.example.databaserelationships.service;

import com.example.databaserelationships.entity.PlayerProfile;

public interface PlayerProfileService{
    PlayerProfile createPlayerProfile(PlayerProfile playerProfile);
    PlayerProfile getPlayerProfileById(int id);
}
