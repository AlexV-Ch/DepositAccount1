package practice;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class DepositAccount extends BankAccount {
    private LocalDate lastIncome = LocalDate.now();

    @Override
    public void take(double amountToTake) {
        if (lastIncome.plusMonths(1).compareTo(LocalDate.now()) < 0) {  // 1 способ
        //if (lastIncome.plusMonths(1).isBefore(LocalDate.now())) {     // 2 спссоб
            super.take(amountToTake);
        }
    }
}
