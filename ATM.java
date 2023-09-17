// Base class Transaction
class Transaction {
    protected double amount;

    public Transaction(double amount) {
        this.amount = amount;
    }

    public void execute() {
        System.out.println("Transaction executed with amount: $" + amount);
    }
}

// Derived class WithdrawalTransaction
class WithdrawalTransaction extends Transaction {
    public WithdrawalTransaction(double amount) {
        super(amount);
    }

    @Override
    public void execute() {
        System.out.println("Withdrawal executed with amount: $" + amount);
    }
}

// Derived class DepositTransaction
class DepositTransaction extends Transaction {
    public DepositTransaction(double amount) {
        super(amount);
    }

    @Override
    public void execute() {
        System.out.println("Deposit executed with amount: $" + amount);
    }
}

public class ATM {
    public static void main(String[] args) {
        Transaction transaction1 = new WithdrawalTransaction(100.0);
        Transaction transaction2 = new DepositTransaction(200.0);
        transaction1.execute(); // Executes a withdrawal
        transaction2.execute(); // Executes a deposit
    }
}
