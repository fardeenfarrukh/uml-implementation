package uml-implementation;

/**
 * Implementation of Assignment_7.TimsProduct abstract class which implements Assignment_7.Commodity interface
 * @author Syed Fardeen
 */
public abstract class TimsProduct implements Commodity {
    /** Name **/
    private String name;
    /** Cost **/
    private double cost;
    /** Price **/
    private double price;

    /**
     * No argument constructor of Assignment_7.TimsProduct
     */
    public TimsProduct() {
        System.out.println("\n");
    }

    /**
     * Constructor for Assignment_7.TimsProduct
     * @param name
     * @param cost
     * @param price
     */
    public TimsProduct(String name, double cost, double price) {
        this.name = name;
        this.cost = cost;
        this.price = price;
    }

    /**
     * Method to get name
     * @return
     */
    public String getName() {
        return name;
    }

    /**
     * Method to set name
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Method to get production cost
     * @return
     */
    public double getProductionCost() {
        return cost;
    }

    /**
     * Method to set production cost
     * @param cost
     */
    public void setCost(double cost) {
        this.cost = cost;
    }

    /**
     * Method to get retail price
     * @return
     */
    public double getRetailPrice() {
        return price;
    }

    /**
     * Method to set retail price
     * @param price
     */
    public void setPrice(double price) {
        this.price = price;
    }

    /**
     * Method to return String output
     * @return
     */
    public String toString() {
        return "Name: " + getName() + "\nCost: " + getProductionCost() + "\nPrice: " + getRetailPrice();
    }
}
