package org.alexey.structural.adapter;

public class AdapterDemo {
    public static void main(String[] args) {
        new AdapterDemo().run();
    }

    private void run() {
        AudioPlayer audioPlayer = new AudioPlayer();
        audioPlayer.playMusic(MediaType.MP_3, "song1.mp3");
        audioPlayer.playMusic(MediaType.MP_4, "song2.mp4");
        audioPlayer.playMusic(MediaType.VLC, "song3.vlc");
    }
}
