package class23;

public class BankAccount {
    private String name;
   final private long BankaccountNumber;
    private double balance;
    private String username;
   private String password;
    private String accountType;

    public BankAccount(String name, long bankaccountNumber, double balance, String username, String password, String accountType) {
        this.name = name;
        BankaccountNumber = bankaccountNumber;
        this.balance = balance;
        this.username = username;
        this.password = password;
        this.accountType = accountType;
    }
    public BankAccount( long bankaccountNumber, String username, String password) {

        BankaccountNumber = bankaccountNumber;
        this.username = username;
        this.password = password;

}}
