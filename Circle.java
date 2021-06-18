import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
/**
 * Write a description of class Circle here.
 *
 * @author Nikita Patel 
 * @version 1
 */
//Build a new class called “Circle” using the inheritance keyword “extends”
public class Circle extends Shape
{
    //instance variable
    private int radius = 0;

    /**
     * Constructor for objects of class Circle
     */
    public Circle(int x, int y, int rad){
        //call a superclass constructor that takes 2 ints
        super(x,y);
        //set this.radius to rad inout
        this.radius = rad;
    }
    
    /**
     * Method getRadius- accessor for radius
     *
     * @return The return value
     */
    public double getRadius(){
        //return radius
        return radius;
    }
    
    /**
     * Method setRadius- mutator for radius
     *
     * @param rad A parameter
     */
    public void setRadius(int rad){
        //this.radius is set to the rad input
        this.radius = rad;
    }
    
    /**
     * Method getArea: This method should return a double corresponding to the area of the shape
     *
     * @return The return value
     */
    @Override//override the method from parent class
    public double getArea(){
        //return area
        return Math.PI * radius * radius;
    }
    
    /**
     * Method draw- draws the shape
     *
     * @param drawing A parameter
     */
    @Override //override the method from the parent class
    public void draw(Graphics drawing){
        //draw shape
        Graphics2D draw2D = (Graphics2D) drawing;
        //set color of shape
        drawing.setColor(Color.pink);
        //draw circle
        draw2D.drawOval(getX(),getY(), radius,radius);
    }
}
