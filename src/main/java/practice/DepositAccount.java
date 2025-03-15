package practice;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class DepositAccount extends BankAccount {
    private LocalDate lastIncome = LocalDate.now();

    @Override
    public void take(double amountToTake) {
        if(lastIncome.until(LocalDate.now(), ChronoUnit.DAYS) > 28) {
            super.take(amountToTake);
        }
    }
}
