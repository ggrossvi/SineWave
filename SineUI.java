import java.lang.Math.*;
import java.util.Scanner;//import java.util.*;
import java.awt.*;

/**
 * Write a description of class SineUI here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class SineUI
{
    // instance variables - replace the example below with your own
    
    static int numRectangles = 5;
    static int panelWidth = 628;
    static int panelHeight = 200;
    //double width = 
    final static Color myFavColor = new Color(255,13,255);

    
    public static void main(String[] args) {
        DrawingPanel panel = new DrawingPanel(panelWidth, panelHeight);
        Graphics graphics = panel.getGraphics();
        graphics.setColor(myFavColor);
        SineDraw.drawRectangles(graphics);
    }
    
    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public int sampleMethod(int y)
    {
        int number = y;
        return number;
    }
}
