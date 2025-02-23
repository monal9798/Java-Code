/*Java JButton Example with ActionListener
import java.awt.event.*;  
import javax.swing.*;    
public class Java_Swing2_JButton {  
public static void main(String[] args) {  
    JFrame f=new JFrame("Button Example");  
    final JTextField tf=new JTextField();  
    tf.setBounds(50,50, 150,20);  
    JButton b=new JButton("Click Here");  
    b.setBounds(50,100,95,30);  
    b.addActionListener(new ActionListener(){  
public void actionPerformed(ActionEvent e){  
            tf.setText("Welcome to Javatpoint.");  
        }  
    });  
    f.add(b);f.add(tf);  
    f.setSize(400,400);  
    f.setLayout(null);  
    f.setVisible(true);   
}  
} */ 

/*Example of displaying image on the button:*/
import javax.swing.*;      
public class Java_Swing2_JButton{    
Java_Swing2_JButton(){    
JFrame f=new JFrame("Button Example");            
JButton b=new JButton(new ImageIcon("D:\\Java Programs\\click.png"));    
b.setBounds(100,100,100, 40);    
f.add(b);    
f.setSize(300,400);    
f.setLayout(null);    
f.setVisible(true);    
f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);    
    }         
public static void main(String[] args) {    
    new Java_Swing2_JButton();    
}    
}    