package OOP.ClassesAndObjects.Ineritance;

public class SavingAccount extends Account {
    static private double interestRate;

    public SavingAccount(String accountNumber, double balance, String accountOwner) {
        super(accountNumber, balance, accountOwner);
    }


    void addInterest(){
        double interest = getBalance() * interestRate /100;
        deposit(interest);
    }

    @Override
    void displayAccountInfo(){
        super.displayAccountInfo();
        System.out.println("Interest Rate: " + interestRate);
        if (1 < 2 ){
            if (2<1){
                System.out.println("Make a mistake");
            }
        }

    }


}// nonReachable code
