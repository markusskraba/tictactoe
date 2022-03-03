import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class Resetbutton extends JButton implements Components, Globals, MouseListener
{

    private Color c = Color.ORANGE;

    public Resetbutton()
    {
        super("Reset");
        addMouseListener(this);
        setFont(FONT);
        setBackground(c);

    }

    @Override
    public void mouseClicked(MouseEvent e){

        playground.reset();

    }

    @Override public void mousePressed(MouseEvent e){}

    @Override public void mouseReleased(MouseEvent e){}

    @Override public void mouseEntered(MouseEvent e){}

    @Override public void mouseExited(MouseEvent e){} 
}
