/*The object of JLabel class is a component for placing text in a container. It is used to display a single line of read only text. The text can be changed by an application but a user cannot edit it directly. It inherits JComponent class.

JLabel class declaration
Let's see the declaration for javax.swing.JLabel class.

public class JLabel extends JComponent implements SwingConstants, Accessible 

*/

/*import javax.swing.*;  
class Java_Swing3_JLabel  
{  
public static void main(String args[])  
    {  
    JFrame f= new JFrame("Label Example");  
    JLabel l1,l2;  
    l1=new JLabel("First Label.");  
    l1.setBounds(50,50, 100,30);  
    l2=new JLabel("Second Label.");  
    l2.setBounds(50,100, 100,30);  
    f.add(l1); f.add(l2);  
    f.setSize(300,300);  
    f.setLayout(null);  
    f.setVisible(true);  
    }  
    }  

*/

/*Java JLabel Example with ActionListener*/
import javax.swing.*;  
import java.awt.*;  
import java.awt.event.*;  
public class Java_Swing3_JLabel extends Frame implements ActionListener{  
    JTextField tf; JLabel l; JButton b;  
    Java_Swing3_JLabel(){  
        tf=new JTextField();  
        tf.setBounds(50,50, 150,20);  
        l=new JLabel();  
        l.setBounds(50,100, 250,20);      
        b=new JButton("Find IP");  
        b.setBounds(50,150,95,30);  
        b.addActionListener(this);    
        add(b);add(tf);add(l);    
        setSize(400,400);  
        setLayout(null);  
        setVisible(true);  
    }  
    public void actionPerformed(ActionEvent e) {  
        try{  
        String host=tf.getText();  
        String ip=java.net.InetAddress.getByName(host).getHostAddress();  
        l.setText("IP of "+host+" is: "+ip);  
        }catch(Exception ex){System.out.println(ex);}  
    }  
    public static void main(String[] args) {  
        new Java_Swing3_JLabel();  
    } }  