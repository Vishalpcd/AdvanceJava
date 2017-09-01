package swingsprogram;
import java.awt.*;
import javax.swing.*;
import java.awt.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
public class JSplitPaneDemo extends JFrame{
    JList jlst1;
    JScrollPane jsp1,jsp2;
    JSplitPane jsplt1,jsplt2;
    JLabel jl1;
    JTextArea jta1;
    JSplitPaneDemo()
    {
        String[] Planets=new String[]{"Sun","Mercury","Venus","Earth","Mars","Jupiter","Saturn","Uranus","Neptune","Pluto"};
        jlst1=new JList(Planets);
        jl1=new JLabel();
        jsp1=new JScrollPane(jl1);
        jta1=new JTextArea("Welcome to the planets program");
        jsp2=new JScrollPane(jta1);
        jsplt1=new JSplitPane(JSplitPane.HORIZONTAL_SPLIT,jlst1,jl1);
        jsplt2=new JSplitPane(JSplitPane.VERTICAL_SPLIT,jsplt1,jsp2);
        add(jsplt2);
        jlst1.addListSelectionListener(new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent e) {
                String pImg="";int si;
                String pData="";
                si=jlst1.getSelectedIndex();
                if(si==0)
                {
                    pImg="C:\\Users\\visha\\Pictures\\sun.jpg";
                    pData="Welcome to sun";
                }
                else if(si==1)
                {
                    pImg="C:\\Users\\visha\\Pictures\\mercury.jpg";
                    pData="Welcome to Mercury";
                }
                else if(si==2)
                {
                    pImg="C:\\Users\\visha\\Pictures\\venus.jpg";
                    pData="Welcome to Venus";
                }
                else if(si==3)
                {
                    pImg="C:\\Users\\visha\\Pictures\\earth.jpg";
                    pData="Welcome to Earth";
                }
                else if(si==4)
                {
                    pImg="C:\\Users\\visha\\Pictures\\mars.jpg";
                    pData="Welcome to Mars";
                }
                else if(si==5)
                {
                    pImg="C:\\Users\\visha\\Pictures\\jupiter.jpg";
                    pData="Welcome to Jupiter";
                }
                else if(si==6)
                {
                    pImg="C:\\Users\\visha\\Pictures\\saturn.jpg";
                    pData="Welcome to Saturn";
                }
                else if(si==7)
                {
                    pImg="C:\\Users\\visha\\Pictures\\uranus.jpg";
                    pData="Welcome to Uranus";
                }
                else if(si==8)
                {
                    pImg="C:\\Users\\visha\\Pictures\\neptune.jpg";
                    pData="Welcome to Neptune";
                }
                else
                {
                    pImg="C:\\Users\\visha\\Pictures\\pluto.jpg";
                    pData="Welcome to Pluto";
                }
                jl1.setIcon(new ImageIcon(pImg));
                jta1.setText(pData);
                
            }
        });
    }
    public static void main(String args[])
    {
        JSplitPaneDemo jspd=new JSplitPaneDemo();
        jspd.setSize(300, 300);
        jspd.setVisible(true);
        jspd.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
    
}
