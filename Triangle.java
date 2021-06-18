import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
/**
 * Write a description of class YourClass here.
 *
 * @author Nikita Patel
 * @version 1
 */
public class Triangle extends Shape
{
    //instance vairables
    private int sideLength = 0;
    private Color triangleColor = null;
    
    /**
     * Triangle Constructor
     *
     * @param x A parameter
     * @param y A parameter
     * @param sL A parameter
     * @param tC A parameter
     */
    public Triangle(int x, int y, int sL, Color tC){
        // call a superclass constructor that takes 2 ints
        super(x,y);
        setSideLength(sL);
        setColor(tC);
    }
    
    /**
     * Method setSideLength- mutator method for side length
     *
     * @param sL A parameter
     */
    public void setSideLength(int sL){
        //set this.sideLength to sL input value
        this.sideLength = sL;
    }
    
    /**
     * Method getSideLength- accessor method for sidelength
     *
     * @return The return value
     */
    public int getSideLength(){
        //return this.sideLength
        return this.sideLength;
    }
    
    /**
     * Method setColor- set the color
     *
     * @param tC A parameter
     */
    public void setColor(Color tC){
        //set this.triangleColor to tC input value
        this.triangleColor = tC;
    }
   
    /**
     * Method getArea- This method should return a double corresponding to the area of the shape
     *
     * @return The return value
     */
    @Override
    public double getArea(){
        //return area of teh triangle
        return (this.sideLength * this.sideLength)/2;
    }
    
    /**
     * Method draw- draw the shape 
     *
     * @param drawing A parameter
     */
    @Override
    public void draw(Graphics drawing){
        //draw the shape
        //casting
        Graphics2D draw2D = (Graphics2D) drawing;
        int[] x = {getX(), (getX() + (getSideLength()/2)), getX() + getSideLength()};
        int[] y = {getY(), (getY() - getSideLength()), getY()};
        //set the color of the shape
        draw2D.setColor(triangleColor);
        draw2D.fillPolygon(x,y,3);
    }
}
