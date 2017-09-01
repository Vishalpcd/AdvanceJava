package swingsprogram;
import java.awt.*;
import java.nio.file.Files;
import javax.swing.*;
import java.awt.event.*;
public class UseOfTextField extends JFrame implements ActionListener {
    JTextArea jtf1;
    JScrollPane jsp;
    JButton jb1,jb2;
    UseOfTextField()
    {
        jtf1=new JTextArea(5,10);
        jsp=new JScrollPane(jtf1);
        jb1=new JButton("Change Background Color");
        jb2=new JButton("Change ForeGround Color");
        setLayout(new FlowLayout());
        add(jsp);add(jb1);add(jb2);
        jb1.addActionListener(this);
        jb2.addActionListener(this);
        
        
    }
    public void actionPerformed(ActionEvent ae)
    {
        if(ae.getSource()==jb1)
        {
            Color BGclr=JColorChooser.showDialog(null,"Back Color",Color.MAGENTA);
            if(BGclr!=null)
            {
                jtf1.setBackground(BGclr);
            }
        }
        else
        {
            Color FGclr=JColorChooser.showDialog(null, "ForeGround Color", Color.BLUE);
            if(FGclr!=null)
            {
                jtf1.setForeground(FGclr);
            }
        }
    }
    public static void main(String args[])
    {
        UseOfTextField u=new UseOfTextField();
        u.setSize(300,300);
        u.setVisible(true);
        u.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
    
}
