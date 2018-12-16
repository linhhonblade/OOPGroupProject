package Dictionary.bin.Interface;

import javax.swing.*;
import java.awt.*;
import Dictionary.bin.Interface.*;

public class selectionArea extends JPanel{
    protected JLabel addLabel=null;

    //constructor
    public selectionArea(){

        super(new GridLayout(1,3));

        addLabel=new JLabel("SearchButton area",JLabel.CENTER);
        addLabel.setBackground(Color.green);
        addLabel.setOpaque(true);
        add(addLabel);

        addLabel=new JLabel("EditButton area",JLabel.CENTER);
        addLabel.setBackground(Color.green);
        addLabel.setOpaque(true);
        add(addLabel);

        addLabel=new JLabel("InsertButton area",JLabel.CENTER);
        addLabel.setBackground(Color.green);
        addLabel.setOpaque(true);
        add(addLabel);
    }
}