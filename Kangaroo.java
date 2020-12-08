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
       if (Greenfoot.getRandomNumber(30) == 1) {
           moveForward();
       }
       if (Greenfoot.getRandomNumber(30) == 1) {
           turnRight();
           move(7);
       }
       if (Greenfoot.getRandomNumber(15) == 1) {
           fire();
       }
    }

    public void moveForward() {
       int x = getX(); 
       int y = getY(); 
       if (Greenfoot.getRandomNumber(10) == 1) {
            setImage("Scaled Mafia Kangaroo95.png");
            x -= 7;
            setLocation(x, y);
       }
       if (isTouching(Wall.class)) {
           turnRight();
           
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
