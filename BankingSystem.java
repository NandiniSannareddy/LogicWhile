class BankAccount {
    int accountNumber;
    double balance;

    BankAccount(int ac, double bal) {
        accountNumber = ac;
        balance = bal;
    }

    void deposit(double amount) {
        balance += amount;
    }

    void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
        }
    }

    void displayBalance() {
        System.out.println("Balance amount: " + balance);
    }
}

class SavingsAccount extends BankAccount {
    double interestRate;

    SavingsAccount(int ac, double bal, double rate) {
        super(ac, bal);
        interestRate = rate;
    }

    void addInterest() {
        System.out.println("Savings Account");
        System.out.println("Balance: " + balance);
        double interest = balance * interestRate / 100;
        balance += interest;
        System.out.println("After Interest: " + balance);
        System.out.println();
    }
}

class CheckingAccount extends BankAccount {
    double overdraftLimit;

    CheckingAccount(int ac, double bal, int draft) {
        super(ac, bal);
        overdraftLimit = draft;
    }

    void withdraw(double amount) {
        System.out.println("Checking Account");
        System.out.println("Balance: " + balance);
        System.out.println("Withdrawal: " + amount);
        if (balance + overdraftLimit < amount) {
            System.out.println("Overdraft limit exceeded.");
        } else {
            double over = 0;

            if (balance >= amount) {
                balance -= amount;
            } else {
                balance = 0;
                over = amount - balance;
            }
            System.out.println("Overdraft Used: " + over);
        }
        System.out.println();
    }
}

class FDAccount extends BankAccount {
    int termInYears;
    double fdInterestRate;

    FDAccount(int ac, double bal, int ty, int fd) {
        super(ac, bal);
        termInYears = ty;
        fdInterestRate = fd;
    }

    void calculateMaturityAmount() {
        System.out.println("FD Account");
        System.out.println("Balance: " + balance);
        double maturity = balance + (balance * fdInterestRate * termInYears / 100);
        System.out.println("Maturity Amount (after " + termInYears + "years at " + fdInterestRate + "%): " + maturity);
    }
}

public class BankingSystem {
    public static void main(String[] args) {
        SavingsAccount obj1 = new SavingsAccount(123456789, 2000, 25);
        CheckingAccount obj2 = new CheckingAccount(123456789, 2000, 500);
        FDAccount obj3 = new FDAccount(123456789, 5000, 2, 6);
        obj1.addInterest();
        obj2.withdraw(2500);
        obj3.calculateMaturityAmount();

    }
}
