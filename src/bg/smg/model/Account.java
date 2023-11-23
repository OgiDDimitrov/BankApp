package bg.smg.model;

public class Account {
    private String IBAN;
    private double amount;
    private Currency currency;

    public Account() {
        this.IBAN = "";
        this.amount = 0;
        this.currency = Currency.BGN;
    }

    public Account(String IBAN, double amount, Currency currency) {
        this.IBAN = IBAN;
        this.amount = amount;
        this.currency = currency;
    }

    @Override
    public String toString() {
        return "Account{" +
                "IBAN='" + IBAN + '\'' +
                ", amount=" + amount +
                ", currency=" + currency +
                '}';
    }

    public String getIBAN() {
        return IBAN;
    }

    public void setIBAN(String IBAN) {
        this.IBAN = IBAN;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public Currency getCurrency() {
        return currency;
    }

    public void setCurrency(Currency currency) {
        this.currency = currency;
    }
}
