package ru.ivan.karov;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Random;


public class MusicPlayer {
    @Value("${musicPlayer.name}")
    private String name;
    @Value("${musicPlayer.volume}")
    private int volume;

    private List<Music> musicList;

    public String getName() {
        return name;
    }

    public int getVolume() {
        return volume;
    }

    public MusicPlayer(List<Music> musicList){
        this.musicList=musicList;
    }

    public String playMusic(){
        Random rand = new Random();
        return musicList.get(rand.nextInt(musicList.size())).getSong();
        }

}
