import javax.swing.*;
import java.awt.*;

public class Statusbar extends JPanel implements Components
{

    private Label label = new Label();
    private Resetbutton resetbutton = new Resetbutton();
    private Color c = Color.YELLOW;
    
    public Statusbar()
    {
        label.setText("Spieler: X");
        
        setBackground(c);

        add(label);
        add(resetbutton);

    }

    public void setLabel(String text){

        if(text.equals("X"))label.setText("Spieler: X");
        else if (text.equals("O"))label.setText("Spieler: O");
        else if (text.equals("Q"))label.setText("Unentschieden");
        else if (text.equals("XO"))label.setText("Spieler: X hat gewonnen!");
        else if (text.equals("OO"))label.setText("Spieler: O hat gewonnen!");

    }
}
