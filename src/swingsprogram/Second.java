package swingsprogram;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class Second extends JFrame implements ActionListener
{
    JLabel jl1;
    JScrollPane jsp1;
    JButton b1;
    Second()
    {
        jl1=new JLabel();
        jsp1=new JScrollPane(jl1);
        b1=new JButton("Open File");
        add(jsp1,BorderLayout.CENTER);
        add(b1,BorderLayout.SOUTH);
        b1.addActionListener(this);
    }
    public void actionPerformed(ActionEvent ae)
    {
        JFileChooser jf1=new JFileChooser("d:\\");
        int x=jf1.showDialog(null,"MCC");
        if(x==JFileChooser.APPROVE_OPTION)
        {
            String fname=jf1.getSelectedFile().getPath();
            jl1.setIcon(new ImageIcon(fname));
        }
        
    }
   public static void main(String args[])
    {
        Second s1=new Second();
        s1.setSize(300,300);
        s1.setVisible(true);
        s1.setDefaultCloseOperation(EXIT_ON_CLOSE);      
    }
    
}

