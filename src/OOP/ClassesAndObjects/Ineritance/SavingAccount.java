package OOP.ClassesAndObjects.Ineritance;

public class SavingAccount extends Account {
    private double interestRate;


    public SavingAccount(String accountNumber, double balance, String accountOwner,double interestRate){
        super(accountNumber,balance,accountOwner);
        this.interestRate = interestRate;
    }



    void addInterest(){
        double interest = getBalance() * interestRate /100;
        deposit(interest);
    }

    @Override
    void displayAccountInfo(){
        super.displayAccountInfo();
        System.out.println("Interest Rate: " + interestRate);

    }


}
