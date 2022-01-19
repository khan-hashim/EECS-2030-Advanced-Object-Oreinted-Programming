package eecs1022.lab8.tictactoe.model;

public class Game {
    private String playerx ;
    private String playero ;
    private char[][] Board ;
    private String CurrentPlayer ;
    private String Status;
    private int count ;

    public Game(){

    }

    public Game(String playerx , String playero) {
        this.playerx = playerx;
        this.playero = playero;
        this.CurrentPlayer = this.playerx;
        this.Board = new char[3][3];
        this.Status = this.CurrentPlayer + "'s turn to play...";
        for (int r = 0; r < 3; r++) {
            for (int c = 0; c < 3; c++) {
                this.Board[r][c] = '_' ;
            }
        }
        this.count = 0 ;
    }
    public String getCurrentPlayer(){
        return this.CurrentPlayer ;
    }
    public String getStatus(){
        return this.Status ;
    }
    public char[][] getBoard(){
        return this.Board ;
    }
    public void setWhoPlaysFirst(char c){
        if(c == 'x'){
            this.CurrentPlayer = this.playerx ;
        }
        else if(c == 'o') {
            this.CurrentPlayer = this.playero ;
        }
        this.Status = this.CurrentPlayer + "'s turn to play...";
    }
    public boolean checkwinner(){
        boolean check = false ;
        if(this.Board[0][0] == 'x' && this.Board[0][1] == 'x' && this.Board[0][2] == 'x'){
            check = true ;
        }
        else if(this.Board[1][0] == 'x' && this.Board[1][1] == 'x' && this.Board[1][2] == 'x') {
            check = true ;
        }
        else if(this.Board[2][0]== 'x' && this.Board[2][1] == 'x' && this.Board[2][2] == 'x') {
            check = true ;
        }
        if(this.Board[0][0] == 'x' && this.Board[1][0] == 'x' && this.Board[2][0] == 'x'){
            check = true ;
        }
        else if(this.Board[0][1] == 'x' && this.Board[1][1] == 'x' && this.Board[2][1] == 'x') {
            check = true ;
        }
        else if(this.Board[0][2]== 'x' && this.Board[1][2] == 'x' && this.Board[2][2] == 'x') {
            check = true ;
        }
        else if(this.Board[0][0] == 'x' && this.Board[1][1] == 'x' && this.Board[2][2] == 'x') {
            check = true ;
        }
        else if(this.Board[0][2]== 'x' && this.Board[1][1] == 'x' && this.Board[2][0] == 'x') {
            check = true ;
        }


        if(this.Board[0][0] == 'o' && this.Board[0][1] == 'o' && this.Board[0][2] == 'o'){
            check = true ;
        }
        else if(this.Board[1][0] == 'o' && this.Board[1][1] == 'o' && this.Board[1][2] == 'o') {
            check = true ;
        }
        else if(this.Board[2][0]== 'o' && this.Board[2][1] == 'o' && this.Board[2][2] == 'o') {
            check = true ;
        }
        if(this.Board[0][0] == 'o' && this.Board[1][0] == 'o' && this.Board[2][0] == 'o'){
            check = true ;
        }
        else if(this.Board[0][1] == 'o' && this.Board[1][1] == 'o' && this.Board[2][1] == 'o') {
            check = true ;
        }
        else if(this.Board[0][2]== 'o' && this.Board[1][2] == 'o' && this.Board[2][2] == 'o') {
            check = true ;
        }
        else if(this.Board[0][0] == 'o' && this.Board[1][1] == 'o' && this.Board[2][2] == 'o') {
            check = true ;
        }
        else if(this.Board[0][2]== 'o' && this.Board[1][1] == 'o' && this.Board[2][0] == 'o') {
            check = true ;
        }
        return check ;
    }
    public void move(int r , int c){
        if(this.checkwinner()){
            this.Status = "Error: game is already over with a winner." ;
        }
        else if(this.count == 9){
            this.Status = "Error: game is already over with a tie." ;
        }
        else if(r < 1 || r > 3){
            this.Status = "Error: row " + r+ " is invalid." ;
        }
        else if(c < 1 || c > 3){
            this.Status = "Error: col " + c+ " is invalid." ;
        }
        else if (this.Board[r-1][c-1] == 'x' || this.Board[r-1][c-1] == 'o'){
            this.Status = "Error: slot @ (" + r + ", " + c + ") is already occupied." ;
        }
        else {
            if(this.CurrentPlayer.equals(this.playerx)){
                this.Board[r-1][c-1] = 'x' ;
                this.count++ ;
                this.CurrentPlayer = this.playero ;
                this.Status = this.CurrentPlayer + "'s turn to play...";
                if(this.count==9){
                    this.Status = "Game is over with a tie between " + this.playerx + " and " + this.playero + "." ;
                    this.CurrentPlayer = null ;
                }
                if(this.checkwinner()){
                    this.Status = "Game is over with "+ this.playerx + " being the winner." ;
                    this.CurrentPlayer = null;
                }
            }
            else{
                this.Board[r-1][c-1] = 'o' ;
                this.count++ ;
                this.CurrentPlayer = this.playerx ;
                this.Status = this.CurrentPlayer + "'s turn to play...";
                if(this.count==9){
                    this.Status = "Game is over with a tie between " + this.playerx + " and " + this.playero + "." ;
                    this.CurrentPlayer = null ;
                }
                if(this.checkwinner()){
                    this.Status = "Game is over with "+ this.playero + " being the winner." ;
                    this.CurrentPlayer = null;
                }
            }
        }


    }


}
