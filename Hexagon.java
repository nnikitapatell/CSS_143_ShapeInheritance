import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
/**
 * Write a description of class Hexagon here.
 *
 * @author Nikita Patel
 * @version 1
 */
//create a class called hexagon that extends to shape class
public class Hexagon extends Shape{
    //instance variables for the Hexagon class
    private int sideLength = 0;
    private Color hexagonColor = null;
    
    /**
     * Triangle Constructor
     *
     * @param x A parameter
     * @param y A parameter
     * @param sL A parameter
     * @param tC A parameter
     */
    public Hexagon(int x, int y, int theSideLength, Color hexagonColor){
        // call a superclass constructor that takes 2 ints
        super(x,y);
        //set side length
        setSideLength(theSideLength);
        //set the color of the hexagon
        setColor(hexagonColor);
    }
    
    /**
     * Method setSideLength- mutator method for sidelength
     *
     * @param sL A parameter
     */
    public void setSideLength(int sideLength){
        //set this.sideLength to sL
        this.sideLength = sideLength;
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
     * Method setColor- mutator method for color
     *
     * @param tC A parameter
     */
    public void setColor(Color hexagonColor){
        //set this.triangleColor to tC
        this.hexagonColor = hexagonColor;
    }
    
    /**
     * Method getArea- This method should return a double corresponding to the area of the shape
     *
     * @return The return value
     */
    @Override
    public double getArea(){
        //return area
        return (this.sideLength * this.sideLength)/2;
    }
    
    /**
     * Method draw- draws the shape
     *
     * @param drawing A parameter
     */
    @Override
    public void draw(Graphics drawing){
        //set draw2D to drawing 
        Graphics2D draw2D = (Graphics2D) drawing;
        
        //create an array for x-values for hexagon
        int[] xValues = {getX(), 
            getX() + getSideLength(),
            getX() + getSideLength() + (getSideLength()/2), 
            getX() + getSideLength(),
            getX(),
            getX() - (getSideLength()/2)};
        //create an array for y-values for hexagon
        int[] yValues = {getY(), 
            getY(),
            getY() + getSideLength(),
            (getY() + (getSideLength() * 2)),
            (getY() + (getSideLength() * 2)), 
            getY() + getSideLength()};
        
        //set the color color of the hexagon shape
        draw2D.setColor(hexagonColor);
        
        //draw a 6 sided polygon
        draw2D.fillPolygon(xValues,yValues,6);
    }
}