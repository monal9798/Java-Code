/* Java String

Strings are used for storing text.

A String variable contains a collection of characters surrounded by double quotes:

A String in Java is actually an object, which contain methods that can perform certain operations on strings. For example, the length of a string can be found with the length() method:

Finding a Character in a String
The indexOf() method returns the index (the position) of the first occurrence of a specified text in a string (including whitespace):
The + operator can be used between strings to combine them. This is called concatenation:
You can also use the concat() method to concatenate two strings:
Because strings must be written within quotes, Java will misunderstand this string, and generate an error:

String txt = "We are the so-called "Vikings" from the north.";
The solution to avoid this problem, is to use the backslash escape character.

The backslash (\) escape character turns special characters into string characters:

Escape character	Result	Description
\'	'	Single quote
\"	"	Double quote
\\	\	Backslash
The sequence \"  inserts a double quote in a string:
Six other escape sequences are valid in Java:

   Code	Result	
	\n	New Line	
	\r	Carriage Return	
	\t	Tab	
	\b	Backspace	
	\f	Form Feed

*/

class Program5{
	public static void main(String[] args){
		//Create a variable of type String and assign it a value:
		String greeting = "Hello";
		String txt = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		System.out.println("The length of the txt string is: " + txt.length());
		txt = "Hello World";
		System.out.println(txt.toUpperCase());   // Outputs "HELLO WORLD"
		System.out.println(txt.toLowerCase());   // Outputs "hello world"
		txt = "Please locate where 'locate' occurs!";
		System.out.println(txt.indexOf("locate")); // Outputs 7

		String firstName = "John";
		String lastName = "Doe";
		System.out.println(firstName + " " + lastName);

		firstName = "John ";
		lastName = "Doe";
		System.out.println(firstName.concat(lastName));

		txt = "We are the so-called \"Vikings\" from the north.";
		System.out.println(txt);
		txt = "It\'s alright.";
		System.out.println(txt);
		txt = "The character \\ is called backslash.";
		System.out.println(txt);
	}
}