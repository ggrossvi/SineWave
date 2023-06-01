
/**
 * Write a description of class SineCalc here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class SineCalc
{
    // instance variables - replace the example below with your own
    

    /**
     * Constructor for objects of class SineCalc
     */
    public SineCalc(int numRectangles)
    {
        // initialise instance variables
        double sine = Math.PI/numRectangles;
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public double midpointSine(double sine )
    {
        double midpoint = sine/2;
        System.out.println(midpoint);
        return midpoint;
    }
}
