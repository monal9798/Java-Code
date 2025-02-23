/*
  Java HashSet
A HashSet is a collection of items where every item is unique, and it is found in the java.util package:
The HashSet class has many useful methods. For example, to add items to it, use the add() method:
To check whether an item exists in a HashSet, use the contains() method: cars.contains("Mazda");
To remove an item, use the remove() method: cars.remove("Volvo");
To remove all items, use the clear() method: cars.clear();
To find out how many items there are, use the size method: cars.size();
*/


// Import the HashSet class
import java.util.HashSet;

public class Program35 {
  public static void main(String[] args) {
    HashSet<String> cars = new HashSet<String>(); //Create a HashSet object called cars that will store strings:
    cars.add("Volvo");
    cars.add("BMW");
    cars.add("Ford");
    cars.add("BMW");
    cars.add("Mazda");
    System.out.println(cars);
    System.out.println(cars.size()); // Output 4
    System.out.println(cars.contains("Mazda")); // Output true
    cars.remove("Volvo");
    cars.clear();
    System.out.println(cars);
  }
}