    import lang.stride.*;
    import java.util.*;
    import greenfoot.*;
    /**
     *
     */
public class Kangaroo extends Simulation
{
    /**
     * Act - do whatever the Kangaroo wants to do. This method is called whenever the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() {
       if (Greenfoot.getRandomNumber(100) == 40) {
           fire();
       }
       if (isTouching(Kangaroo.class)) {
            getWorld().removeObject(Kangaroo.this);
        }
    }
       
    /* turn the kangaroo 180 also flips the image I dont know how to fix that*/

    public void fire() {
        Bullet b = new Bullet(getMovement().copy(), getRotation());
        getWorld().addObject(b, getX(), getY());
        b.move();
    }
}
