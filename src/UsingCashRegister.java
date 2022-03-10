/**
 * Using Cash Register Class and Testing
 * 3.9 Cash Register Class Review Assignment, Myo Aung
 */
// Cash Register Program Outlines
/**
 * Create THREE cash registers to test out the functions
 * First cash register test how the program would respond when the count or register total is below limit
 * All Cash Register value should result the Grand Total.
 * clear() function would set all the count and each cash register to ZERO.
 */
public class UsingCashRegister {
    public static void main(String[] args) {
        System.out.println("\nCash Register c1:");
        CashRegister c1 = new CashRegister();
        c1.addItem(25.00);              // add item "itemCount+1"
        c1.addItem(45.00);              // add item "itemCount+1"
        c1.addItem(30.00);              // add item "itemCount+1"
        c1.removeItem(90.00);            // remove item "itemCount-1"
        c1.removeItem(5.00);            // remove item "itemCount-1"... total item count 1
        //c1.removeItem(90.00);            // remove item "itemCount-1"... total item count 1
        c1.removeItem(5.00);            // remove item "itemCount-1"... total item count 1
        System.out.println("The item count for c1 is: " + c1.getItemCount());
        System.out.println("The Cash Register Total: " + "$" + String.format("%.2f", c1.getCashRegisterTotal()));
        System.out.println();

        // Create another cash register c2
        System.out.println("Cash Register c2:");
        CashRegister c2 = new CashRegister();
        c2.addItem(30.00);              // add item "itemCount+1"
        c2.addItem(40.00);              // add item "itemCount+1"
        c2.addItem(30);                 // add item "itemCount+1"
        c2.removeItem(50);              // remove item "itemCount-1" .... total item count 2
        System.out.println("The item count for c2 is: " +  c2.getItemCount());
        System.out.println("The Cash Register Total " + "$" + String.format("%.2f", c2.getCashRegisterTotal()));
        System.out.println();

        // Create another cash register c3
        System.out.println("Cash Register c3:");
        CashRegister c3 = new CashRegister();
        c3.addItem(33.33);              // add item itemCount+1
        c3.addItem(33.33);              // add item itemCount+1
        c3.addItem(33.33);              // add item itemCount+1
        c3.addItem(0.01);               // add item itemCount+1
        c3.addItem(40.20);              // add item itemCount+1
        c3.removeItem(40.20);           // remove itemCount-1...... total item count 4
        System.out.println("The item count for c3 is: " + c3.getItemCount());
        System.out.println("The Cash Register c3 Total " + "$" + String.format("%.2f", c3.getCashRegisterTotal()));// Format for 2 decimal points

        System.out.println();
        // Use implementation of 'static'
        System.out.println("ALL CASH REGISTER TOTAL " + "$" + String.format("%.2f", CashRegister.getAllCashRegisterTotals()));
        System.out.println();

        // Finally, clear out all THREE registers at the end of the day.
        System.out.println("........Run End of the Day.......");
        System.out.println("\nCash Register c1:");
        c1.clear();
        System.out.println("The item count for c1 is: " + c1.getItemCount());
        System.out.println("The Cash Register Total: " + "$" + String.format("%.2f", c1.getCashRegisterTotal()));
        System.out.println("\nCash Register c2:");
        c2.clear();
        System.out.println("The item count for c2 is: " + c2.getItemCount());
        System.out.println("The Cash Register Total: " + "$" + String.format("%.2f", c2.getCashRegisterTotal()));
        System.out.println("\nCash Register c3:");
        c3.clear();
        System.out.println("The item count for c3 is: " + c3.getItemCount());
        System.out.println("The Cash Register Total: " + "$" + String.format("%.2f", c3.getCashRegisterTotal()));

        System.out.println();
        System.out.println("ALL CASH REGISTER TOTAL " + "$" + String.format("%.2f", CashRegister.getAllCashRegisterTotals()));

    }
}
