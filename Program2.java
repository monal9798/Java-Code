/* Java Variables

Variables are containers for storing data values.

In Java, there are different types of variables, for example:

String - stores text, such as "Hello". String values are surrounded by double quotes
int - stores integers (whole numbers), without decimals, such as 123 or -123
float - stores floating point numbers, with decimals, such as 19.99 or -19.99
char - stores single characters, such as 'a' or 'B'. Char values are surrounded by single quotes
boolean - stores values with two states: true or false

To create a variable, you must specify the type and assign it a value:

Syntax
type variableName = value;

Final Variables
However, you can add the final keyword if you don't want others (or yourself) to overwrite existing values (this will declare the variable as "final" or "constant", which means unchangeable and read-only):

Example
final int myNum = 15;
myNum = 20;  // will generate an error: cannot assign a value to a final variable

 */

class Program2{
	public static void main(String[] args){
		String name ="Monal";
		int myNum = 15;
		float myFloatNum = 5.99f;
		char myLetter = 'D';
		boolean myBool = true;
		System.out.println("Hello " + name);
		System.out.println(myNum);
		System.out.println(myFloatNum);
		System.out.println(myLetter);
		System.out.println(myBool);
	}
}