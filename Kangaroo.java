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
    public void act()
    {
        move(7);
        if (Greenfoot.getRandomNumber(50) == 1) {
            turn(180);
            setImage("flipmafiakangaroo110.png");
        }
        else if(Greenfoot.getRandomNumber(50) == 1) {
               turn(-180);
               
        }
    
        if (Greenfoot.getRandomNumber(2) == 1) {
           fire();
        }
    }
    
    public Kangaroo() { 
        ReloadTime = 20;
    }
    
    public int getShotsFired() {
        return shotsFired;
    }
    
    public void setGunReloadTime(int reloadTime) {
        this.ReloadTime = reloadTime;
    }
    
    /* turn the kangaroo 180 also flips the image I dont know how to fix that*/

    
    public void turnRight()
    {
        GreenfootImage myImage =  new  GreenfootImage("flipmafiakangaroo110.png");
        setImage(myImage);
    }
    
    public void fire() {
        if (reloadDelay >= ReloadTime) {
            Bullet b = new Bullet(getMovement().copy(), getRotation());
            getWorld().addObject(b, getX(), getY());
            b.move();
            shotsFired++;
        }
    }
}   