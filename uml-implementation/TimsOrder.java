package uml-implementation;

import java.util.Scanner;

/**
 * Implementation of Assignment_7.TimsOrder class
 * @author Syed Fardeen
 */
public class TimsOrder {
    /** Size **/
    private int size;
    /** Name **/
    private String name;
    /** Order **/
    private TimsProduct[] order;

    /**
     * No argument constructor for Assignment_7.TimsOrder class
     */
    private TimsOrder() {
        System.out.println("Assignment_7.TimsOrder no-arg constructor.");
    }

    /**
     * Assignment_7.TimsOrder class constructor
     * @param size
     * @param name
     */
    private TimsOrder(int size, String name) {
        Scanner j = new Scanner(System.in);
        setSize(size);
        setName(name);
        this.order = new TimsProduct[size];
        System.out.println("Selected the corresponding number to the Tims product you want to order.");
        System.out.println("Assignment_7.Mug: 1");
        System.out.println("Gift Card: 2");
        System.out.println("Assignment_7.Donut: 3");
        System.out.println("Tea: 4");
        for (int i = 0; i < getOrder().length; i++) {
            System.out.print("Order number " + (i + 1) + " : ");
            int option = j.nextInt();
            if (option == 1) {
                Mug temp = Mug.create();
                getOrder()[i] = temp;
            } else if (option == 3) {
                Donut temp = Donut.create();
                getOrder()[i] = temp;
            }
        }
    }

    /**
     * Create method for Assignment_7.TimsOrder
     * @return
     */
    public static TimsOrder create() {
        Scanner i = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = i.next();
        System.out.print("Enter the number of products: ");
        int orders = i.nextInt();
        TimsOrder temp = new TimsOrder(orders, name);
        return temp;
    }

    /**
     * Method to get Size
     * @return
     */
    public int getSize() {
        return size;
    }

    /**
     * Method to set Size
     * @param size
     */
    public void setSize(int size) {
        this.size = size;
    }

    /**
     * Method to get Name
     * @return
     */
    public String getName() {
        return name;
    }

    /**
     * Method to set Name
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Method to get Orders
     * @return
     */
    public TimsProduct[] getOrder() {
        return order;
    }

    /**
     * Method to set Orders
     * @param order
     */
    public void setOrder(TimsProduct[] order) {
        this.order = order;
    }

    /**
     * Method to get Amount Due
     * @return
     */
    public double getAmountDue() {
        double total = 0.0;
        for (TimsProduct i: getOrder()) {
            total = total + i.getRetailPrice();
        }
        return total;
    }

    /**
     * Method for String output
     * @return
     */
    public String toString() {
        String output = "Order for " + getName();
        for (int i = 0; i < getSize(); i++ ) {
            output = output + "\n\nItem number " + (i + 1) + ": \n" + getOrder()[i].toString();
        }
        return output;
    }
}
