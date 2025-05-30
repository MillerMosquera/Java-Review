package DesignPatterns.Structural.Adapter;

public class MediaAdapter implements MediaPlayer {
    AdvanceMediaPlayer advanceMediaPlayer;

    public MediaAdapter(String audioType){
        if(audioType.equalsIgnoreCase("vlc")){
            advanceMediaPlayer = new VlcPlayer();
        }else if (audioType.equalsIgnoreCase("mp4")){
            //Create a different adapter for MP4 if needed
        }
    }

    @Override
    public void play(String audioType, String file){
        if(audioType.equalsIgnoreCase("vlc")){
            advanceMediaPlayer.playVlc(file);
        }else if(audioType.equalsIgnoreCase("mp4")){
            //Handle MP4 playback
        }
    }
}
