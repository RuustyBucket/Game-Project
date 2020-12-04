import lang.stride.*;
import java.util.*;
import greenfoot.*;

/**
 * 
 */
public class PlayableWombat extends Actor
{

    /* WARNING: This file is auto-generated and any changes to it will be overwritten*/

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
            setImage("ScaledAussieWombatForWMovement.png");
            int x = getX();
            int ny = getY()-7;
            setLocation(x,ny);
        }
        if (Greenfoot.isKeyDown("a")) {
            setImage("ScaledAussieWombatFlipped2.png");
            int x = getX()-7;
            int ny = getY();
            setLocation(x,ny);
        }
        if (Greenfoot.isKeyDown("s")) {
            setImage("Scaled Aussie Wombat For D Movement.png");
            int x = getX();
            int ny = getY()+7;
            setLocation(x,ny);
        }
        if (Greenfoot.isKeyDown("d")) {
            setImage("ScaledAussieWombat.png");
            int x = getX()+7;
            int ny = getY();
            setLocation(x,ny);
        }
    }
}
