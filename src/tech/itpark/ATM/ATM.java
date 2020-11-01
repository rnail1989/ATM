package tech.itpark.ATM;

public class ATM {
    private double balance;

    public double ATM(double balance){
        this.balance = balance;

        return balance;
    }
    public int withdraw(double amount){
        if (this.balance<amount) {
            return 0;


        }
        return 0;
    }
    public double refill(double amount){
        this.balance=amount+balance;
        return balance;
    }


}
