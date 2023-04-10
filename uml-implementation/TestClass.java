package uml-implementation;

/**
 * Implementation on Tims Hortons class
 * @author Syed Fardeen
 */
public class TestClass {
    public static void main(String[] args) {
        TimsOrder t = TimsOrder.create();
        System.out.println(t + "\n");
        System.out.printf("Total Price: $%.2f\n", t.getAmountDue());
    }
}
