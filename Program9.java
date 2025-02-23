/* Java Break and Continue
	You have already seen the break statement used in an earlier chapter of this tutorial. It was used to "jump out" of a switch statement.
	The break statement can also be used to jump out of a loop.
	This example stops the loop when i is equal to 4:

	The continue statement breaks one iteration (in the loop), if a specified condition occurs, and continues with the next iteration in the loop.

	This example skips the value of 4:

*/


class Program9{
	public static void main(String[] args){
		for (int i = 0; i < 10; i++) {
		  if (i == 4) {
		    break;
		  }
		  System.out.println(i);
		}

		for (int i = 0; i < 10; i++) {
		  if (i == 4) {
		    continue;
		  }
		  System.out.println(i);
		}
	}
}