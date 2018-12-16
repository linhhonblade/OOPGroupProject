package Dictionary.bin.Interface;

import javax.swing.*;
import java.awt.*;

public class mainArea extends JPanel{
    protected JLabel Search=null;
    protected JLabel textDiscription=null;

    //constructor
    public mainArea(){
        //construct layout as BorderLayout
        super(new BorderLayout());

        //search area setting
        Search=new JLabel("Search area",JLabel.CENTER);
        Search.setBackground(Color.blue);
        Search.setOpaque(true);

        //text discription area setting
        textDiscription=new JLabel("Discription area",JLabel.CENTER);
        textDiscription.setBackground(Color.yellow);
        textDiscription.setOpaque(true);

        //add components to panel
        add(Search,BorderLayout.NORTH);
        add(textDiscription,BorderLayout.CENTER);
    }
}