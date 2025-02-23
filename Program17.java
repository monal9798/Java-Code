/*Another term for class attributes is fields.
Accessing Attributes
You can access attributes by creating an object of the class, and by using the dot syntax (.):

The following example will create an object of the Main class, with the name myObj. We use the x attribute on the object to print its value:



*/

public class Program17 {
  	int x = 5;
  	int y;

    public static void main(String[] args) {
    Program17 myObj = new Program17();
    System.out.println(myObj.x);
     myObj.y = 40;
    System.out.println(myObj.y);
     myObj.x = 25; // x is now 25
    System.out.println(myObj.x);
  }
}