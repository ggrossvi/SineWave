import java.lang.Math.*;
import java.util.Scanner;//import java.util.*;
import java.awt.*;
import java.util.InputMismatchException;

/**
 * Write a description of class SineUI here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class SineUI {
        
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        SineUI ui = new SineUI();
        
        int min=0;
        int max=3;
        
        int choice = -1;
        boolean isValidChoice = false;
        //System.out.println(scanner.getClass());
        
        while(choice!=0) {
            ui.drawMenu();
            
            verifyIntInput(scanner);
            choice = scanner.nextInt(); 

            if(!isValidChoice(choice, min, max)){
                System.out.println("The input is not within the range of 0 and 3. Enter a valid number!");
                System.out.println();
            }
            else {
                switch(choice){
                    case 0: 
                        System.out.println("Goodbye, come back again!");
                        break;
                    case 1:
                        //scanner.nextLine();
                        System.out.print("Enter radians: ");
                        
                        if (scanner.hasNextDouble()) {
                            double radians = scanner.nextDouble(); 
                            double answer = SineCalc.calculateY(radians);
                            //%f double specifier .4 is decimal precision
                            System.out.printf("The y value for specified radians %f is: %,.4f\n\n",radians,answer);
                            
                        }
                        else {
                                scanner.nextLine();
                                System.out.println();
                                System.out.println("Enter a double please.");
                        }
        
                        break;                                            
                    case 2: 
                        scanner.nextLine();
                        System.out.print("Enter the numbers of rectangles to use between 1 and 500: ");
                        if (scanner.hasNextDouble()){
                            int numRectangles = scanner.nextInt(); 
                            if(!isValidChoice(numRectangles,1,500)) {
                                System.out.println();
                                System.out.println("Enter a valid number between 1 and 500.");
                                continue;
                            }
                            SineDraw.drawRectangles(numRectangles,choice);
                        } 
                        break;
                    case 3: 
                        scanner.nextLine();
                        System.out.print("Enter the numbers of rectangles to use between 1 and 500: ");
                       
                        while (scanner.hasNextInt()){
                            int numRect = scanner.nextInt(); 
                            if(!isValidChoice(numRect,1,500)) {
                                System.out.println();
                                System.out.println("Enter a valid number between 1 and 500.");
                                continue;
                            }
                            SineDraw.drawRectangles(numRect,choice);
                            //continue;
                            break;
                        }
                        
                        break;
                
                }
            }
        }

        scanner.close();
    }
    /**
     *  Draws Menu
     *
     */
        public void drawMenu() {
            
            for(int count=0; count<45; count++) {
                System.out.print("-");
                
            }
            System.out.println();
            System.out.printf("%31s", "Sine Wave Menu\n");
            for(int count=0; count<45; count++) {
                System.out.print("-");
                
            }
            System.out.println();
            
            System.out.println ("1. Find y value for specified radians x \n" +
                                "2. Estimate area for 0 <= x <= PI \n" +
                                "3. Draw curve with the area estimation rectangles\n\n" +
                                "0 EXIT the program\n");
            System.out.print("Enter your choice:");
         
        }
    
    /**
     *  Method checks if the user value choice is valid.
     *
     * 
     * @param int choice, int min, int max
     * @returns boolean
     */
        
        private static boolean isValidChoice (int choice, int min, int max) {
            if (choice >= min && choice <=max){
                return true;
            }
            else {
                return false;
            }
        }
        
        private static boolean verifyIntInput(Scanner scanner){
            while (!scanner.hasNextInt()) {
                scanner.nextLine();
                System.out.println("Please enter a valid integer!");
                System.out.println("Enter your choice:");
            }
            return true;
        }

    }
