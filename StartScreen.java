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
    if (Greenfoot.isKeyDown("space"))
    {
<<<<<<< Updated upstream
       World MyWorld = new MyWorld();
       Greenfoot.setWorld(MyWorld);
=======
        GreenfootImage image = new GreenfootImage("StartMenu.png");
       
       
>>>>>>> Stashed changes
    }
  }
}

