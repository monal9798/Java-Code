/*Java Swing tutorial is a part of Java Foundation Classes (JFC) that is used to create window-based applications. It is built on the top of AWT (Abstract Windowing Toolkit) API and entirely written in java.

Unlike AWT, Java Swing provides platform-independent and lightweight components.

The javax.swing package provides classes for java swing API such as JButton, JTextField, JTextArea, JRadioButton, JCheckbox, JMenu, JColorChooser etc.
Commonly used Methods of Component class
The methods of Component class are widely used in java swing that are given below.

Method	Description
public void add(Component c)	add a component on another component.
public void setSize(int width,int height)	sets size of the component.
public void setLayout(LayoutManager m)	sets the layout manager for the component.
public void setVisible(boolean b)	sets the visibility of the component. It is by default false.
Java Swing Examples
There are two ways to create a frame:

By creating the object of Frame class (association)
By extending Frame class (inheritance)
We can write the code of swing inside the main(), constructor or any other method.
*/
/*
import javax.swing.*;  
public class Java_Swing1 {  
public static void main(String[] args) {  
JFrame f=new JFrame();//creating instance of JFrame  
          
JButton b=new JButton("click");//creating instance of JButton  
b.setBounds(130,100,100, 40);//x axis, y axis, width, height  
          
f.add(b);//adding button in JFrame  
          
f.setSize(400,500);//400 width and 500 height  
f.setLayout(null);//using no layout managers  
f.setVisible(true);//making the frame visible  
}  
}  

*/
/*Example of Swing by Association inside constructor
We can also write all the codes of creating JFrame, JButton and method call inside the java constructor.
import javax.swing.*;
public class Java_Swing1 {  
JFrame f;  
Java_Swing1(){  
f=new JFrame();//creating instance of JFrame  
          
JButton b=new JButton("click");//creating instance of JButton  
b.setBounds(130,100,100, 40);  
          
f.add(b);//adding button in JFrame  
          
f.setSize(400,500);//400 width and 500 height  
f.setLayout(null);//using no layout managers  
f.setVisible(true);//making the frame visible  
}  
  
public static void main(String[] args) {  
new Java_Swing1();  
}  
}  
*/

/*Simple example of Swing by inheritance
We can also inherit the JFrame class, so there is no need to create the instance of JFrame class explicitly.*/
import javax.swing.*;  
public class Java_Swing1 extends JFrame{//inheriting JFrame  
JFrame f;  
Java_Swing1(){  
JButton b=new JButton("click");//create button  
b.setBounds(130,100,100, 40);  
          
add(b);//adding button on frame  
setSize(400,500);  
setLayout(null);  
setVisible(true);  
}  
public static void main(String[] args) {  
new Java_Swing1();  
}}  