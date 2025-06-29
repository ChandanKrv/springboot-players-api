package com.chandankrv.springboot_players_api.Repository;

import com.chandankrv.springboot_players_api.Model.Player;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * Created by ChandanKrv on 29 June, 2025.
 * --------------------------------------------
 * Q. Problem Statement :
 */
public interface PlayerRepository extends JpaRepository<Player,Long> {
    List<Player> findByNameIgnoreCase(String name);
}
