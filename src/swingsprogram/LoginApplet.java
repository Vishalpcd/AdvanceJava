package swingsprogram;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class LoginApplet extends JFrame{
    JLabel jl1,jl2,jl3;
    JButton jb1;
    JTextField jtf1,jtf2;
    
    
    LoginApplet()
    {
        jl1=new JLabel("Enter username ");
        jl2=new JLabel("Enter password ");
        jl3=new JLabel();
        jb1=new JButton("Login");
        jtf1=new JTextField(10);
        jtf2=new JPasswordField(10);
        setLayout(new GridLayout(3,2));
        add(jl1);add(jtf1);
        add(jl2);add(jtf2);
        add(jb1);add(jl3);
        jb1.addActionListener(new ActionListener() {
            String u1=jtf1.getText();
            String p1=jtf2.getText();
            @Override
            public void actionPerformed(ActionEvent e) {
                if(u1.equals("vishal"))
                {
                    jl3.setText("Welcome ");
                }
                else
                {
                    jl3.setText("please provide valid username and password");
                }
            }
        });
    }
    
    public static void main(String args[])
    {
        LoginApplet lp=new LoginApplet();
        lp.setSize(300,300);
        lp.setVisible(true);
        lp.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
}
