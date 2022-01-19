package eecs1022.lab7.bank.model;

public class Client {
    private String name;
    private double balance;
    private String[] statement ;
    private int not ;
    private Transaction[] transactions;


    public Client(String name , double balance){
        this.name = name ;
        this.balance = balance ;
        this.transactions = new Transaction[10];
    }
    public String getName(){
        return this.name ;
    }
    public double getBalance(){
        return this.balance;
    }

    public String getStatus(){
        String bal = String.format("%.2f", this.balance);
        String result = this.name + ": $" + bal;
        return result ;
    }
    public String[] getStatement(){
        String[] statement = new String[not + 1];
        statement[0] = this.getStatus() ;
        for(int i = 1 ; i < not + 1; i++){
            statement[i]= transactions[i-1].getStatus();
        }
        return statement ;
    }
    public void deposit(double amount){
        this.balance = this.balance + amount ;
        Transaction t1 = new Transaction("DEPOSIT", amount);
        transactions[not] = t1 ;
        this.not ++;
    }
    public void withdraw(double amount){
        this.balance = this.balance - amount ;
        Transaction t1 = new Transaction("WITHDRAW", amount);
        transactions[not] = t1 ;
        this.not ++;
    }


}
