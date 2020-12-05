/**
 * Write a description of class Vector2D here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Vector2D  
{
    // instance variables - replace the example below with your own
    private double x;
    private double y;
    private int direct = 0;
    private double length;
    
    /**
     * Constructor for objects of class Vector2D
     */
    
    public Vector2D() {
    }
    
    public Vector2D(int direct, double length){
        this.length = length;
        this.direct = direct;
        x = length * Math.cos(Math.toRadians(direct));
        y = length * Math.sin(Math.toRadians(direct));
    }
   
    public void setDirection(int direction){
        this.direct = direct;
        x = length * Math.cos(Math.toRadians(direct));
        y = length * Math.sin(Math.toRadians(direct));
    }   
    
    public void add(Vector2D that) {
        x += that.x;
        y += that.y;
        this.direct = (int) Math.toDegrees(Math.atan2(y, x));
        this.length = Math.sqrt(x*x+y*y);
    }
    
    public double getX(){
        return x;
    }
    
    public double getY(){
        return y;
    }
    public double getLength() {
        return length;
    }
    
    public Vector2D copy() 
    {
        Vector2D copy = new Vector2D();
        copy.x = x;
        copy.y = y;
        copy.direct = direct;
        copy.length = length;
        return copy;
    }    
    
}   

