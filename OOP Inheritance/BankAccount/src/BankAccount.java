import  java.util.Scanner;
public class BankAccount {
    Scanner scanner = new Scanner(System.in);
    private int number;
            private int balance;
                    private String name;
                            private String email;
                                    private int phoneNumber;


    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void depositFunds(int Dammount){
        balance += Dammount;
        System.out.println(balance);
    }
    public void withdrawFunds(int Wammount){
        if (balance - Wammount < 0){
            System.out.println("Insufficient funds");
        }else{
            balance -= Wammount;
            System.out.println(balance);
        }

    }
}
