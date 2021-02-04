package ru.spring;

import java.util.ArrayList;
import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

public class ClassicalMusic implements Music {

  private static ArrayList<String> songList = new ArrayList<>();

  static {
    songList.add("Hungarian Rhapsody");
    songList.add("Wagner");
    songList.add("Bah");
  }

  @Override
  public ArrayList<String> getSongs() {
    return songList;
  }

  @PostConstruct
  public void doMyInit() {
    System.out.println("init");
  }

  @PreDestroy
  public void doMyDestroy() {
    System.out.println("destroy");
  }


}
