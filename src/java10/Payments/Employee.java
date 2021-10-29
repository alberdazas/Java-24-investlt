package java10.Payments;

public class Employee implements Payment {
    private String bankAccount;
    private double amount;

    public Employee(String bankAccount, double amount) {
        this.bankAccount = bankAccount;
        this.amount = amount;
    }

    @Override
    public String getBankAccount() {
        return bankAccount;
    }

    @Override
    public double getAmount() {
        return amount;
    }

    public void spausdinti() {}
}
