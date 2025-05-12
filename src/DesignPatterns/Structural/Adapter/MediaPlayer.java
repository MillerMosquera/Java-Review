package DesignPatterns.Structural.Adapter;

public interface MediaPlayer {
    void play(String audoType, String fileName);
}
interface AdvanceMediaPlayer{
    void playVlc(String fileName);
    void playMp4(String fileName);
}
