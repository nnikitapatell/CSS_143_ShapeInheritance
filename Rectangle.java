import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
/**
 * Write a description of class Hexagon here.
 *
 * @author Nikita Patel
 * @version 1
 */
public class Rectangle extends Shape{
    //instance variables
    private int length = 0;
    private int width = 0;
    private Color myColor = null;

    /**
     * Rectangle Constructor
     *
     * @param nx A parameter
     * @param ny A parameter
     * @param w A parameter
     * @param l A parameter
     * @param c A parameter
     */
    public Rectangle(int x, int y, int w, int l, Color c) {
        super(x, y); //use super constructor to set x and y
        //set the width, length and color
        setWidth(w); 
        setLength(l);
        setColor(c);
    }

    /**
     * Method setColor- mutator for color
     *
     * @param c A parameter
     */
    public void setColor(Color c){
        //myCOlor is set to c
        this.myColor = c;
    }

    /**
     * Method setLength- mutator for length
     *
     * @param l A parameter
     */
    public void setLength(int l){
        //length is set to l
        this.length = l;
    }

    /**
     * Method setWidth- mutator for width
     *
     * @param w A parameter
     */
    public void setWidth(int w){
        //width is set to w
        this.width = w;
    }

    /**
     * Method getLength- accessor for length
     *
     * @return The return value
     */
    public int getLength(){
        //return length
        return this.length;
    }

    /**
     * Method getWidth- accessor for width
     *
     * @return The return value
     */
    public int getWidth(){
        //return the width
        return this.width;
    }

    /**
     * Method getArea- This method should return a double corresponding to the area of the shape
     *
     * @return The return value
     */
    @Override
    public double getArea(){
        //return area of teh triangle
        return (this.width * this.length)/2;
    }
    
    /**
     * Method draw- draws teh shape
     *
     * @param g A parameter
     */
    @Override
    public void draw(Graphics g) {
        //casting
        Graphics2D g2d = (Graphics2D) g;
 
        //set color of object
        g2d.setColor(myColor); 
        //draw and fill object with set color using x, y, width, length
        g2d.fillRect(getX(), getY(), getWidth(), getLength()); 
        	
    }    
}