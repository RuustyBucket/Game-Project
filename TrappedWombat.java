import lang.stride.*;
import java.util.*;
import greenfoot.*;

/**
 * 
 */
public class TrappedWombat extends Simulation
{

    /**
     * When the Wombat touches the trapped wombat call the win screen
     */
    public void act()
    {
        if (isGameWon()) {
            ((MyWorld)getWorld()).backgroundMusic.stop();
            transitionToGameWin();
        }
    }

    /**
     * 
     */
    public boolean isGameWon()
    {
        World world = getWorld();
        if (isTouching(PlayableWombat.class)) {
            return true;
        }
        else {
            return false;
        }
    }

    /**
     * 
     */
    public void transitionToGameWin()
    {
        World WinScreen =  new  WinScreen();
        Greenfoot.setWorld(WinScreen);
    }
    
    public void stop()
    {
        
    }
}
