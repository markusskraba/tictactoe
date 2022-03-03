import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Field extends JButton implements Components, Globals, MouseListener
{

    public Field()
    {
        if(isEnabled()){
            setBackground(FIELD_BASIC);
            addMouseListener(this);
        }
        
        setFont(FONT);

    }

    @Override
    public void mouseEntered(MouseEvent e){
        if(isEnabled()){
            setText(playground.getCurrentPlayer().getSymbol());
            setBackground(FIELD_HOVER);
        }

    }

    @Override
    public void mouseExited(MouseEvent e){
        if(isEnabled()){
            setText("");
            setBackground(FIELD_BASIC);
        }
    }   

    @Override
    public void mouseClicked(MouseEvent e){
        if(isEnabled()){
            setText(playground.getCurrentPlayer().getSymbol());
            playground.switchPlayer();
            statusbar.setLabel(playground.getCurrentPlayer().getSymbol());
            setBackground(FIELD_CLICKED);
            setEnabled(false);
            playground.upCount();
            playground.checkForWin();

        }
    }

    @Override public void mousePressed(MouseEvent e){}

    @Override public void mouseReleased(MouseEvent e){}

}
