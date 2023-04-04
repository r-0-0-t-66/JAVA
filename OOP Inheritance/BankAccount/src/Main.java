public class Main {
    public static void main(String[] args) {
        BankAccount account = new BankAccount();
        account.setBalance(2000);
        account.depositFunds(200);
        account.withdrawFunds(50);
        account.withdrawFunds(3000);
    }
}
