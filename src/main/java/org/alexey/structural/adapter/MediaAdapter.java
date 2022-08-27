package org.alexey.structural.adapter;

import static org.alexey.structural.adapter.MediaType.*;

public class MediaAdapter implements MediaPlayer {

    private AdvancedMediaPlayer advancedMediaPlayer;

    public MediaAdapter(MediaType mediaType) {
        if (VLC.equals(mediaType)) {
            advancedMediaPlayer = new VlcMusicPlayer();
        } else if (MP_4.equals(mediaType)) {
            advancedMediaPlayer = new Mp4MusicPlayer();
        }
    }

    @Override
    public void playMusic(MediaType mediaType, String fileName) {
        if (VLC.equals(mediaType)) {
            advancedMediaPlayer.playVlcPlayer(fileName);
        } else if (MP_4.equals(mediaType)) {
            advancedMediaPlayer.playMp4Player(fileName);
        }
    }
}
