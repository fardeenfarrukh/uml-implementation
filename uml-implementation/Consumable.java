package uml-implementation;

/**
 * Implementation of Assignment_7.Consumable interface.
 * @author Syed Fardeen
 */
public interface Consumable {
    /**
     * Abstract method to return calorie count
     * @return
     */
    public abstract int getCalorieCount();

    /**
     * Abstract method to return consumption method
     * @return
     */
    public abstract String getConsumptionMethod();
}
