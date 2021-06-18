
import java.util.*;
import javax.swing.*;
import java.awt.*;
import javax.swing.JFrame;
/**
 * Write a description of class PolyDemo here.
 *
 * @author (your name)
 * @author Nikita Patel
 * @version 1
 */

class PolyDemo extends JFrame {
    /**
     * PolyDemo Constructor
     *
     */
    public PolyDemo() {
        getContentPane().add( new PolyDemoPanel() );
        //just some windowing stuff that must happen for all Frames
        setSize( 1000,1000 );
        setVisible( true );
        setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
    }

    /**
     * Method main
     *
     * @param args A parameter
     */
    public static void main( String args[] ) {
        PolyDemo myApp = new PolyDemo();
    }

    //this is our first "inner" or internal class 
    //the purpose of this class is solely to support the JFrame class above, and I don't want it reused in arbitrary contexts, so by nesting this class here
    //I can indicate the intent a bit more clearly that this class "goes with" the class above it
    //In general, each class is a separate entity that should be contained in a separate file
    public class PolyDemoPanel extends JPanel {     
        Shape[] myShapes= new Shape[20];
        /**
         * PolyDemoPanel Constructor
         *
         */
        public PolyDemoPanel() {
            //Shape a = new Shape( getRandInt(), getRandInt());
            //Shape b = new Circle( getRandInt(), getRandInt(), getRandInt() );

            //a = new Square(getRandInt(), getRandInt(), getRandInt(), getRandInt() );

            //a = getRandShape();

            //( (Circle) b ).getRadius();

            /*********************************************************************************************************************
             * Code for populating our myShapes changes minimally when new classes are introduced (only in getRandShape())
             *********************************************************************************************************************/
            for( int i = 0; i < 20; i++ ) {
                myShapes[i] =  getRandShape();
            }
        }

        /*********************************************************************************************************************
         * Code for drawing our shapes doesn't change at all! Since we intended to take advantage of polymorphism, we coded 
         * this "in general" with respect to the superclass, and not specific to any subclass.
         *********************************************************************************************************************/
        public void paint( Graphics g ) {
            super.paint(g);  //don't remove - required for GUI widgets to draw correctly
            /************************
             * Late Binding Demo
             ************************/
            for( int i = 0; i < myShapes.length; i++ ){
                //which draw method is invoked here? There are many forms of the method (polymorphic), so which is chosen?
                //Java has RTTI about every object, and it uses this info to choose the correct method to invoke!
                myShapes[i].draw( g );  
            }   
        }

        /**
         * Method getRandInt
         *
         * @return The return value
         */
        public int getRandInt() {
            return ( (int) ( Math.random() * 200 ) );   
        }

        /**
         * Method getRandShape
         *
         * @return The return value
         */
        public Shape getRandShape() {
            Shape retVal = null;
            final int x = getRandInt();
            final int y = getRandInt();

            /********************************
             * Polymorphic extensibility demo
             *
             *******************************/
            switch( ( int )(Math.random() * 4) ) {
                case 0:      retVal = new Rectangle(getRandInt(), getRandInt(), getRandInt(), getRandInt(), Color.BLACK);
                break;
                case 1:     retVal = new Triangle(getRandInt(), getRandInt(), getRandInt(), Color.GREEN );
                break;
                case 2:     retVal = new Circle( x,y,getRandInt() );//new Circle( x,y,getRandInt() );////new Cylinder( x,y, getRandInt(), getRandInt() );
                break;
                case 3:     retVal = new Hexagon(getRandInt()/2, getRandInt()/2, getRandInt()/2, Color.RED);
                break;
                
            }

            return retVal;
        }
    }   
}