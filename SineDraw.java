import java.awt.Graphics;
import java.awt.Color;
import java.awt.Font;
/**
 * Write a description of class SineDraw here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class SineDraw {
    // instance variables - replace the example below with your own
    
    
    // put your code here
    
    
    /**
     * Constructor for objects of class SineDraw
     */
    
    public SineDraw(){
        
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    
    static void drawRectangles(int numRectangles) {
        int panelWidth = 628;
        int panelHeight = 200;
    //double width = 
        final Color myFavColor = new Color(255,13,255);
        DrawingPanel panel = new DrawingPanel(panelWidth, panelHeight);
        Graphics graphics = panel.getGraphics();
        graphics.setColor(myFavColor);
        graphics.setFont(new Font("Monospaced", Font.PLAIN, 12));
        //graphics.drawString("Testing custom drawing ...", 10, 20);
        
        int count = 0;
        double width = 0;
        double widthIncremented=0;
        double nextXIncrement=0;
        int widthGraphics=0;
        
        
        
        double valueX2 = 0;
        
        double midpoint = 0;
        double midpointX = 0;
        double midpointY = 0;
        
        int pointX = 0;
        int pointX2 = 0;
        
        
        double valueY2=0;
        
        double valueYRounded=0;
        double valueY2Rounded=0;
        
        int pointY=0;
        double pointY2=0;
        //int pointx = 0;
        int y = 0;
        int x = 0;
        double tempX = 0;
        double radianX=0;
        double radianY=0;
        double radianMidpoint=0;
        double radianWidth=0;
        double area=0;
        
        
        
        /*
        while (x < 90) {
            System.out.println("x: " + x);
            valueX = Math.toRadians(x); //double
            System.out.println("valueX: " + valueX);
            valueY=Math.sin(valueX)*200;
            System.out.println("valueY: " + valueY);
            graphics.drawLine((int)valueX,(int)valueY,(int)valueX,(int)valueY);
            x++;
            
        }
        */
       
       while (count<numRectangles){
           double valueX = 0;
           double valueY=0;
           int height=0; // sine of valueX, which is also the y coordinate
           double valueHeight;
           
           System.out.println("count: "+ count);
           width = SineCalc.calculateWidth(numRectangles);
           //System.out.println("width " +width);
           
           valueX = valueX + count*width;
           System.out.println("ValueX: "+ valueX);
           tempX = valueX + width;
           System.out.println("TempX: "+ tempX);
           midpoint = (valueX + tempX)/2;
           System.out.println("midpoint: "+ midpoint);
           valueHeight = SineCalc.calculateSine(midpoint); // valueY is height
           System.out.println("Height-Sine of Midpoint: "+ valueHeight);
           area += width * valueHeight;
           System.out.println("Area: "+ area);
           System.out.println();
           
           System.out.println("****Transform Values****");
           
           pointX = (int)SineCalc.cartesianXToGraphicsX(valueX,panelWidth,numRectangles);
           System.out.println("PointX: "+ pointX);
           height = (int)SineCalc.heightToYGraphics(height,panelHeight);           
           System.out.println("height: "+ height);
           pointY = (int)SineCalc.cartesianYToGraphicsY(valueHeight,panelHeight);

           System.out.println("pointY: "+ pointY);
           widthGraphics = (int)SineCalc.cartesianXToGraphicsX(width,panelWidth,numRectangles);
           System.out.println("WidthGraphics: "+ widthGraphics);
           System.out.println();
           System.out.println();
           graphics.drawRect(pointX,pointY,(int)(widthGraphics),panelHeight-pointY);
           graphics.drawString("Coordinate (" + pointX +","+ pointY + ")", pointX, pointY+10);
           graphics.drawString("Height: " + (panelHeight-pointY), pointX, pointY+20);
           
           count++;

           
           
           
           
           
       }
       
        
    }
    

    
    
}
