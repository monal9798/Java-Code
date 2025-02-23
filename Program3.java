/*Java Data Types 
Data types are divided into two groups:

Primitive data types - includes byte, short, int, long, float, double, boolean and char
Non-primitive data types - such as String, Arrays and Classes

Primitive number types are divided into two groups:

Integer types stores whole numbers, positive or negative (such as 123 or -456), without decimals. Valid types are byte, short, int and long. Which type you should use, depends on the numeric value.

Floating point types represents numbers with a fractional part, containing one or more decimals. There are two types: float and double.

*/

class Program3{
	public static void main(String[] args){
		byte myNum = 100;
		short myNum1 = 5000;
		int myNum2 = 10000;
		long myNum3 = 15000000000L;
		float myNum4 = 5.75f;
		double myNum5 = 19.99d;
		boolean isJavaFun = true;
		boolean isFishTasty = false;

		System.out.println(myNum);
		System.out.println(myNum1);
		System.out.println(myNum2);
		System.out.println(myNum3);
		System.out.println(myNum4);
		System.out.println(myNum5);
		System.out.println(isJavaFun);     // Outputs true
		System.out.println(isFishTasty);
	}
}