import javax.swing.*;
import java.awt.*;
import javax.swing.JApplet;

public class TicTacToe extends JFrame implements Components
{
    

    public TicTacToe()
    {
        super("TicTacToe V1");
        add(statusbar, BorderLayout.NORTH);
        add(playground, BorderLayout.CENTER);

        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(800,600);
        setResizable(false);
        setVisible(true);

    }

    public static void main(String[] args){
        TicTacToe tictactoe = new TicTacToe();

    }

}
