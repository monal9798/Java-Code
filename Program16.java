/* Java is an object-oriented programming language.

Everything in Java is associated with classes and objects, along with its attributes and methods. For example: in real life, a car is an object. The car has attributes, such as weight and color, and methods, such as drive and brake.

A Class is like an object constructor, or a "blueprint" for creating objects.
Create a Class
To create a class, use the keyword class:

Create an Object
In Java, an object is created from a class. We have already created the class named Main, so now we can use this to create objects.

To create an object of Main, specify the class name, followed by the object name, and use the keyword new:

*/

public class Program16{
  int x = 5;

  public static void main(String[] args) {
    Program16 myObj = new Program16();
    System.out.println(myObj.x);
  }
}