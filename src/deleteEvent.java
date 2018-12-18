package Dictionary.bin.Event;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.event.*;
import java.sql.*;

import Dictionary.bin.Connector.*;

public class deleteEvent extends Event implements ActionListener{
    public deleteEvent(DataConnector Data,JTextArea jtxout,JTextField jtxinput){
        super(Data,jtxout,jtxinput);
    }

    //@overwrite
    public void actionPerformed(ActionEvent ae){
        try{
            Data.deleteWord(jtxinput.getText());
        }catch(SQLException e){
            e.printStackTrace();
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}