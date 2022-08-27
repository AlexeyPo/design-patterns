package org.alexey.structural.adapter;

public class VlcMusicPlayer implements AdvancedMediaPlayer {
    @Override
    public void playVlcPlayer(String fileName) {
        System.out.println("Playing vlc file: " + fileName);
    }

    @Override
    public void playMp4Player(String fileName) {
        // do nothing;
    }
}
