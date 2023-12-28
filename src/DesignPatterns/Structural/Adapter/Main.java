package DesignPatterns.Structural.Adapter;

public class Main {
    public static void main(String[] args) {
      //permite la colaboración entre objetos con interfaces incompatibles.
        AudioPlayer audioPlayer = new AudioPlayer();

        audioPlayer.play("mp4", "song.mp4");
        audioPlayer.play("vlc", "movie.vlc");

        //imprimir audioplayer
        System.out.println(audioPlayer);

    }
}
