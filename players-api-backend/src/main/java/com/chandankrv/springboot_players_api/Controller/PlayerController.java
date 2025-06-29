package com.chandankrv.springboot_players_api.Controller;

import com.chandankrv.springboot_players_api.Repository.PlayerRepository;
import com.chandankrv.springboot_players_api.Model.Player;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by ChandanKrv on 29 June, 2025.
 * --------------------------------------------
 * Q. Problem Statement :
 */
@RestController
@RequestMapping("/api/players")
public class PlayerController {

   private final PlayerRepository playerRepository;

    public PlayerController(PlayerRepository playerRepository) {
        this.playerRepository = playerRepository;
    }


    @GetMapping
    public List<Player> getAllPlayers(@RequestParam(required = false) String name){
       if(name!=null){
           return playerRepository.findByNameIgnoreCase(name);
       }
       return playerRepository.findAll();
    }

    @PostMapping
    public Player addPlayer(@RequestBody Player player){
        return playerRepository.save(player);
    }

}
