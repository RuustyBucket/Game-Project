import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.awt.*;
import java.awt.image.*;

/**
 * Write a description of class Simulation here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Simulation extends Actor
{
    protected Point2D position;
    protected Vector2D velocity;
    protected Vector2D acceleration;
    
    public SimulationActor(){
        this.position = null;
        this.velocity = new Vector2d(0.0,0.0);
    }
    
    
    public void act() 
    {
        // Add your action code here.
    }    
}
