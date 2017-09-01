package swingsprogram;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class JComboBoxDemo extends JFrame implements ActionListener{
    
    JComboBox jcb1,jcb2,jcb3;
    JButton jb1,jb2,jb3,jb4;
    JComboBoxDemo()
    {
        Object[] jcb1Data=new Object[]{"Vishal","Swami","Vikram",199};
        jcb1=new JComboBox(jcb1Data);
        jcb2=new JComboBox();
        jcb2.addItem("RADAV");
        jcb2.addItem("Kelkar");
        jcb2.addItem("KB");
        jcb3=new JComboBox();
        jb1=new JButton("Add Item");
        jb2=new JButton("Display Selected");
        jb3=new JButton("Remove");
        jb4=new JButton("Remove all");
        jb1.addActionListener(this);
        jb2.addActionListener(this);
        jb3.addActionListener(this);
        jb4.addActionListener(this);
        setLayout(new FlowLayout());
        add(jcb1);add(jcb2);add(jcb3);
        add(jb1);add(jb2);add(jb3);add(jb4);
        
    }
    public void actionPerformed(ActionEvent ae)
    {
        if(ae.getSource()==jb1)
        {
            String v=JOptionPane.showInputDialog("Enter the value");
            jcb3.addItem(v);
        }
        else if(ae.getSource()==jb2)
        {
            int si=jcb1.getSelectedIndex();
            String Iname=jcb1.getSelectedItem().toString();
            JOptionPane.showMessageDialog(null, "Selected index"+si+"selected item is "+Iname);
        }
        else if(ae.getSource()==jb3)
        {
            jcb3.removeItemAt(jcb3.getSelectedIndex());
        }
        else
        {
            int x=JOptionPane.showConfirmDialog(null, "Do you really wnat to Remove all items");
            if(x==0)
            {
                jcb3.removeAllItems();
            }
        } 
    }
    public static void main(String args[])
    {
        JComboBoxDemo j=new JComboBoxDemo();
        j.setSize(300, 300);
        j.setVisible(true);
        j.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
}
