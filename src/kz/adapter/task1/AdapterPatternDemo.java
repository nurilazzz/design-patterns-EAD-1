package kz.adapter.task1;

import java.util.ArrayList;

public class AdapterPatternDemo {
    public static void main(String[] args) {
        AdvancedMediaPlayer windowsPlayer = new WindowsDefaultMediaPlayer();
        MediaPlayer audioPlayer = new AudioPlayer();

        MediaAdapter adapter = new MediaAdapter();
        adapter.setMediaPlayer(windowsPlayer);

        ArrayList<MediaPlayer> list = new ArrayList<>();
        list.add(adapter);
        list.add(audioPlayer);

        for (MediaPlayer item : list)
            item.playMp3();
    }
}
