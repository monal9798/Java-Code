/*The object of a JTextArea class is a multi line region that displays text. It allows the editing of multiple line text. It inherits JTextComponent class

JTextArea class declaration
Let's see the declaration for javax.swing.JTextArea class.

public class JTextArea extends JTextComponent  
Commonly used Constructors:
Constructor Description
JTextArea() Creates a text area that displays no text initially.
JTextArea(String s) Creates a text area that displays specified text initially.
JTextArea(int row, int column)  Creates a text area with the specified number of rows and columns that displays no text initially.
JTextArea(String s, int row, int column)    Creates a text area with the specified number of rows and columns that displays specified text.
Commonly used Methods:
Methods Description
void setRows(int rows)  It is used to set specified number of rows.
void setColumns(int cols)   It is used to set specified number of columns.
void setFont(Font f)    It is used to set the specified font.
void insert(String s, int position) It is used to insert the specified text on the specified position.
void append(String s)   It is used to append the given text to the end of the document.

*/

/*import javax.swing.*;  
public class Java_Swing5_JTextArea  
{  
     Java_Swing5_JTextArea(){  
        JFrame f= new JFrame();  
        JTextArea area=new JTextArea("Welcome to javatpoint");  
        area.setBounds(10,30, 200,200);  
        f.add(area);  
        f.setSize(300,300);  
        f.setLayout(null);  
        f.setVisible(true);  
     }  
public static void main(String args[])  
    {  
   new Java_Swing5_JTextArea();  
    }}  
*/


import javax.swing.*;  
import java.awt.event.*;  
public class Java_Swing5_JTextArea implements ActionListener{  
JLabel l1,l2;  
JTextArea area;  
JButton b;  
Java_Swing5_JTextArea() {  
    JFrame f= new JFrame();  
    l1=new JLabel();  
    l1.setBounds(50,25,100,30);  
    l2=new JLabel();  
    l2.setBounds(160,25,100,30);  
    area=new JTextArea();  
    area.setBounds(20,75,250,200);  
    b=new JButton("Count Words");  
    b.setBounds(100,300,120,30);  
    b.addActionListener(this);  
    f.add(l1);f.add(l2);f.add(area);f.add(b);  
    f.setSize(450,450);  
    f.setLayout(null);  
    f.setVisible(true);  
}  
public void actionPerformed(ActionEvent e){  
    String text=area.getText();  
    String words[]=text.split("\\s");  
    l1.setText("Words: "+words.length);  
    l2.setText("Characters: "+text.length());  
}  
public static void main(String[] args) {  
    new Java_Swing5_JTextArea();  
}  
}  