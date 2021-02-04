package ru.spring;

import java.util.Random;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

public class MusicPlayer {

  private Music music1;
  private Music music2;
  @Value("${musicPlayer.name}")
  private String name;
  @Value("${musicPlayer.volume}")
  private int volume;

  public String getName() {
    return name;
  }

  public int getVolume() {
    return volume;
  }

  public MusicPlayer(@Qualifier("rockMusic") Music music1,
      @Qualifier("classicalMusic") Music music2) {
    this.music1 = music1;
    this.music2 = music2;
  }

  public String playMusic(Genres genre) {
    String result = null;

    if (genre == Genres.CLASSICAL) {
      result = (String) music2.getSongs().get(new Random().nextInt(3));
    } else if (genre == Genres.ROCK) {
      result = (String) music1.getSongs().get(new Random().nextInt(3));
    }
    return "Playing: " + result;
  }

//  public String playMusic() {
//    return "Playing: " + music1.getSongs() + ", " + music2.getSongs();
//  }

}
