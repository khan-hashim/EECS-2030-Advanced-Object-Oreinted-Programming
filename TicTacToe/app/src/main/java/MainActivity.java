package eecs1022.lab8.tictactoe;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

import eecs1022.lab8.tictactoe.model.Game;

public class MainActivity extends AppCompatActivity {

    /* Hint: How do you share the same game object between button clicks
     * (attached with controller methods) of the app?
     */
    Game g ;
    String output ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        g = new Game() ;
        output = "No game has been started" ;
        setContentsOfTextView(R.id.output , output);
        /* Hint: How do you display the initial status to the output textview
         * when the app is first launched?
         */
    }
    /* this mutator sets the output label */
    private void setContentsOfTextView(int id, String newContents) {
        View view = findViewById(id);
        TextView textView = (TextView) view;
        textView.setText(newContents);
    }

    /* this accessor retrieves input entered on the text view  */
    private String getInputOfTextField(int id) {
        View view = findViewById(id);
        EditText editText = (EditText) view;
        String input = editText.getText().toString();
        return input;
    }

    /* this accessor retrieves input chosen from some spinner (drop-down menu) */
    private String getItemSelected(int id) {
        View view = findViewById(id);
        Spinner spinner = (Spinner) view;
        String string = spinner.getSelectedItem().toString();
        return string;
    }
    public void ComputeStartButtonClicked(View view){
        String textplayerx = getInputOfTextField(R.id.inputplayerx);
        String textplayero = getInputOfTextField(R.id.inputplayero);
        String textfirstplayer = getItemSelected(R.id.optionfirstplayer);
        g = new Game(textplayerx , textplayero);
        if(textfirstplayer.equals("Player X")){
            g.setWhoPlaysFirst('x');
        }
        else if(textfirstplayer.equals("Player Y")){
            g.setWhoPlaysFirst('o');
        }
        char[][] board = g.getBoard();
        String status = g.getStatus() ;
        output = "Current Game Board: \n " ;
        output += "\n" ;
        for (int r = 0; r < 3; r++) {
            for (int c = 0; c < 3; c++) {
                output += board[r][c] + " " ;
            }
            output += "\n" ;
        }
        output += "\n" ;
        output += "Current Game Status: \n" ;
        output += status ;
        setContentsOfTextView(R.id.output , output);
    }
    public void ComputeMoveButtonClicked(View view){
        String introwno = getInputOfTextField(R.id.inputrow) ;
        int introw = Integer.parseInt(introwno);
        String intcolno = getInputOfTextField(R.id.inputcol);
        int intcol = Integer.parseInt(intcolno) ;
        g.move(introw , intcol);
        char[][] board = g.getBoard();
        String status = g.getStatus() ;
        output = "Current Game Board: \n " ;
        output += "\n" ;
        for (int r = 0; r < 3; r++) {
            for (int c = 0; c < 3; c++) {
                output += board[r][c] + " " ;
            }
            output += "\n" ;
        }
        output += "Current Game Status: \n" ;
        output += status ;
        setContentsOfTextView(R.id.output , output);




    }


    /* Hints on controller methods:
     *
     * Declare two controller methods, each of which declared with a parameter with type View (see Week 9 Tutorials).
     *  - One method (say cm1) should be attached to the "START/RESTART" button,
     *      whereas the other method (say cm2) should be attached to the "MOVE" button.
     *
     *  - Controller method cm1 should:
     *    + Retrieve the names of the two players from the corresponding textfields.
     *    + Retrieve the player (who will play first) from the spinner.
     *    + Then, re-create the shared game object and invoke the relevant method(s).
     *    + Finally, display the expected output of the game (i.e., board and status) to the output textview.
     *
     * - Controller method cm2 should:
     *    + Retrieve the row and column numbers (as strings) from the corresponding textfields.
     *      You may need to convert the retrieved text, e.g., "1" to an integer value using Double.parseInt.
     *    + Then, invoke the relevant method(s) on the shared game object.
     *    + Finally, display the expected output of the game (i.e., board and status) to the ouptut textview.
     */
}