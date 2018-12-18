package Dictionary.bin.Event;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

import Dictionary.bin.Connector.*;

public class Event{
    protected DataConnector Data=null;
    protected JTextArea jtxout=null;
    protected JTextField jtxinput=null;

    //constructor 
    public Event(DataConnector Data,JTextArea jtxout,JTextField jtxinput){
        this.Data=Data;
        this.jtxout=jtxout;
        this.jtxinput=jtxinput;
    }
}