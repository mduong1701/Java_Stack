import java.lang.Math;

public class BankAccount{

    private double checkingBalance = 0;
    private double savingBalance = 0;
    private long accountNumber = 0;
    private static int numberOfAccounts = 0;
    private static double totalAllAccounts = 0;

    public BankAccount(double checking, double saving){
        this.checkingBalance = checking;
        this.savingBalance = saving;
        // this.accountNumber = generateAccountNumber();
        numberOfAccounts++;
        totalAllAccounts += checking + saving;
    }

    public static int returnNumberAccounts(){
        return numberOfAccounts;
    }

    public static double returnTotalAllAccounts(){
        return totalAllAccounts;
    }

    public double getChecking(){
        return this.checkingBalance;
    }

    public double getSaving(){
        return this.savingBalance;
    }

    public void deposit(double checkingDeposit, double savingDeposit){
        this.checkingBalance += checkingDeposit;
        this.savingBalance += savingDeposit;
        totalAllAccounts = totalAllAccounts + checkingDeposit + savingDeposit;
    }

    public void withdrawFromChecking(double amount){
        if (this.checkingBalance < amount){
            System.out.println("Insufficient fund");
        }
        else {
            this.checkingBalance -= amount;
        }
    }

    public void withdrawFromSaving(double amount){
        if (this.savingBalance < amount){
            System.out.println("Insufficient fund");
        }
        else {
            this.savingBalance -= amount;
        }
    }

    public double getTotal(){
        return this.checkingBalance + this.savingBalance;
    }

    // private long generateAccountNumber(){
    //     return (long)Math.floor(Math.random() * 10000000000);
    // }
}