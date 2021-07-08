package ca.ciccc.wmad202.assignment5.problem2_3;

public class Bank {
    private int accountID;
    private int balance;
    private String name;
    private int[] bankStatement = new int[2];

    public Bank(int id, String name, int balance){
        this.accountID = id;
        this.balance = balance;
        this.name = name;
        createBankStatement();
    }

    public void createBankStatement() {
        this.bankStatement[0] = this.accountID;
        this.bankStatement[1] = this.balance;
    }

    public String getName() {
        return name;
    }

    public int getAccountID() {
        return accountID;
    }

    public int getBalance() {
        return balance;
    }

    public int[] getBankStatement() {
        return bankStatement;
    }

    public void deposit(int amount) {
        this.balance += amount;
        this.bankStatement[1] = balance;
    }

    public void withdrew(int amount){
        this.balance -= amount;
        this.bankStatement[1] = balance;
    }

    public static void bankStatement(int[] statement, String name){
        int id = statement[0];
        int balance = statement[1];
        System.out.print("ID: " + id + " , ");
        System.out.print("Name: " + name + " , ");
        System.out.print("Balance: $" + balance);
        System.out.println();
    }

}
