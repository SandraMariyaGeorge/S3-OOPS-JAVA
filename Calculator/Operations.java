//Create a package named Calculator, that constitutes class Operations with member functions to Perform addition,
//multiplication subtraction and division of 2 numbers. Create another java file MyCalculator.java;
//that accepts input from user and performs the operations in a Menu Driven
package Calculator;

public class Operations {
    int z;

    public void add(int x, int y) {
        z = x + y;
        System.out.println("Sum is " + z);
    }

    public void sub(int x, int y) {
        z = x - y;
        System.out.println("Difference is " + z);
    }

    public void multi(int x, int y) {
        z = x * y;
        System.out.println("Product is " + z);
    }

    public void div(int x, int y) {
        z = x / y;
        System.out.println(x + "/" + y + " is " + z);
    }
}