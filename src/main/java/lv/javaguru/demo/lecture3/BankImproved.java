package lv.javaguru.demo.lecture3;

public class BankImproved {

    int accountBalance;

    public void BankImproved() {
        this.accountBalance = 0;
    }

    public void deposit(int depositedAmount) {
        this.accountBalance = accountBalance + depositedAmount;
        if (depositedAmount < 10000) {
            System.out.println("You have deposited " + depositedAmount + " EUR");
        } else {
            System.out.println("Must register sum in VID");
        }
    }

    public void withdraw(int withdrawnAmount) {
        this.accountBalance = accountBalance - withdrawnAmount;

        if (withdrawnAmount > 700) {
            System.out.println("Daily limit exceeded");
        } else if (accountBalance <= 0) {
            System.out.println("Not enough money");
        } else {
            System.out.println("You have withdrawn " + withdrawnAmount + " EUR");
        }
    }

    public void checkBalance() {
        System.out.println("You have " + accountBalance + " EUR");
    }
}
