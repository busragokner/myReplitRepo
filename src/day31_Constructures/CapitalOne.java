package day31_Constructures;

public class CapitalOne {
    public static void main(String[] args) {


    BankAccount account1 = new BankAccount();
    account1.setInfo("Ahmet ozkok", 123456789);
        System.out.println(account1);

        account1.deposit(1000);
        account1.checkBalance();

        account1.withdraw(900);
        account1.checkBalance();

        BankAccount account2 = new BankAccount();
        account2.setInfo("Aygun", 987654321);

        account2.deposit(100000);
        account2.checkBalance();





}}
