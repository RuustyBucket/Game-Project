
import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Bullet here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Bullet extends Simulation
{
    private int life = 1;

    private int damage = 1;
    
    public Bullet() {
    }
     public Bullet(Vector2D speed, int rotation)
    {
        super(speed);
        setRotation(rotation);
        increaseSpeed(new Vector2D(rotation, 15));
        //Greenfoot.playSound("EnergyGun.wav");
    }    
        
    public void act() {
        
        if(life <= 0) {
            getWorld().removeObject(this);
        } 
        else {
            move();
            PlayableWombat kang = (PlayableWombat) getOneIntersectingObject(PlayableWombat.class);
            if (kang != null) {
                getWorld().removeObject(this);
            }
            else {
                life--;
            }
        }
    }
}
