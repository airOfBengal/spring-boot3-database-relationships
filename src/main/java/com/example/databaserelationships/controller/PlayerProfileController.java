package com.example.databaserelationships.controller;

import com.example.databaserelationships.entity.PlayerProfile;
import com.example.databaserelationships.service.PlayerProfileService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/profiles")
@AllArgsConstructor
public class PlayerProfileController {
    private PlayerProfileService service;

    @PostMapping
    public ResponseEntity<PlayerProfile> createPlayerProfile(@RequestBody PlayerProfile playerProfile){
        PlayerProfile profile = service.createPlayerProfile(playerProfile);
        return new ResponseEntity<>(profile, HttpStatus.CREATED);
    }
}
