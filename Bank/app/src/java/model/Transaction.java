package eecs1022.lab7.bank.model;

public class Transaction {
    private String type ;
    private double amount ;

    public Transaction(String type , double amount){
        this.type = type ;
        this.amount = amount ;
    }
    public String getStatus(){
        String amt = String.format("%.2f", this.amount);
        String result = "Transaction " + this.type + ": $" + amt ;
        return result ;
    }


}
