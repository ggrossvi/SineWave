
/**
 * Write a description of class SineCalc here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class SineCalc {
 
    static double calculateWidth(int numRectangles) {
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
        //System.out.println("Height: " + height);
        return height;
    }
    
    static double calculateY(double valueX) {
        double valueY = Math.sin(valueX); 
        return valueY;
    }
    
    static double calculateMidpoint(double point1,int numRectangles) {
        double width = (Math.PI)/numRectangles;
        double midpoint = (point1 + width)/2;
        //System.out.println("Midpoint: " + midpoint);
        return midpoint;
    }
    
    static double calculateArea(double height,double width ) {
        double area = height * width;
        //System.out.println("Area: " + area);
        return area;
    }
    
    static double cartesianXToGraphicsX(double XRadians,int panelWidth,int numRectangles) {   
        double valueXTransformed = XRadians * 200;
        //System.out.println("valueXTransformed: " + valueXTransformed);
        return valueXTransformed;
    }
    
    static double cartesianYToGraphicsY(double sineMidpointRadians, int panelHeight) {
        double transform = panelHeight * sineMidpointRadians;
        //System.out.println("Transform: " + transform);
        double transformPointY = panelHeight - transform;
        //System.out.println("TransformY: " + transformPointY);
        return transformPointY;
    }
    
    static double heightToYGraphics(double height, int panelHeight) {
        double pointY = panelHeight-(panelHeight
        -height);
        return pointY; 
    }
    
    static double radiansToDecimal(double radians) {
        double value=(radians*180)/Math.PI;
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
    
    static double calculateYWithX(double radian) {
        double Yvalue = Math.pow(radian,3);
        return Yvalue;
    }
    
    
    
}
