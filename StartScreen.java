import lang.stride.*;
import java.util.*;
import greenfoot.*;

/**
 *
 */
public class StartScreen extends World {
  GreenfootSound music = new GreenfootSound("StartMenu.mp3");
  /**
  * Constructor for objects of class StartScreen.
  */
  public StartScreen() {
     super(1500, 800, 1);
     music.play();
     music.setVolume(50);
     act();
  }
  public void act() {
    if (Greenfoot.isKeyDown("space")) {
       music.stop();
       World MyWorld = new MyWorld();
       Greenfoot.setWorld(MyWorld);       
    }
  }
}
