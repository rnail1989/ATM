public class Main {
    public static void main(String[] args) {
        Balance balance = new Balance(100.0);
        double balanceInfo = balance.getBalance();
        double balanceNew = balance.setBalance(-500);



        System.out.println(balance);
        System.out.println(balance.getBalance());
        System.out.println(balance.setBalance());
        System.out.println(balance);


    }
}
