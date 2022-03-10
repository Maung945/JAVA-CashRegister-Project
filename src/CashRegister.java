import java.sql.SQLOutput;

/**
 * Cash register class implementation
 * 3.9 Cash Register Class Review Assignment, Myo Aung
 */

public class CashRegister {
    private int itemCount = 0;
    private double cashRegisterTotal = 0;
    private static double allCashRegisterTotals  = 0;

    // Constructor
    public CashRegister() {
        itemCount = 0;
        cashRegisterTotal = 0;}

    public int getItemCount() {
        this.itemCount = itemCount;
        return itemCount;
    }

    public void addItem(double n) {
        itemCount++;
        cashRegisterTotal = cashRegisterTotal + n;
        allCashRegisterTotals = allCashRegisterTotals + n;
    }
    // setter
    public void removeItem(double n) {
        /* Set the conditions for the removal */
       if (cashRegisterTotal - n <= 0 || itemCount <= 0) {
           System.out.println("WARNING! ONE OR MORE REMOVAL(S) EXCEED(S) THE LIMIT!");
       }
       else {
           itemCount--;
           cashRegisterTotal = cashRegisterTotal - n;
           allCashRegisterTotals = allCashRegisterTotals - n;
       }
    }
    // Getters
    public double getCashRegisterTotal() {
        return cashRegisterTotal;
    }
    // Getters
    public static double getAllCashRegisterTotals() {
        return allCashRegisterTotals;
    }

    //  Clear function would wipe out the count and each register totals, but ALL total register
    public void clear() {
        itemCount = 0;
        cashRegisterTotal = 0;
    }
};
