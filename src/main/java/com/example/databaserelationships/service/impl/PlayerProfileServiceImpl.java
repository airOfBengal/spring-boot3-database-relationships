package com.example.databaserelationships.service.impl;

import com.example.databaserelationships.entity.PlayerProfile;
import com.example.databaserelationships.repository.PlayerProfileRepository;
import com.example.databaserelationships.repository.PlayerRepository;
import com.example.databaserelationships.service.PlayerProfileService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class PlayerProfileServiceImpl implements PlayerProfileService {
    private PlayerProfileRepository repository;

    @Override
    public PlayerProfile createPlayerProfile(PlayerProfile playerProfile) {
        PlayerProfile profile = repository.save(playerProfile);
        return profile;
    }

    @Override
    public PlayerProfile getPlayerProfileById(int id) {
        PlayerProfile profile = repository.findById(id).get();
        return profile;
    }
}
