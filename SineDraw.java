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
           height = (int)SineCalc.cartesianYToGraphicsY(valueHeight,panelHeight);
           System.out.println("height: "+ height);
           pointY = (int)SineCalc.heightToYGraphics(height,panelHeight);
           System.out.println("pointY: "+ pointY);
           widthGraphics = (int)SineCalc.cartesianXToGraphicsX(width,panelWidth,numRectangles);
           System.out.println("WidthGraphics: "+ widthGraphics);
           System.out.println();
           System.out.println();
           graphics.drawRect(pointX,pointY,(int)(widthGraphics),height);
           graphics.drawString("Coordinate (" + pointX +","+ pointY + ")", pointX, pointY+10);
           graphics.drawString("Height: " + height, pointX, pointY+20);
           
           count++;
           //int height=0;
           /*
           System.out.println("count" +count);
           width = SineCalc.calculateWidth(numRectangles);
           System.out.println("width " +width);
           widthIncremented = count*width;
           System.out.println("widthIncremented " +widthIncremented);
           valueX = valueX + widthIncremented;
           System.out.println("valueX:"+ valueX);
           count++;
           
           tempX = valueX + SineCalc.calculateWidth(numRectangles);
           System.out.println("TempX: "+ tempX);
           // run through calc function when working 
           midpoint=(valueX+tempX)/2.0;
           System.out.println("Midpoint:"+ midpoint);
           //midpointX = midpoint;
           heightAndY = Math.sin(midpoint);
           System.out.println("heightAndY-Sin:"+ heightAndY);
           */
          
         
           
           /*
           radianX = SineCalc.radiansToDecimal(valueX);
           System.out.println("radianX:"+ radianX);
           
           radianY = SineCalc.radiansToDecimal(heightAndY);
           System.out.println("radianY:"+ radianY);

           radianWidth = SineCalc.radiansToDecimal(width);
           System.out.println("radianWidth:"+ radianWidth);
           
           radianMidpoint = SineCalc.radiansToDecimal(midpoint);
           System.out.println("radianMidpoint:"+ radianMidpoint);
           
           area =+ heightAndY * width;
           System.out.println("Area:"+ area);
           
           valueY = SineCalc.cartesianYToGraphicsY(radianY,panelHeight);
           System.out.println("valueY:"+ valueY);
           pointY = (int)valueY;
           height = pointY;
           System.out.println("pointY:"+ pointY);
           
           double valueXTransformed = SineCalc.cartesianXToGraphicsX(radianX,panelWidth);
           System.out.println("valueXTransformed:"+ valueXTransformed);
           pointX = (int)valueXTransformed;
           System.out.println("pointX:"+ pointX);
           //pointY = (int)pointY;
           //System.out.println("pointY:"+ pointY);
            
           System.out.println("width:"+ (int)radianWidth);
           
           // when i multiplied by width it did fix the width
           graphics.drawRect(pointX,pointY,(int)(radianWidth),height);
           System.out.println();
           */
           
           
           
           
           
       }
       /*
       double xRadian =0;
       while (xRadian<panelWidth){
           
       }
    */
        /*
        
        while ( count < numRectangles) {
            System.out.println("count: " + count);
            width = (SineCalc.calculateWidth(numRectangles));
            System.out.println("width: " + width);
            // width
            nextXIncrement = count*width;
            System.out.println("nextXIncrement: " + nextXIncrement);
            // X Value
            System.out.println();
            valueX = valueX+nextXIncrement;
            //pointX = SineCalc.radiansToDecimal(pointX + nextXIncrement);
            System.out.println("valueX: " + valueX);
            
            //midpoint = SineCalc.calculateMidpoint(pointX,numRectangles);
            //pointY = (int)Math.sin(midpoint);
            //pointY = Math.sin(pointX);
            valueY = Math.sin(valueX);
            System.out.println("valueY - sine X): " + valueY);
            valueYRounded = Math.round((valueY*100)/100);
            System.out.println("valueY -rounded: " + valueY);
            pointY = valueYRounded;
            //pointY = SineCalc.cartesianYToGraphicsY(valueYRounded);
            System.out.println("pointY -cartesian to graphic y: " + pointY + "\n");
            
            
            //nextXIncrement2 = count*width;
            //System.out.println("nextXIncrement2: " + nextXIncrement2);
            valueX2 = valueX + nextXIncrement;
            System.out.println("valueX2: " + valueX2);
            valueY2 = Math.sin(valueX2);
            System.out.println("valueY2: " + valueY2);
            valueYRounded = Math.round((valueY2*100)/100);
            pointY2 = valueY2Rounded;
            //pointY2 = SineCalc.cartesianYToGraphicsY(valueY2Rounded);
            count++;
            //pointY2 = SineCalc.cartesianYToGraphicsY(valueY2);
            
            //midpoint = SineCalc.calculateMidpoint(pointX2,numRectangles);
            
            //pointY2 =(int)Math.Round((SineCalc.radiansToDecimal(Math.sin(midpoint))*100);
            //System.out.println("PointY2: " + pointY2);
            
            
            //find out Y
            graphics.drawLine((int)Math.round((pointX*100)/100),(int)pointY,(int)Math.round((pointX*100)/100),(int)pointY;
            System.out.println();
            
            
        }
        
        //int startingXRounded=0;
        //int endingX = startingX + width; 
        //double height = calculateHeight(double midpoint);
        //int heightRounded = int(height);
        
        //width
        // height
        //distance
        // midpoint
        // starting point to endpoint
        
        /*
        for(int countRectangles=0; countRectangles <= numRectangles; countRectangles++) {
            //int transform = countRectangles * (panelWidth/numRectangles);
            
            int point1 = 0;
            System.out.println("point1" + point1);
            int point2 = 0;
            System.out.println("point2" + point1);
            point1 = (int)(startingX); 
            System.out.println("point1" + point1);
            
            int tempX = (int)(startingX + width);
            System.out.println("tempX" + tempX);
            double midpoint = 0;
        
            midpoint = (point1 + point2)/2;
            System.out.println("midpoint" + midpoint);
            
            double midpointRad = Math.toRadians(midpoint);
            
            //double distance = SineCalc.calculateDistance(startingX,width);
            //int intX = (int)((startingX + distance)/2);
            int height=(int)(Math.sin((midpointRad))); 
            //System.out.printf("%f",intX);
            System.out.printf("%f",height);
            
            
            graphics.drawRect(point1,100,width,height);  // x,y,width,height
            startingX = point2; 
            
        }
        */
       
        
    }
    

    
    
}
