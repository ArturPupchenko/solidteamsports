package ua.com.alevel.nix.solidteamsports.service.impl;

import ua.com.alevel.nix.solidteamsports.annotation.Value;
import ua.com.alevel.nix.solidteamsports.exception.GameArenaException;
import ua.com.alevel.nix.solidteamsports.service.GameArenaService;

public class GameArenaServiceImpl implements GameArenaService {

    @Value("DonbassArena")
    private String arena;

    private boolean arenaIsReady = true;

    @Override
    public void isReady() {
        if (arenaIsReady) {
            System.out.println("Стадион " + arena + " готова");
        } else {
            throw new GameArenaException("Стадион не готов");
        }
    }

}
