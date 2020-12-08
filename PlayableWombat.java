import lang.stride.*;
import java.util.*;
import greenfoot.*;

/**
 *
 */
public class PlayableWombat extends Simulation
{

    /* WARNING: This file is auto-generated and any changes to it will be overwritten*/

    /**
     * Act - do whatever the PlayableWombat wants to do. This method is called whenever the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() {
        move();
        if ("space".equals(Greenfoot.getKey())) {
            fire();
        }
    }

    /**
     * To make the wombat move
     */
    public void move() {
       int x = 0;
       int y = 0;
       if (Greenfoot.isKeyDown("w")) {
            setImage("ScaledAussieWombatForWMovement85.png");
            y -= 7;
       }
       if (Greenfoot.isKeyDown("a")) {
            setImage("Scaled Aussie Wombat Flipped85.png");
            x -= 7;
       }
       if (Greenfoot.isKeyDown("s")) {
            setImage("Scaled Aussie Wombat For D Movement85.png");
            y += 7;
       }
       if (Greenfoot.isKeyDown("d")) {
            setImage("ScaledAussieWombat85.png");
            x += 7;
       }
       setLocation(getX() + x, getY() + y);

       if (isTouching(Wall.class)) {
           setLocation(getX() - x, getY() - y);
       }
    }

    public void fire() {
        Fireball fireball = new Fireball();
        getWorld().addObject(fireball, getX(), getY());
    }
}
