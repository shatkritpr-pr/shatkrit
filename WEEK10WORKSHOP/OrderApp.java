package WEEK10WORKSHOP;


/**
 * Write a description of class OrderApp here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public  class OrderApp {
    public static void main(String[] args) {
        NormalOrder normal = new NormalOrder(101, "Alice", 1500);
        PremiumOrder premium = new PremiumOrder(102, "Bob", 2000);

        System.out.println("Normal Order Invoice");
        System.out.println(normal);
        System.out.println("Final Amount: " + normal.calculateFinalAmount());
        System.out.println("Final Amount with Discount: " + normal.calculateFinalAmount(100));

        System.out.println(" Premium Order Invoice ");
        System.out.println(premium);
        System.out.println("Final Amount: " + premium.calculateFinalAmount());
        System.out.println("Final Amount with Discount: " + premium.calculateFinalAmount(200));
    }
}
    