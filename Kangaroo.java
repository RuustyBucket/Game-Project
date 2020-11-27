// WARNING: This file is auto-generated and any changes to it will be overwritten
import lang.stride.*;
import java.util.*;
import greenfoot.*;

/**
 * 
 */
public class Kangaroo extends Actor
{

    /**
     * Act - do whatever the Kangaroo wants to do. This method is called whenever the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        move(2);
        if (Greenfoot.getRandomNumber(25) == 1) {
            turn(180);
            turnRight();
        }
    }

    /* turn the kangaroo 180 also flips the image I dont know how to fix that*/

    /**
     * To make the kangaroo look to the right
     */
    public void turnRight()
    {
        GreenfootImage myImage =  new GreenfootImage("flipmafiakangaroo.png");
        setImage(myImage);
    }
}
