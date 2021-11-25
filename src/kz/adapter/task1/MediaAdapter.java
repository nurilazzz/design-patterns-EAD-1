package kz.adapter.task1;

public class MediaAdapter implements MediaPlayer {
    AdvancedMediaPlayer mediaPlayer;

    public void setMediaPlayer(AdvancedMediaPlayer mediaPlayer) {
        this.mediaPlayer = mediaPlayer;
    }

    @Override
    public void playMp3() {
        mediaPlayer.playVlc();
    }
}
