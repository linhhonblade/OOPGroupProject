package Dictionary.bin.Interface;

import javax.swing.*;
import java.awt.*;
import Dictionary.bin.Interface.*;

public class Interface extends JFrame{
    
    //constructor
    public Interface(){
        //exit program when frame close
        super("OOP Dictionary");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //set size for frame
        setPreferredSize(new Dimension(700,500));
        pack();
        setVisible(true);
        panelSearch();
    }

    //main search page
    protected void panelSearch(){
        add(new selectionArea(),BorderLayout.NORTH);
        add(new JLabel("advertisements area",JLabel.CENTER),BorderLayout.WEST);
        add(new mainArea(),BorderLayout.CENTER);
    }

    //main run test
    public static void main(String[] args){
        Interface obj=new Interface();
    }
}