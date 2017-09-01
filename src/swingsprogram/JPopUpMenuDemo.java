package swingsprogram;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class JPopUpMenuDemo extends JFrame {
    JPanel jp1,jp2;
    JPopupMenu jpm1,jpm2;
    JMenuItem jm1,jm2,jm3,jm4;

    public JPopUpMenuDemo(){
        jp1=new JPanel();
        jp2=new JPanel();
        jpm1=new JPopupMenu();
        jpm2=new JPopupMenu();
        jm1=new JMenuItem("New");
        jm2=new JMenuItem("Open");
        jm3=new JMenuItem("Edit");
        jm4=new JMenuItem("Exit");
        jpm1.add(jm1);jpm1.add(jm2);
        jpm2.add(jm3);jpm2.add(jm4);
        jp1.setBackground(Color.red);
        jp2.setBackground(Color.MAGENTA);
        setLayout(new GridLayout(1,2));
        add(jp1);add(jp2);
        jm4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
        jp1.addMouseListener(new MouseAdapter() {
            public void mouseReleased(MouseEvent me)
            {
                if(me.isPopupTrigger()==true)
                {
                    jpm1.show(jp1,me.getX(),me.getY());
                }
            }
});
        jp2.addMouseListener(new MouseAdapter() {
            public void mouseReleased(MouseEvent me)//in windows for right click mouseReleased method is used and in linux mousePressed event is required for functioning the right click operation
            {
                if(me.isPopupTrigger()==true)
                {
                    jpm2.show(jp2,me.getX(),me.getY());
                }
            }
});
    }
    
    public static void main(String args[])
    {
        JPopUpMenuDemo j=new JPopUpMenuDemo();
        j.setSize(300, 300);
        j.setVisible(true);
        j.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
    
    
}
