import lang.stride.*;
import java.util.*;
import greenfoot.*;

/**
 * 
 */
public class StartScreen extends World
{
  GreenfootSound music = new GreenfootSound("StartMenu.wav");
  /**
  * Constructor for objects of class StartScreen.
  */
  public StartScreen()
  {
     super(1500, 800, 1);
     music.playLoop();
     act();
  }
  public void act()
  {
    if (Greenfoot.isKeyDown("space")){   
        World MyWorld = new MyWorld();
        Greenfoot.setWorld(MyWorld);
        music.stop();
    }
  }
}

