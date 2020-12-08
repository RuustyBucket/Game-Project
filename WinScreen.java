// WARNING: This file is auto-generated and any changes to it will be overwritten
import lang.stride.*;
import java.util.*;
import greenfoot.*;

/**
 * 
 */
public class WinScreen extends World
{
    /**
     * Constructor for objects of class WinScreen.
     */
    public WinScreen()
    {
        super(1500, 800, 1);
        Greenfoot.playSound("YouWon.mp3");
    }
    
    public void act() {
       if (Greenfoot.isKeyDown("space")) {
           World StartScreen = new StartScreen();
           Greenfoot.setWorld(StartScreen);
           stop();
       } 
    }
    
    public void stop() {
    
    }
}
