package practice;

public class BankAccount {
    protected double balance = 0.0;

    public double getAmount() {

        return balance;
    }

    public void put(double amountToPut) {
        if (amountToPut > 0) {
            balance = balance + amountToPut;
        }
    }

    public void take(double amountToTake) {
        if (amountToTake <= balance) {
            balance = balance - amountToTake;
            System.out.println();
        }

    }

    @Override
    public String toString() {
        String balanceAccount = "Сумма на счете: ";
        return balanceAccount + balance + " руб.";
    }
}
