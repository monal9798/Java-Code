/*Java JTextField
The object of a JTextField class is a text component that allows the editing of a single line text. It inherits JTextComponent class.

JTextField class declaration
Let's see the declaration for javax.swing.JTextField class.

public class JTextField extends JTextComponent implements SwingConstants  
Commonly used Constructors:
Constructor Description
JTextField()    Creates a new TextField
JTextField(String text) Creates a new TextField initialized with the specified text.
JTextField(String text, int columns)    Creates a new TextField initialized with the specified text and columns.
JTextField(int columns) Creates a new empty TextField with the specified number of columns.
Commonly used Methods:
Methods Description
void addActionListener(ActionListener l)    It is used to add the specified action listener to receive action events from this textfield.
Action getAction()  It returns the currently set Action for this ActionEvent source, or null if no Action is set.
void setFont(Font f)    It is used to set the current font.
void removeActionListener(ActionListener l) It is used to remove the specified action listener so that it no longer receives action events from this textfield.
*/

/*import javax.swing.*;  
class Java_Swing4_JTextField  
{  
public static void main(String args[])  
    {  
    JFrame f= new JFrame("TextField Example");  
    JTextField t1,t2;  
    t1=new JTextField("Welcome to Javatpoint.");  
    t1.setBounds(50,100, 200,30);  
    t2=new JTextField("AWT Tutorial");  
    t2.setBounds(50,150, 200,30);  
    f.add(t1); f.add(t2);  
    f.setSize(400,400);  
    f.setLayout(null);  
    f.setVisible(true);  
    }  
    } 
*/

import javax.swing.*;  
import java.awt.event.*;  
public class Java_Swing4_JTextField implements ActionListener{  
    JTextField tf1,tf2,tf3;  
    JButton b1,b2;  
    Java_Swing4_JTextField(){  
        JFrame f= new JFrame();  
        tf1=new JTextField();  
        tf1.setBounds(50,50,150,20);  
        tf2=new JTextField();  
        tf2.setBounds(50,100,150,20);  
        tf3=new JTextField();  
        tf3.setBounds(50,150,150,20);  
        tf3.setEditable(false);   
        b1=new JButton("+");  
        b1.setBounds(50,200,50,50);  
        b2=new JButton("-");  
        b2.setBounds(120,200,50,50);  
        b1.addActionListener(this);  
        b2.addActionListener(this);  
        f.add(tf1);f.add(tf2);f.add(tf3);f.add(b1);f.add(b2);  
        f.setSize(300,300);  
        f.setLayout(null);  
        f.setVisible(true);  
    }         
    public void actionPerformed(ActionEvent e) {  
        String s1=tf1.getText();  
        String s2=tf2.getText();  
        int a=Integer.parseInt(s1);  
        int b=Integer.parseInt(s2);  
        int c=0;  
        if(e.getSource()==b1){  
            c=a+b;  
        }else if(e.getSource()==b2){  
            c=a-b;  
        }  
        String result=String.valueOf(c);  
        tf3.setText(result);  
    }  
public static void main(String[] args) {  
    new Java_Swing4_JTextField();  
} }      
