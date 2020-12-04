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
       
       if (Greenfoot.getRandomNumber(50) == 1) {
            setImage("Scaled Aussie Wombat Flipped111.png");
            int x = getX() - 7;
            int ny = getY();
            setLocation(x, ny);
        }
    
        if (Greenfoot.getRandomNumber(2) == 1) {
            Bullet bullet = new Bullet();
            SimulationWorld world = (SimulationWorld) getWorld();
            world.addObject(bullet, this.getX() + 62, this.getY() - 10);
            bullet.setRotation(90);
        }
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
            reloadDelay = 0;
        }
    }
}   