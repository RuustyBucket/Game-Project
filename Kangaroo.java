    import lang.stride.*;
    import java.util.*;
    import greenfoot.*;

    /**
     *
     */
public class Kangaroo extends Simulation
{
    private int ReloadTime;
    private int reloadDelay;
    private Vector acceleration;
    private int shotsFired;
    /**
     * Act - do whatever the Kangaroo wants to do. This method is called whenever the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() {
       if (Greenfoot.getRandomNumber(10) == 1) {
            setImage("Scaled Mafia Kangaroo95.png");
            int x = getX() - 7;
            int ny = getY();
            setLocation(x, ny);
        }
       if (Greenfoot.getRandomNumber(30) == 1) {
           turnRight();
           move(15);
       }
       if (Greenfoot.getRandomNumber(1) == 0) {
           fire();
        }
    }

    /* turn the kangaroo 180 also flips the image I dont know how to fix that*/


    public void turnRight() {
       GreenfootImage myImage =  new  GreenfootImage("flipmafiakangaroo95.png");
       setImage(myImage);
    }

    public void fire() {
        Bullet b = new Bullet(getMovement().copy(), getRotation());
        getWorld().addObject(b, getX(), getY());
        b.move();
    }
}
