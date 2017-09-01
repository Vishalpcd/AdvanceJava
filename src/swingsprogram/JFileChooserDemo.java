package swingsprogram;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class JFileChooserDemo extends JFrame implements ActionListener {
    JLabel jl1;
    JButton jb1;
    JScrollPane jsp1;//JScrollPane is the container 
    JFileChooserDemo()
    {
        jl1=new  JLabel();
        jsp1=new JScrollPane(jl1);//jl1 is a component in jScrollPane container
        jb1=new JButton("Open FileExplorer");
        add(jsp1,BorderLayout.CENTER);//it will aligned as center in border layout 
        add(jb1,BorderLayout.SOUTH);//it will aligned as south direction that mens at the bottom of the layout 
        jb1.addActionListener(this);
    }
    public void actionPerformed(ActionEvent ae)
    {
        JFileChooser jf1=new JFileChooser("C:\\Users\\visha\\Pictures\\pic");//after click on the button this location will open the the file explorer
        int x=jf1.showDialog(null, "Select Image");//it will set bydefault value null and button for approving is select
        if(x==JFileChooser.APPROVE_OPTION)//if x=0 then if part will get executed else if x=1 then nothing will happen
        {
            String fname=jf1.getSelectedFile().getPath();//geting path of the  selected path in the string data type
            jl1.setIcon(new ImageIcon(fname));
        }
        
    }
    public static void main(String args[])
    {
        JFileChooserDemo jfmd=new JFileChooserDemo();
        jfmd.setSize(300, 300);
        jfmd.setVisible(true);
        jfmd.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
    
}
