package swingsprogram;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class AdditionOfTwoNubersApplet extends JFrame implements ActionListener {
    JLabel jl1,jl2,jl3;
    JButton jb1,jb2;
    JTextField jtf1,jtf2;
    int x,y,z;
    AdditionOfTwoNubersApplet()
    {
        jl1=new JLabel("Enter first number");
        jl2=new JLabel("Enter second number");
        jl3=new JLabel();
        jb1=new JButton("Addition");
        jb2=new JButton("Substraction");
        jtf1=new JTextField(10);
        jtf2=new JTextField(10);
        setLayout(new GridLayout(4,2));
        add(jl1);add(jtf1);
        add(jl2);add(jtf2);
        add(jb1);add(jb2);
        add(jl3);
        jb1.addActionListener(this);
        jb2.addActionListener(this);
        
    }

    @Override
    public void actionPerformed(ActionEvent e) {
       if(e.getSource()==jb1)
       {
           try
           {
           x=Integer.parseInt(jtf1.getText());
           y=Integer.parseInt(jtf2.getText());
           z=x+y;
           jl3.setText("Addition = "+z);
           }
           catch(Exception ex)
           {
               jl3.setText("Exception "+ex);
           }
       }
       else
       {
           try
           {
           x=Integer.parseInt(jtf1.getText());
           y=Integer.parseInt(jtf2.getText());
           z=x-y;
           jl3.setText("Substraction = "+z);
           }
           catch(Exception ex)
           {
               jl3.setText("Exception "+ex);
           }
           
       }
    }
    public static void main(String args[])
    {
        AdditionOfTwoNubersApplet a=new AdditionOfTwoNubersApplet();
        a.setSize(300,300);
        a.setVisible(true);
        a.setTitle("My Applet");
        a.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
    
}
