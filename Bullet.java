
import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Bullet here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Bullet extends Simulation
{
    private int life = 30;
    private int damage = 16;
    public Bullet() {
      
    }

    public Bullet(Vector2D speed, int rotation) {
        super(speed);
        setRotation(rotation);
        increaseSpeed(new Vector2D(rotation, 15));
        getImage().scale(20, 20);
        //Greenfoot.playSound("EnergyGun.wav");
    }

    public void act() {
        if (isGameLost()) {
            ((MyWorld)getWorld()).backgroundMusic.stop();
            transitionToGameLost();
        }                
        move();  
        border();
    }

    public boolean isGameLost() {
        World world = getWorld();
        if (isTouching(PlayableWombat.class)) {
            return true;
        }
        else {
            return false;
        }
    }

    public void transitionToGameLost() {
        World GameLostScreen =  new  GameLostScreen();
        Greenfoot.setWorld(GameLostScreen);
    }
    
    public void stop() {

    } 
    
    public void border() {
        if (isAtEdge()) {
            getWorld().removeObject(Bullet.this);
        }
    }
}
