package a;
import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.awt.Image;
import java.awt.LayoutManager;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.sql.ResultSet;
import javax.swing.*;


class LoginClass extends JFrame {
      JSplitPane splitPane;
JLabel n;
      JLabel l1;
      JLabel l2;
      JLabel l3;
      JTextField tf1;
      JPasswordField pf2;
      JButton b1;
      JButton b2;
      JButton b3;
    public LoginClass()  {
        ImageIcon I=new ImageIcon(ClassLoader.getSystemResource("a//images//logo.jpg"));
        Image i=I.getImage().getScaledInstance(100,100,Image.SCALE_DEFAULT);
        ImageIcon I2=new ImageIcon(i);
        n=new JLabel(I2);
        n.setBounds(120,80,120,60);
      setVisible(false);
        add(n);

       this.l1=new JLabel("LOGIN PAGE");
        this.l1.setFont(new Font("Chiller",1, 42));
        this.l1.setBounds(290, 80, 600, 30);
        add(l1);
        this.l2 = new JLabel("Sign In:");
        this.l2.setFont(new Font("Raleway",1, 28));
        this.l2.setBounds(160, 150, 375, 30);

        add(l2);
        this.tf1 = new JTextField(15);
        this.tf1.setBounds(300, 150, 230, 30);
        this.tf1.setFont(new Font("Arial", 1, 14));
        this.add(this.tf1);
        this.l3 = new JLabel("Password:");
        this.l3.setFont(new Font("Raleway", 1, 28));
        this.l3.setBounds(140, 220, 375, 30);
        this.add(this.l3);
        this.pf2 = new JPasswordField(15);
        this.pf2.setFont(new Font("Arial", 1, 14));
        this.pf2.setBounds(300, 220, 230, 30);
        this.add(this.pf2);
        this.b1 = new JButton("SIGN IN");
        this.b1.setBackground(Color.blue);
        this.b1.setForeground(Color.WHITE);
        this.b2 = new JButton("CLEAR");
        this.b2.setBackground(Color.BLUE);
        this.b2.setForeground(Color.WHITE);
        this.b3 = new JButton("SIGN UP");
        this.b3.setBackground(Color.BLUE);
        this.b3.setForeground(Color.WHITE);
        this.setLayout((LayoutManager)null);
        this.b1.setFont(new Font("Arial", 1, 14));
        this.b1.setBounds(300, 300, 100, 30);
        this.add(this.b1);
        this.b2.setFont(new Font("Arial", 1, 14));
        this.b2.setBounds(430, 300, 100, 30);
        this.add(this.b2);
        this.b3.setFont(new Font("Arial", 1, 14));
        this.b3.setBounds(300, 350, 230, 30);
        this.add(this.b3);
       // this.b1.addActionListener(this);
        //this.b2.addActionListener(this);
        //this.b3.addActionListener(this);*/
       getContentPane().setBackground(Color.CYAN);
        this.setSize(900, 480);
        this.setLocation(550, 200);
        this.setVisible(false);


        setVisible(true);
    }

    public static void main(String[] args) {
            new LoginClass();
        }

}
