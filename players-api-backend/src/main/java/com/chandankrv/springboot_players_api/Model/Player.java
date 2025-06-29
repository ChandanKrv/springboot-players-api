package com.chandankrv.springboot_players_api.Model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Created by ChandanKrv on 29 June, 2025.
 * --------------------------------------------
 * Q. Problem Statement :
 */
@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Player {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private int age;
    private int runs;
    private int wickets;
}
