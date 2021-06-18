import java.awt.*;
/**
 * Write a description of class Shape here.
 *
 * @author Nikita Patel
 * @version 1
 * 
 * Class Shape
 *
 * By Rob Nash (with minor edits by Johnny Lin)
 * 
 * This is the superclass in a hierarchy of shapes that you have to construct
 */

//the superclass in our inheritance hierarchy
//all "common" features, functions and data should go here
//for example, all shapes in Java2D have a x,y that declares their position
//and many of the shapes exposed have a width and a height (but not all, so we didn't put width and height here)
//note that this class is mostly empty, as there is no algorithm generic enough to guess an arbitrary shape's area (future subclasses must override getArea() to provide something reasonable)
//also, the draw method is empty too, as we don't know what shape to draw here! (again, our subclasses will need to replace this method with one that actually draws things)

//create a class called Shape that extends object
class Shape extends Object {
    //instance variables
    private int x = 0;
    private int y = 0;

    /**
     * Shape Constructor- A constructor used to initialize the data members
     *
     * @param a A parameter
     * @param b A parameter
     */
    public Shape( int a, int b ) {
        this.x = a;
        this.y = b;
    }

    /**
     * Method getArea- Calculate the area of this shape
     *
     * @return The return value
     */
    public double getArea(){ 
        return -1; 
    }

    /**
     * Method draw- This method is called on each shape to draw itself
     *
     * @param g A parameter
     */
    public void draw( Graphics g ){
    }

    /**
     * Method getX- Accessor for x
     *
     * @return The return value
     */
    public int getX() { 
        return this.x;
    }

    /**
     * Method getY- Accessor for y
     *
     * @return The return value
     */
    public int getY() { 
        return this.y; 
    }

    /**
     * Method setX- Mutator for x
     *
     * @param value A parameter
     */
    public void setX(int value) { 
        this.x = value; 
    }

    /**
     * Method setY- Mutator for y
     *
     * @param value A parameter
     */
    public void setY(int value) { 
        this.y = value; 
    }
}

