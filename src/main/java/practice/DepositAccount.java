package practice;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class DepositAccount extends BankAccount {
    private LocalDate lastIncome = LocalDate.of(2025,01,15);

    @Override
    public void take(double amountToTake) {
        if(lastIncome.until(LocalDate.now(), ChronoUnit.DAYS) > 30) {
            super.take(amountToTake);
        }
    }
}
