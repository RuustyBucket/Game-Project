import lang.stride.*;
import java.util.*;
import greenfoot.*;

/**
 *
 */
public class MyWorld extends World
{
    GreenfootSound backgroundMusic = new GreenfootSound("BackgroundMusic1.mp3");
    /**
     * Constructor for objects of class MyWorld.
     */
    public MyWorld()
    {
        super(1500, 800, 1);
        backgroundMusic.playLoop();
      

    }

}
