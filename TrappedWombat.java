import lang.stride.*;
import java.util.*;
import greenfoot.*;

/**
 * 
 */
public class TrappedWombat extends Actor
{

    /**
     * When the Wombat touches the trapped wombat call the win screen
     */
    public void act()
    {
        if (isGameWon()) {
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
}
