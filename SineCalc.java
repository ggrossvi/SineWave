
/**
 * Write a description of class SineCalc here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class SineCalc {
 
    // instance variables - replace the example below with your own
    static double calculateWidth(int numRectangles) {
        // initialise instance variables
        //double width = Math.PI/numRectangles;
        double width = Math.PI/numRectangles;
        //System.out.println("Width: " + width);
        return width;
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    
    
    static double calculateHeight(double midpoint ) {
        double height = Math.sin(midpoint);
        System.out.println("Height: " + height);
        return height;
    }
    /*
    static double calculateXPoint(int multiplier, int numRectangles) {
        double xPoint = 0;
        xPoint = (multiplier*Math.PI)/numRectangles;
        return xPoint;
    }
    
    
    static double calculateDistance(double startingX,double width ) {
        double distance = startingX + width;  //fix add width
        System.out.println("Distance: " + distance);
        return distance;
    }
    
    */
    
    static double calculateY(double valueX) {
        double valueY = Math.sin(valueX); //fix add width
        System.out.println("EndValueY: " + valueY);
        return valueY;
    }
    
    static double calculateMidpoint(double point1,int numRectangles) {
        double width = (Math.PI)/numRectangles;
        double midpoint = (point1 + width)/2;
        System.out.println("Midpoint: " + midpoint);
        return midpoint;
    }
    
    static double calculateArea(double height,double width ) {
        double area = height * width;
        System.out.println("Area: " + area);
        return area;
    }
    
    static double cartesianXToGraphicsX(double XRadians,int panelWidth,int numRectangles) {
        //int transform = panelWidth/314;
        double valueXTransformed = XRadians * 200;
        System.out.println("valueXTransformed: " + valueXTransformed);
        //double GraphicsX = radians*(Math.PI)*100;
        //double GraphicsX = radians + panelHeight;
        return valueXTransformed;
    }
    
    static double cartesianYToGraphicsY(double YRadians, int panelHeight) {
        double transform = panelHeight/2 * YRadians;
        System.out.println("Transform: " + transform);
        double transformPointY = panelHeight - transform;
        System.out.println("TransformY: " + transformPointY);
        //double transformYBy2= transformY *2;
        //System.out.println("transformYBy2: " + transformYBy2);
        //double GraphicsY = radians + 2*Math.PI;
        //be sure to change 200 to a non magic number
        //double GraphicsY = radians * panelHeight;
        return transformPointY;
    }
    
    static double heightToYGraphics(double height, int panelHeight) {
        double pointY = 0 + height;
        return pointY; 
    }
    
    static double radiansToDecimal(double radians) {
        double value=(radians*180)/Math.PI;
        //double value = radians * 200; 
        
        return value;
    }

    
    static int roundToInt(double value) {
        int valueInt = (int)(Math.round((value * 100)/100));
        return valueInt;
    }
    
    static double calculateSine(double radian) {
        double Yvalue = Math.sin(radian);
        return Yvalue;
    }
    
    
}
