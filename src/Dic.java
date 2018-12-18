package Dictionary.bin.GUI;

import javax.swing.*;
import java.awt.*;

public class Dic extends JFrame {

    protected JPanel jp = new JPanel();
    protected JPanel jp2 = new JPanel();
    protected JPanel jp3 = new JPanel();
    protected JPanel jp4 = new JPanel();
    protected JPanel jp5 = new JPanel();
    protected JPanel jp6 = new JPanel();
    protected JPanel jp7 = new JPanel();
    protected JButton search = new JButton("SEARCH");
    protected JLabel jlb1 = new JLabel("OOP DICTIONARY", JLabel.CENTER);
    protected JLabel jlb2 = new JLabel("Enter word");
    protected JLabel jlb3 = new JLabel("Meaning");
    protected JTextField jtxinput = new JTextField();
    protected JTextArea jtxout = new JTextArea(8, 15);
    protected JButton addword = new JButton("Add Word");
    protected JButton deleteword = new JButton("Delete Word");
    protected String data[][] = {};
    protected String column[] = {"WORD", "MEANING"};
    protected JTable jtb = new JTable(data, column);
    protected JScrollPane sp = new JScrollPane(jtb);

    public JButton getsearch() {
        return this.search;
    }

    public JTextField getJtxinput() {
        return this.jtxinput;
    }

    public JTextArea getJtxout() {
        return this.jtxout;
    }

    public JTable getJtb() {
        return this.jtb;
    }

    public JButton getAddword() {
        return this.addword;
    }

    public JButton getDeleteword() {
        return this.deleteword;
    }

    public Dic() {
        setResizable(false);

        setLayout(new BorderLayout(5, 20));
        setTitle("OOP Dictionary");

        setPreferredSize(new Dimension(700, 500));
        //setSize(650, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //setLocationRelativeTo(null);
        jp.setLayout(new BorderLayout(12, 10));
        //jp.setBackground(Color.white);
        jp2.setLayout(new BorderLayout(10, 10));
        jp3.setLayout(new BorderLayout(10, 20));
        jp4.setLayout(new BorderLayout(10, 10));
        jp5.setLayout(new BorderLayout(10, 10));
        jp6.setLayout(new BorderLayout(150, 10));
        jp7.setLayout(new GridLayout(1, 2, 100, 10));
        // jp6.setSize(new Dimension(20,20));
        //Icon icon= new ImageIcon("b.png");
        //jb.setIcon(new ImageIcon("D:\\HUONG\\2nd year\\OOP\\final\\search-icon (4).png"));
        Font f1 = new Font("Agency FB", Font.PLAIN, 16);
        Font f2 = new Font("Agency FB", Font.BOLD, 16);
        Font f3 = new Font("Agency FB", Font.BOLD, 28);
        Font f4 = new Font("Times New Roman", Font.PLAIN, 16);

        //jlb1.setBounds(250, 30, 300, 25);
        //jlb1.;
        jlb1.setFont(f3);
        jlb1.setForeground(Color.black);
        //search.setBounds(500, 100, 100, 25);
        search.setFont(f2);
        search.setForeground(Color.white);
        search.setBackground(Color.black);
        //jlb2.setBounds(100, 25);
        jlb2.setFont(f1);
        jlb2.setForeground(Color.black);

        jtxinput.setFont(f4);

        jlb3.setFont(f1);

        //jtxout.setColumns(20);set số cột mặc định, nếu lớn hơn chiều rộng thì thanh cuộn ngang sẽ xuất hiện mặc dù không có text
        jtxout.setLineWrap(true); //thiết lập tự động xuống dòng => Thanh cuộn ngang sẽ không bao giờ xuất hiện nhưng từ bị ngắt.
        //jtxout.setRows(5);set số dòng mặc định, nếu hơn chiều cao thì thanh cuộn dọc sẽ xuất hiện mặc dù không có text
        jtxout.setWrapStyleWord(true);//thiết lập khi hết dòng sẽ ngắt từ, không phải ngắt ký tự như chỉ dùng setLineWrap(true);
        JScrollPane sp2 = new JScrollPane(jtxout);

        jtxout.setFont(f4);


        addword.setFont(f2);
        addword.setForeground(Color.white);
        addword.setBackground(Color.black);
        addword.setMinimumSize(new Dimension(80,25));

        deleteword.setFont(f2);
        deleteword.setForeground(Color.white);
        deleteword.setBackground(Color.black);
        sp.setBackground(Color.white);
        //jtb.setAutoResizeMode(jtb.AUTO_RESIZE_ON);
        jtb.getColumnModel().getColumn(0).setPreferredWidth(200);
        jtb.getColumnModel().getColumn(1).setPreferredWidth(450);

        //sp.setBounds(50, 340, 550, 200);

        add(jlb1, BorderLayout.NORTH);
        add(jp, BorderLayout.CENTER);
        jp.add(jp2, BorderLayout.NORTH);
        jp2.add(jlb2, BorderLayout.WEST);
        jp2.add(jtxinput, BorderLayout.CENTER);
        jp2.add(search, BorderLayout.EAST);
        jp.add(jp3, BorderLayout.CENTER);
        jp3.add(jp4, BorderLayout.NORTH);
        jp4.add(jlb3, BorderLayout.WEST);
        jp4.add(sp2, BorderLayout.CENTER);
        jp3.add(jp5, BorderLayout.CENTER);
        jp5.add(jp6, BorderLayout.NORTH);
        jp6.add(jp7, BorderLayout.CENTER);
        jp6.add(new JPanel(), BorderLayout.WEST);
        jp6.add(new JPanel(), BorderLayout.EAST);
        jp7.add(addword);
        jp7.add(deleteword);
        jp5.add(sp, BorderLayout.CENTER);
        pack();
        setVisible(true);
    }


    public static void main(String[] args) {
        Dic t = new Dic();
    }
}







