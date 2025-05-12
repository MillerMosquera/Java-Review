package DesignPatterns.Structural.Adapter;

import lombok.ToString;

@ToString
public class AudioPlayer {
    MediaPlayer mediaPlayer;

    public void play(String audioType, String fileName){
        if(audioType.equalsIgnoreCase("mp4")){
            //Play MP4 directly
        }else {
            mediaPlayer = new MediaAdapter(audioType);
            mediaPlayer.play(audioType, fileName);
        }
    }
}
