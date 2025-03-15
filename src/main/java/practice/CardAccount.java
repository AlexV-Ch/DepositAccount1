package practice;
public class CardAccount extends BankAccount {
    private double commission = 0.01;

    @Override
    public void take(double amountToTake) {
        amountToTake = amountToTake + (amountToTake * commission);
        super.take(amountToTake);
    }
}

