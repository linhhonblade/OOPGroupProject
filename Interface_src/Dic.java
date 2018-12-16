package dic;

import javax.swing.*;
import java.awt.*;

public class Dic extends JFrame {


    /*public class firstswingsample {
            public static void main(String[] args) {
                JFrame f=new JFrame();//creating instance of JFrame
                //Icon icon= new ImageIcon("jb1.png");
                JButton jb1=new JButton("Search");//creating instance of JButton
                jb1.setBounds(300,100,80, 20);//x axis, y axis, width, height
                f.add(jb1);//adding button in JFrame
                //f.setSize(200,200);//400 width and 500 height
                f.setLayout(null);//using no layout managers
                f.setVisible(true);//making the frame visible
                final JTextField tf=new JTextField();
                tf.setBounds(100,100, 250,20);

                jb1.addActionListener(new ActionListener(){
                    public void actionPerformed(ActionEvent e){
                        tf.setText("Welcome to Javatpoint.");
                    }
                });
                f.add(jb1);f.add(tf);
                f.setSize(400,400);
                f.setLayout(null);
                f.setVisible(true);
                f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                f.setLocationRelativeTo(null);

            }
        }*/
    JPanel jp = new JPanel();
    JButton search = new JButton("SEARCH");
    JLabel jlb1 = new JLabel("OOP DICTIONARY");
    JLabel jlb2 = new JLabel("Enter word");
    JLabel jlb3 = new JLabel("Meaning");
    JTextField jtxinput = new JTextField();
    JTextArea jtxout = new JTextArea();
    JButton addword = new JButton("Add Word");
    JButton deleteword = new JButton("Delete Word");
    String data[][] = {};
    String column[] = {"WORD", "MEANING"};
    JTable jtb = new JTable(data, column);
    JScrollPane sp = new JScrollPane(jtb);
    public Dic() {
        setLayout(tru);
        setTitle("OOP Dictionary");
        setVisible(true);
        setSize(650, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        jp.setLayout(null);
        jp.setBackground(Color.white);
        //Icon icon= new ImageIcon("b.png");
        //jb.setIcon(new ImageIcon("D:\\HUONG\\2nd year\\OOP\\final\\search-icon (4).png"));
        Font f1 = new Font("Agency FB", Font.ITALIC, 18);
        Font f2 = new Font("Agency FB", Font.BOLD, 18);
        Font f3 = new Font("Agency FB", Font.BOLD, 28);
        Font f4 = new Font("Times New Roman", Font.PLAIN, 16);

        jlb1.setBounds(250, 30, 300, 25);
        jlb1.setFont(f3);
        jlb1.setForeground(Color.black);
        search.setBounds(500, 100, 100, 25);
        search.setFont(f2);
        search.setForeground(Color.white);
        search.setBackground(Color.black);
        jlb2.setBounds(20, 100, 100, 25);
        jlb2.setFont(f1);
        jlb2.setForeground(Color.black);
        jtxinput.setBounds(100, 100, 400, 25);
        jtxinput.setFont(f4);
        jlb3.setBounds(35,150,80,25);
        jlb3.setFont(f1);

        //jtxout.setColumns(20); //set số cột mặc định, nếu lớn hơn chiều rộng thì thanh cuộn ngang sẽ xuất hiện mặc dù không có text
        jtxout.setLineWrap(true); //thiết lập tự động xuống dòng => Thanh cuộn ngang sẽ không bao giờ xuất hiện nhưng từ bị ngắt.
        //jtxout.setRows(5); //set số dòng mặc định, nếu hơn chiều cao thì thanh cuộn dọc sẽ xuất hiện mặc dù không có text
        jtxout.setWrapStyleWord(true);//thiết lập khi hết dòng sẽ ngắt từ, không phải ngắt ký tự như chỉ dùng setLineWrap(true);
        JScrollPane sp2 = new JScrollPane(jtxout);
        sp2.setBounds(100, 150, 500, 100);
        jtxout.setFont(f4);

        addword.setBounds(170, 280, 125, 25);
        addword.setFont(f2);
        addword.setForeground(Color.white);
        addword.setBackground(Color.black);
        deleteword.setBounds(325, 280, 125, 25);
        deleteword.setFont(f2);
        deleteword.setForeground(Color.white);
        deleteword.setBackground(Color.black);
        sp.setBackground(Color.white);
        sp.setBounds(50, 340, 550, 200);

        jp.add(search);
        jp.add(jlb2);
        jp.add(jtxinput);
        jp.add(sp2);
        jp.add(jlb1);
        jp.add(sp);
        jp.add(addword);
        jp.add(deleteword);
        jp.add(jlb3);
        add(jp);
        //validate();
    }

    public static void main(String[] args) {
        Dic t = new Dic();
    }
}



