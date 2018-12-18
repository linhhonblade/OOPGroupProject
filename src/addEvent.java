package Dictionary.bin.Event;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.event.*;
import java.sql.*;

import Dictionary.bin.Connector.*;

public class addEvent extends Event implements ActionListener{
    public addEvent(DataConnector Data,JTextArea jtxout,JTextField jtxinput){
        super(Data,jtxout,jtxinput);
    }

    //@overwrite
    public void actionPerformed(ActionEvent ae){
        try{
            Data.insertWord(jtxinput.getText(),jtxout.getText());
        }catch(SQLException e){
            e.printStackTrace();
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}