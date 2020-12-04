import lang.stride.*;
import java.util.*;
import greenfoot.*;

/**
 * 
 */
public class StartScreen extends World
{

    /**
     * Constructor for objects of class StartScreen.
     */
    public StartScreen()
    {
        super(1500, 800, 1);
    }
    public void act()
    {
        GreenfootImage image = new GreenfootImage("StartMenu.png");
        if (Greenfoot.isKeyDown("space"))
        {
            transitionToWorld(new MyWorld()); 

        }
        music = new GreenfootSound("StartMenu.wav");
        setMusic(music);
    }
}
