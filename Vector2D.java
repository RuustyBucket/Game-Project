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
    public Vector2D(double x, double y)
    {
        this.x = x;
        this.y = y;
    }
    
    public Vector2D() {
    }
    
    public Vector2D(int direct, double length){
        this.length = length;
        this.direct = direct;
    }
    
    public Vector2D(Vector2D other)
    {
        this.x = other.x;
        this.y = other.y;
    }
    
    public double getX(){
        return x;
    }
    
    public double getY(){
        return y;
    }
    
    public void setX(double val){
        x = val;
    }
    
    public void setY(double yVal){
        y = yVal;
    }
    
    public void negate() {
        x = -x;
        y = -y;
    }
    
    public double magnitude() {
        return Math.sqrt(dot(this, this));
    }
    
    public static double dot(Vector2D v1, Vector2D v2) {
        return v1.x * v2.x + v1.y * v2.y;
    }
    
    public void normalize() {
        double m = magnitude();
        x /= m;
        y /= m;
    }
    
     public static Vector2D add(Vector2D v1, Vector2D v2) {
        return new Vector2D(v1.x + v2.x, v1.y + v2.y);
    }
    
    public static Vector2D substract(Vector2D v1, Vector2D v2)
    {
        return new Vector2D(v1.getX() - v2.getX(), v1.getY() - v2.getY());
    }
    
    public static Vector2D substract(Point2D p1, Point2D p2)
    {
        return new Vector2D(p1.getX() - p2.getX(), p1.getY() - p2.getY());
    }
    
    public static Vector2D multiply(Vector2D v, double val)
    {
        return new Vector2D(v.x * val, v.y*val);
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

