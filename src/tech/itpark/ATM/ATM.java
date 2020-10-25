package tech.itpark.ATM;

public class ATM {
    private double balance;

    public double ATM(double balance){
        this.balance = balance;

        return balance;
    }
    public String withdraw(double amount){
        if (this.balance<amount) {
            return ("Недостаточно средств");

        }
        return null;
    }
    public double refill(double amount){
        this.balance=amount+balance;
        return balance;
    }


}
