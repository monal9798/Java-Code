public class Program20 {
  int x;

  public Program20(int y) {
    x = y;
  }

  int modelYear;
  String modelName;

  public Program20(int year, String name) {
    modelYear = year;
    modelName = name;
  }

  public static void main(String[] args) {
    Program20 myObj = new Program20(5);
    System.out.println(myObj.x);
    Program20 myCar = new Program20(1969, "Mustang");
    System.out.println(myCar.modelYear + " " + myCar.modelName);
  }
}