/*Java Iterator
An Iterator is an object that can be used to loop through collections, like ArrayList and HashSet. It is called an "iterator" because "iterating" is the technical term for looping.

To use an Iterator, you must import it from the java.util package
The iterator() method can be used to get an Iterator for any collection:
Looping Through a Collection
To loop through a collection, use the hasNext() and next() methods of the Iterator:
Removing Items from a Collection
Iterators are designed to easily change the collections that they loop through. The remove() method can remove items from a collection while looping.
*/

// Import the ArrayList class and the Iterator class
import java.util.ArrayList;
import java.util.Iterator;

public class Program36 {
  public static void main(String[] args) {

    // Make a collection
    ArrayList<String> cars = new ArrayList<String>();
    cars.add("Volvo");
    cars.add("BMW");
    cars.add("Ford");
    cars.add("Mazda");

    // Get the iterator
    Iterator<String> it = cars.iterator();

    // Print the first item
    System.out.println(it.next());

     // Loop through a collection
    while(it.hasNext()) {
      System.out.println(it.next());
    }

    ArrayList<Integer> numbers = new ArrayList<Integer>();
    numbers.add(12);
    numbers.add(8);
    numbers.add(2);
    numbers.add(23);
    Iterator<Integer> itt = numbers.iterator();
    while(itt.hasNext()) {
      Integer i = itt.next();
      if(i < 10) {
        itt.remove();
      }
    }
    System.out.println(numbers);
  }
}