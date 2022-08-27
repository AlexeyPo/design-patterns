package org.alexey.structural.adapter;

import static org.alexey.structural.adapter.MediaType.*;

public class AudioPlayer implements MediaPlayer {

    @Override
    public void playMusic(MediaType mediaType, String fileName) {
        if (MP_3.equals(mediaType)) {
            System.out.println("Playing mp3 file: " + fileName);
        } else if (VLC.equals(mediaType) || MP_4.equals(mediaType)) {
            MediaAdapter mediaAdapter = new MediaAdapter(mediaType);
            mediaAdapter.playMusic(mediaType, fileName);
        }
    }
}
