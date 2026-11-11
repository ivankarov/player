package ru.ivan.karov;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

public class Computer {
    private int id;
    private MusicPlayer player;

    public Computer(MusicPlayer player) {
        this.id = 1;
        this.player = player;
    }

    public void playingMusic(){
        player.playMusic();
    }
}
