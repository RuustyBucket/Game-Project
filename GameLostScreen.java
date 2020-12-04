import lang.stride.*;
import java.util.*;
import greenfoot.*;

/**
 * 
 */
public class GameLostScreen extends World
{

    /**
     * Constructor for objects of class GameLostScreen.
     */
    public GameLostScreen()
    {
        super(1500, 800, 1);
        showLosingScreen("You Lose!", 740, 400);
    }

    /**
     * Show the losing screen
     */
    public void showLosingScreen(String message, int x, int y)
    {
        GreenfootImage bg = getBackground();
        Font font =  new Font(50);
        bg.setFont(font);
        bg.setColor(Color.WHITE);
        bg.drawString(message, x, y);
    }
}
