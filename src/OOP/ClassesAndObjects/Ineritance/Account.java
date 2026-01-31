package OOP.ClassesAndObjects.Ineritance;

public class Account {
    private  String accountNumber;
    private double balance;
    private String accountOwner;


    public Account(String accountNumber, double balance, String accountOwner){
        setAccountNumber(accountNumber);
        setBalance(balance);
    this.accountOwner = accountOwner;
    }
    public Account(String accountNumber, double balance){
        setAccountNumber(accountNumber);
        setBalance(balance);
    }

    public Account(String accountOwner){
        this("123123",1000);
        setAccountNumber(accountOwner);
    }

    public void setAccountNumber(String accountNumber){
        if (accountNumber != null && accountNumber.length() == 10 ){
            this.accountNumber = accountNumber;
        }else {
            System.out.println("Invalid account number ");
        }

    }


    public void setBalance(double balance) {
        if (balance >= 0) {
            this.balance = balance;
        } else {
            System.out.println("Invalid balance");
        }
    }

    public void setAccountOwner(String accountOwner){
        if (accountOwner != null ){
            this.accountOwner = accountOwner;
        }else {
            System.out.println("Invalid account owner");
        }
    }


    public void deposit(double amount){
        if (amount > 0){
            balance += amount;
        }
    }


    public void withdraw(double amount){
        if (amount > 0 && amount <= balance){
            balance -= amount;
        }
    }


    void displayAccountInfo(){
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Balance: " + balance);
        System.out.println("Account Owner: " + accountOwner);
    }


    public double getBalance() {
        return balance;
    }
}
