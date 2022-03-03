import javax.swing.*;
import java.awt.*;

public class Playground extends JPanel implements Components, Globals
{

    private Field[][] fields;
    private Player[] players;
    private int currentplayer;
    private int gameCount;

    public Playground()
    {
        super(new GridLayout(3,3,10,10));
        fields = new Field[3][3];

        for(int i =0; i <3; i++){

            for(int x =0; x <3; x++){

                fields[i][x] = new Field();
                add(fields[i][x]);

            }
        }

        players = new Player[2];
        players[0] = new Player("X");
        players[1] = new Player("O");
        currentplayer = 0;
        gameCount = 0;
    }

    public Player getCurrentPlayer(){
        return players[currentplayer];
    }

    public void switchPlayer(){
        if(currentplayer==0)currentplayer=1;
        else if(currentplayer==1)currentplayer=0;
    }

    public void checkForWin(){

        if(gameCount == 9 && (fields[0][0].getText() != "" )){
            statusbar.setLabel("Q");
        }

        //vertical
        if((fields[0][0].getText() != "" ) && (fields[1][0].getText() != "" ) && (fields[2][0].getText() != "" )){
            if((fields[0][0].getText() == fields[1][0].getText()) && (fields[1][0].getText() == fields[2][0].getText())){
                if(fields[0][0].getText().equals("X"))  statusbar.setLabel("XO");
                else statusbar.setLabel("OO");
            }
        }
        if((fields[0][1].getText() != "" ) && (fields[1][1].getText() != "" ) && (fields[2][1].getText() != "" )){
            if((fields[0][1].getText() == fields[1][1].getText()) && (fields[1][1].getText() == fields[2][1].getText())){
                if(fields[0][1].getText().equals("X"))  statusbar.setLabel("XO");
                else statusbar.setLabel("OO");            }
        }

        if((fields[0][2].getText() != "" ) && (fields[1][2].getText() != "" ) && (fields[2][2].getText() != "" )){
            if((fields[0][2].getText() == fields[1][2].getText()) && (fields[1][2].getText() == fields[2][2].getText())){
                if(fields[0][2].getText().equals("X"))  statusbar.setLabel("XO");
                else statusbar.setLabel("OO");            }
        }

        //horizontal
        if((fields[0][0].getText() != "" ) && (fields[0][1].getText() != "" ) && (fields[0][2].getText() != "" )){
            if((fields[0][0].getText() == fields[0][1].getText()) && (fields[0][1].getText() == fields[0][2].getText())){
                if(fields[0][0].getText().equals("X"))  statusbar.setLabel("XO");
                else statusbar.setLabel("OO");
            }
        }
        if((fields[1][0].getText() != "" ) && (fields[1][1].getText() != "" ) && (fields[1][2].getText() != "" )){
            if((fields[1][0].getText() == fields[1][1].getText()) && (fields[1][1].getText() == fields[1][2].getText())){
                if(fields[1][0].getText().equals("X"))  statusbar.setLabel("XO");
                else statusbar.setLabel("OO");            }
        }
        if((fields[2][0].getText() != "" ) && (fields[2][1].getText() != "" ) && (fields[2][2].getText() != "" )){
            if((fields[2][0].getText() == fields[2][1].getText()) && (fields[2][1].getText() == fields[2][2].getText())){
                if(fields[2][0].getText().equals("X"))  statusbar.setLabel("XO");
                else statusbar.setLabel("OO");            }
        }

        //diagonal
        if((fields[0][0].getText() != "" ) && (fields[1][1].getText() != "" ) && (fields[2][2].getText() != "" )){
            if((fields[0][0].getText() == fields[1][1].getText()) && (fields[1][1].getText() == fields[2][2].getText())){
                if(fields[0][0].getText().equals("X"))  statusbar.setLabel("XO");
                else statusbar.setLabel("OO");            }
        }
        if((fields[0][2].getText() != "" ) && (fields[1][1].getText() != "" ) && (fields[2][0].getText() != "" )){
            if((fields[0][2].getText() == fields[1][1].getText()) && (fields[1][1].getText() == fields[2][0].getText())){
                if(fields[0][2].getText().equals("X"))  statusbar.setLabel("XO");
                else statusbar.setLabel("OO");            }
        }

    }

    public void upCount() {
        gameCount++;
    }

    public void reset() {

        for(int i =0; i <3; i++){

            for(int x =0; x <3; x++){

                fields[i][x].setText("");
                fields[i][x].setBackground(FIELD_BASIC);
                fields[i][x].setEnabled(true);

            }
        }

        currentplayer = 0;
        statusbar.setLabel("X");

    }
}
