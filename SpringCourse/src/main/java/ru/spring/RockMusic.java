package ru.spring;

import java.util.ArrayList;
import org.springframework.stereotype.Component;

public class RockMusic implements Music {

  private static ArrayList<String> songList = new ArrayList<>();

  static {
    songList.add("Wind cries Mary");
    songList.add("Sweet dreams");
    songList.add("Christmas club");
  }


  public ArrayList<String> getSongs() {
    return songList;
  }
}
