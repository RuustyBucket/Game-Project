// WARNING: This file is auto-generated and any changes to it will be overwritten
import lang.stride.*;
import java.util.*;
import greenfoot.*;

/**
 * 
 */
public class WinScreen extends World
{

    /**
     * Constructor for objects of class WinScreen.
     */
    public WinScreen()
    {
        super(1500, 800, 1);
        showWinningText("You Win!", 650, 400);
    }

    /**
     * Shows winning message
     */
    public void showWinningText(String message, int x, int y)
    {
        GreenfootImage bg = getBackground();
        Font font =  new Font(50);
        bg.setFont(font);
        bg.setColor(Color.WHITE);
        bg.drawString(message, x, y);
    }
}
