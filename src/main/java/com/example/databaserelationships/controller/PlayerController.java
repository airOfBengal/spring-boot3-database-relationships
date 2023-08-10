package com.example.databaserelationships.controller;

import com.example.databaserelationships.entity.Player;
import com.example.databaserelationships.entity.PlayerProfile;
import com.example.databaserelationships.service.PlayerProfileService;
import com.example.databaserelationships.service.PlayerService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/players")
public class PlayerController {
    @Autowired
    private PlayerService service;
    @Autowired
    private PlayerProfileService profileService;

    @PostMapping
    public ResponseEntity<Player> createPlayer(@RequestBody Player player){
        Player createdPlayer = service.createPlayer(player);
        return new ResponseEntity<>(createdPlayer, HttpStatus.CREATED);
    }

    @PutMapping("{id}/profiles/{profile-id}")
    public ResponseEntity<Player> assignProfile(@PathVariable("id") int id, @PathVariable("profile-id") int profileId){
        PlayerProfile profile = profileService.getPlayerProfileById(profileId);
        Player updatedPlayer = service.assignProfile(id, profile);
        return ResponseEntity.ok(updatedPlayer);
    }
}
