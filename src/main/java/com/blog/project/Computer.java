package com.blog.project;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Computer {
    private int id;
    private MusicPlayer musicPlayer;

    @Autowired
    public Computer(MusicPlayer musicPlayer) {
        this.id = 1;
        this.musicPlayer = musicPlayer;
    }

    public String getMusicPlayerName() {
        return this.musicPlayer.getName();
    }

    public int getMusicPlayerVolume() {
        return this.musicPlayer.getVolume();
    }


    @Override
    public String toString() {
        return "Computer " +
                "id=" + id +
                " " + musicPlayer.playMusic();
    }
}
