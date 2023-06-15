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
    static final int PANEL_WIDTH = 628;
    static final int PANEL_HEIGHT = 200;
    
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
    
    static void drawRectangles(int numRectangles, int choice) {
        
        final Color myFavColor = new Color(255,13,255);
        DrawingPanel panel = new DrawingPanel(PANEL_WIDTH, PANEL_HEIGHT);
        Graphics graphics = panel.getGraphics();
        graphics.setColor(myFavColor);
        graphics.setFont(new Font("Monospaced", Font.PLAIN, 12));
        
        
        int count = 0;
        double width = SineCalc.calculateWidth(numRectangles);
        double area=0;
        int lineOffset = 10;
        
        while (count<numRectangles){
           double valueX = count*width;
           //int height=0; // sine of valueX, which is also the y coordinate
           //System.out.println("count: "+ count);
           //System.out.println("ValueX: "+ valueX);
           double tempX = valueX + width;
           //System.out.println("TempX: "+ tempX);
           double midpoint = (valueX + tempX)/2;
           //System.out.println("midpoint: "+ midpoint);
           double valueHeight = SineCalc.calculateSine(midpoint); // valueY is height
           //System.out.println("Height-Sine of Midpoint: "+ valueHeight);
           
           area += width * valueHeight;
           //System.out.println("Area: "+ area);
           //System.out.println();
           
           //System.out.println("****Transform Values****");
           
           
           if(choice == 3) {
               int pointX = (int)SineCalc.cartesianXToGraphicsX(valueX,PANEL_WIDTH,numRectangles);
               //System.out.println("PointX: "+ pointX);
               //int height = (int)SineCalc.heightToYGraphics(0,PANEL_HEIGHT);           
               //System.out.println("height: "+ height);
               int pointY = (int)SineCalc.cartesianYToGraphicsY(valueHeight,PANEL_HEIGHT);
    
               //System.out.println("pointY: "+ pointY);
               int widthGraphics = (int)SineCalc.cartesianXToGraphicsX(width,PANEL_WIDTH,numRectangles);
               //System.out.println("WidthGraphics: "+ widthGraphics);
               //System.out.println();
               //System.out.println();
               graphics.drawRect(pointX,pointY,(int)(widthGraphics),PANEL_HEIGHT-pointY);
               
               if (numRectangles <= 5) {
                graphics.drawString("Coordinate (" + pointX +","+ pointY + ")", pointX, pointY + lineOffset);
                graphics.drawString("Height: " + (PANEL_HEIGHT-pointY), pointX, pointY + (2*lineOffset)); 
               }
           }
           count++;   
       }
       System.out.println();
       if(choice == 2) {
           System.out.println("Estimated area is: " + area);
           System.out.println();
       }
       
       // sine wave
       if (choice == 3) {
           for (int xPanel = 0; xPanel < PANEL_WIDTH; xPanel++) {
               double xCartesian = xPanel*(Math.PI/PANEL_WIDTH);
               double yCartesian = (SineCalc.calculateY(xCartesian));
               int yCoordinate =  (int)(SineCalc.cartesianYToGraphicsY(yCartesian,PANEL_HEIGHT));
               int xCoordinate = xPanel;
               graphics.setColor(Color.BLUE);
               graphics.drawLine(xCoordinate,yCoordinate,xCoordinate,yCoordinate);
           }      
       }
       
    }  
}
