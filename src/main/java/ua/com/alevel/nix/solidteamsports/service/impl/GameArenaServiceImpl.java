package ua.com.alevel.nix.solidteamsports.service.impl;

import ua.com.alevel.nix.solidteamsports.annotation.Value;
import ua.com.alevel.nix.solidteamsports.service.GameArenaService;

public class GameArenaServiceImpl implements GameArenaService {

    @Value("DonbassArena")
    private String arena;

    @Override
    public void checkArena() {
        System.out.println("Стадион " + arena + " готова");
    }

}
