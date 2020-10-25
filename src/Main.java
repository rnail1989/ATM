import tech.itpark.ATM.ATM;

public class Main {
    public static void main(String[] args) {
        ATM UseATM = new ATM();
        double balance = UseATM.ATM(5000);
        String withdraw = UseATM.withdraw(5001);
        double refill = UseATM.refill(100);


    }
}
