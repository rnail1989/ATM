public class Main {
    public static void main(String[] args) {
        Balance balance = new Balance(100.0);
        balance.getCurrentBalance(500);
        balance.setCurrentBalance(300);
        System.out.println(balance);
        System.out.println(balance.getCurrentBalance());
        System.out.println(balance.setCurrentBalance());
        System.out.println(balance);


    }
}
