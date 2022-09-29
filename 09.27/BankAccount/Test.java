public class Test {
    public static void main(String[] args){

        BankAccount account1 = new BankAccount(10, 50);
        BankAccount account2 = new BankAccount(10, 50);
        BankAccount account3 = new BankAccount(10, 50);
        BankAccount account4 = new BankAccount(10, 50);
        BankAccount account5 = new BankAccount(10, 50);
        BankAccount account6 = new BankAccount(10, 50);
        BankAccount account7 = new BankAccount(10, 50);
        BankAccount account8 = new BankAccount(10, 50);
        BankAccount account9 = new BankAccount(10, 50);
        BankAccount account10 = new BankAccount(10, 50);

        System.out.println(BankAccount.returnNumberAccounts());
        System.out.println(BankAccount.returnTotalAllAccounts());
    }
}