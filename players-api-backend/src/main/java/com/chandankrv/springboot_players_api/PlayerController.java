package com.chandankrv.springboot_players_api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by ChandanKrv on 29 June, 2025.
 * --------------------------------------------
 * Q. Problem Statement :
 */
@RestController
@RequestMapping("/api/players")
public class PlayerController {

    @GetMapping
    public String getAllPlayers(){
        return "All Players";
    }

}
