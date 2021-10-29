package java10.Payments;

public class Client implements Payment {
    private String bankAccount;
    private double amount;
    private double[] payments;

    public Client(String bankAccount, double amount) {
        this.bankAccount = bankAccount;
        this.amount = amount;
    }

    public Client(String bankAccount, double[] payments) {
        this.bankAccount = bankAccount;
        this.payments = payments;
        this.amount = paymentsSum(payments);
    }

    public double[] getPayments() {
        return payments;
    }

    @Override
    public String getBankAccount() {
        return bankAccount;
    }

    @Override
    public double getAmount() {
        return amount;
    }
}
