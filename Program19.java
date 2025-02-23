/*Java Constructors

A constructor in Java is a special method that is used to initialize objects. The constructor is called when an object of a class is created. It can be used to set initial values for object attributes:
Constructor Parameters
Constructors can also take parameters, which is used to initialize attributes.

*/

// Create a Main class
public class Program19 {
  int x;  // Create a class attribute

  // Create a class constructor for the Main class
  public Program19() {
    x = 5;  // Set the initial value for the class attribute x
  }

  public static void main(String[] args) {
    Program19 myObj = new Program19(); // Create an object of class Main (This will call the constructor)
    System.out.println(myObj.x); // Print the value of x
  }
}