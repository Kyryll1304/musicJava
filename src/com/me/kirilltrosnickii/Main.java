package com.me.kirilltrosnickii;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        MusicStyles abba = new PopMusic();
        MusicStyles metallica = new RockMusic();
        MusicStyles mozart = new ClassicMusic();

        List<MusicStyles> musicStylesList = new ArrayList<>();
        musicStylesList.add(abba);
        musicStylesList.add(metallica);
        musicStylesList.add(mozart);

        for (MusicStyles musicStyle : musicStylesList) {
            musicStyle.playMusic();
        }
    }
}