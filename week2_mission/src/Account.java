public class Account {
    private String accountnumber;
    private String name;
    private int balance;

    Account(String account, String name){
        this.accountnumber = account;
        this.name = name;
        this.balance = 0;
    }

    public String getAccountNumber(){
        return accountnumber;
    }

    public int getBalance(){
        return balance;
    }

    public void deposit(int money){
        //입금
        this.balance += money;
    }

    public void withdraw(int money){
        //출금
        this.balance -= money;
    }



}
