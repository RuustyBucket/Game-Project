import greenfoot.*; 
public abstract class Simulation extends Actor
{
    private Vector2D movement = new Vector2D(0,0);
    
    private double x = 0;
    private double y = 0;
    
    public Simulation() {
    }
    
    
    public Simulation(Vector2D speed) {
        movement = speed;
    }
    
    public void move() {
        x = x + movement.getX();
        y = y + movement.getY();
        if(x >= getWorld().getWidth()) {
            x = 0;
        }
        if(x < 0) {
            x = getWorld().getWidth() - 1;
        }
        if(y >= getWorld().getHeight()) {
            y = 0;
        }
        if(y < 0) {
            y = getWorld().getHeight() - 1;
        }
        setLocation(x, y);
    }
    
    public void setLocation(double x, double y) {
        this.x = x;
        this.y = y;
        super.setLocation((int) x, (int) y);
    }
    
    public void setLocation(int x, int y) {
        setLocation((double) x, (double) y);
    }

    public void increaseSpeed(Vector2D s) {
        movement.add(s,s);
    }
    
    public Vector2D getMovement() {
        return movement;
    }
}
