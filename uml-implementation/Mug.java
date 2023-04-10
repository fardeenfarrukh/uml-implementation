package uml-implementation;

import javafx.scene.paint.Color;
import java.util.Scanner;

/**
 * Implementation of Assignment_7.Mug class which extends Tims Product abstract class
 * @author Syed Fardeen
 */
public class Mug extends TimsProduct {
    /** Color **/
    private Color color;

    /**
     * No arguments constructor for Assignment_7.Mug class
     */
    private Mug () {
        System.out.println("Assignment_7.Mug no-arg constructor.");
    }

    /**
     * Constructor for Assignment_7.Mug class
     * @param name
     * @param cost
     * @param price
     * @param color
     */
    private Mug (String name, double cost, double price, Color color) {
        super.setName(name);
        super.setCost(cost);
        super.setPrice(price);
        this.setColor(color);
    }

    /**
     * Create method for Assignment_7.Mug class
     * @return
     */
    public static Mug create() {
        Scanner i = new Scanner(System.in);
        System.out.println("Enter the following pieces of information for a Assignment_7.Mug.");
        System.out.print("Name: ");
        String name = i.next();
        System.out.print("Enter the cost: ");
        double cost = i.nextDouble();
        System.out.print("Enter the price: ");
        double price = i.nextDouble();
        System.out.println("Enter integer 3 values for RGB (0 - 255).");
        System.out.print("R: ");
        int r = i.nextInt();
        System.out.print("G: ");
        int g = i.nextInt();
        System.out.print("B: ");
        int b = i.nextInt();
        Color rgbMug = Color.rgb(r, g, b);
        Mug temp = new Mug(name, cost, price, rgbMug);
        return temp;
    }

    /**
     * Method to get Color
     * @return
     */
    public Color getColor() {
        return color;
    }

    /**
     * Method to set color
     * @param color
     */
    public void setColor(Color color) {
        this.color = color;
    }

    /**
     * Method for String output
     * @return
     */
    public String toString() {
        return super.toString() + "\nColor: " + getColor();
    }
}
