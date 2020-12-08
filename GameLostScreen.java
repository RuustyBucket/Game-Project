import lang.stride.*;
import java.util.*;
import greenfoot.*;

/**
 * 
 */
public class GameLostScreen extends World
{

    /**
     * Constructor for objects of class GameLostScreen.
     */
    public GameLostScreen()
    {
        super(1500, 800, 1);
        Greenfoot.playSound("YouLose.mp3");
    }

    public void act()
    {
       if (Greenfoot.isKeyDown("space"))
       {
          World StartScreen = new StartScreen();
          Greenfoot.setWorld(StartScreen);
       }
    }
}
