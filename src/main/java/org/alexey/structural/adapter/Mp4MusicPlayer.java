package org.alexey.structural.adapter;

public class Mp4MusicPlayer implements AdvancedMediaPlayer {
    @Override
    public void playVlcPlayer(String fileName) {
        //do nothing
    }

    @Override
    public void playMp4Player(String fileName) {
        System.out.println("Playing mp4 file: " + fileName);
    }
}
