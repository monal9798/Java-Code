/*In the ArrayList chapter, you learned that Arrays store items as an ordered collection, and you have to access them with an index number (int type). A HashMap however, store items in "key/value" pairs, and you can access them by an index of another type (e.g. a String).

One object is used as a key (index) to another object (value). It can store different types: String keys and Integer values, or the same type, like: String keys and String values:
The HashMap class has many useful methods. For example, to add items to it, use the put() method:
To access a value in the HashMap, use the get() method and refer to its key:
To remove an item, use the remove() method and refer to the key: capitalCities.remove("England");
To remove all items, use the clear() method: capitalCities.clear();
To find out how many items there are, use the size() method: capitalCities.size();
*/


// Import the HashMap class
import java.util.HashMap;

public class Program34 {
  public static void main(String[] args) {
    // Create a HashMap object called capitalCities
    HashMap<String, String> capitalCities = new HashMap<String, String>();

    // Add keys and values (Country, City)
    capitalCities.put("England", "London");
    capitalCities.put("Germany", "Berlin");
    capitalCities.put("Norway", "Oslo");
    capitalCities.put("USA", "Washington DC");
    System.out.println(capitalCities); // Output 4
    System.out.println(capitalCities.size());
    System.out.println(capitalCities.get("England"));
    capitalCities.remove("England");
    System.out.println(capitalCities);
    capitalCities.clear();
    System.out.println(capitalCities);
  }
}