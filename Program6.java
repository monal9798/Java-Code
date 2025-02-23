/*
	Java Conditions and if Statments

	Java supports the usual logical conditions from mathematics:

	Less than: a < b
	Less than or equal to: a <= b
	Greater than: a > b
	Greater than or equal to: a >= b
	Equal to a == b
	Not Equal to: a != b
	You can use these conditions to perform different actions for different decisions.

	Java has the following conditional statements:

	Use if to specify a block of code to be executed, if a specified condition is true
	Use else to specify a block of code to be executed, if the same condition is false
	Use else if to specify a new condition to test, if the first condition is false
	Use switch to specify many alternative blocks of code to be executed

	There is also a short-hand if else, which is known as the ternary operator because it consists of three operands. It can be used to replace multiple lines of code with a single line. It is often used to replace simple if else statements:

	Syntax
	variable = (condition) ? expressionTrue :  expressionFalse;

*/
class Program6{
	public static void main(String[] args){
		int x = 20;
		int y = 18;

		if(x>y){
			System.out.println("x is greater than y");
		} 

		int time =20;
		if (time <18) {
			System.out.println("Good Day");
		}
		else{
			System.out.println("Good Evening");
		}

		time = 22;
		if (time < 10) {
		  System.out.println("Good morning.");
		} else if (time < 20) {
		  System.out.println("Good day.");
		} else {
		  System.out.println("Good evening.");
		}

		time = 20;
		String result = (time < 18) ? "Good day." : "Good evening.";
		System.out.println(result);
	}
}