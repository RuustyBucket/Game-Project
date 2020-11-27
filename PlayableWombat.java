// WARNING: This file is auto-generated and any changes to it will be overwritten
import lang.stride.*;
import java.util.*;
import greenfoot.*;

/**
 * 
 */
public class PlayableWombat extends Actor
{

    /**
     * Act - do whatever the PlayableWombat wants to do. This method is called whenever the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        move();
    }

    /**
     * To make the wombat moving
     */
    public void move()
    {
        if (Greenfoot.isKeyDown("w")) {
            move(7);
        }
        if (Greenfoot.isKeyDown("a")) {
            turn(-3);
        }
        if (Greenfoot.isKeyDown("s")) {
            move(-7);
        }
        if (Greenfoot.isKeyDown("d")) {
            turn(3);
        }
    }
}
