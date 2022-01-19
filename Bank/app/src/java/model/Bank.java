package eecs1022.lab7.bank.model;

public class Bank {
    private String status;
    private Client[] clients;
    private int noc ;

    public Bank(){
        this.noc = 0 ;
        this.clients = new Client[6];
        this.status = "Accounts: " + "{}";
    }
    public String getStatus(){
        return this.status ;
    }
    public String[] getStatement(String name){
        String[] result = null ;
        boolean nameexists = false ;
        int index = 0;
        for(int i = 0 ; i < noc ; i++){
            if(clients[i].getName().equals(name)){
                nameexists = true ;
                index = i ;
            }
        }
        if(nameexists){
            result = clients[index].getStatement();
        }
        else{
            this.status = "Error: From-Account " + name+ " does not exist" ;
        }
        return result ;
    }
    public void addClient(String name , double balance){
        boolean nameexists = false ;
        int index = 0;
        for(int i = 0 ; i < noc ; i++){
            if(clients[i].getName().equals(name)){
                nameexists = true ;
                index = i ;
            }
        }
        if (noc >= 6 ){
            this.status = "Error: Maximum Number of Accounts Reached";
        }
        else if(nameexists == true){
            this.status = "Error: Client " + name + " already exists" ;
        }
        else if (balance <= 0){
            this.status = "Error: Non-Positive Initial Balance" ;
        }
        else{
            Client c1 = new Client(name , balance) ;
            clients[noc] = c1 ;
            noc++ ;
            this.status = "Accounts: {";
            for(int i = 0; i < noc; i++){
                this.status += clients[i].getStatus();
                if (i < noc-1){
                    this.status += ", " ;
                }
            }
            this.status += "}" ;
        }
    }

    public void deposit(String name , double amount){
        boolean nameexists = false ;
        int index = 0;
        for(int i = 0 ; i < noc ; i++){
            if(clients[i].getName().equals(name)){
                nameexists = true ;
                index = i ;
            }
        }
        if(nameexists== false){
            this.status = "Error: To-Account " + name+ " does not exist" ;
        }
        else if (amount <= 0){
            this.status = "Error: Non-Positive Amount" ;
        }
        else{
            clients[index].deposit(amount);
            this.status = "Accounts: {";
            for(int i = 0; i < noc; i++){
                this.status += clients[i].getStatus();
                if (i < noc-1){
                    this.status += ", " ;
                }
            }
            this.status += "}" ;
        }
    }
    public void withdraw(String name , double amount){
        boolean nameexists = false ;
        int index = 0 ;
        for(int i = 0 ; i < noc ; i++){
            if(clients[i].getName().equals(name)){
                nameexists = true ;
                index = i ;
            }
        }
        if(nameexists == false){
            this.status = "Error: From-Account " + name+ " does not exist" ;
        }
        else if (amount <= 0){
            this.status = "Error: Non-Positive Amount" ;
        }
        else if(amount > clients[index].getBalance()){
            this.status = "Error: Amount too large to withdraw" ;
        }
        else{
            clients[index].withdraw(amount);
            this.status = "Accounts: {";
            for(int i = 0; i < noc; i++){
                this.status += clients[i].getStatus();
                if (i < noc-1){
                    this.status += ", " ;
                }
            }
            this.status += "}" ;

        }
    }
    public void transfer(String fromname, String toname , double amount){
        boolean fromnameexists = false ;
        int fromindex = 0 ;
        for(int i = 0 ; i < noc ; i++){
            if(clients[i].getName().equals(fromname)){
                fromnameexists = true ;
                fromindex = i ;
            }
        }
        boolean tonameexists = false ;
        int toindex = 0 ;
        for(int i = 0 ; i < noc ; i++){
            if(clients[i].getName().equals(toname)){
                tonameexists = true ;
                toindex = i ;
            }
        }
        if(fromnameexists == false){
            this.status = "Error: From-Account " + fromname+ " does not exist" ;
        }
        else if(tonameexists==false){
            this.status = "Error: To-Account " + toname+ " does not exist" ;
        }
        else if(amount <=0){
            this.status = "Error: Non-Positive Amount" ;
        }
        else if(amount > clients[fromindex].getBalance()){
            this.status = "Error: Amount too large to transfer" ;
        }
        else {
            clients[fromindex].withdraw(amount);
            clients[toindex].deposit(amount);
            this.status = "Accounts: {";
            for(int i = 0; i < noc; i++){
                this.status += clients[i].getStatus();
                if (i < noc-1){
                    this.status += ", " ;
                }
            }
            this.status += "}" ;

        }
    }



}
