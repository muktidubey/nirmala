package program;

public class Implementation  implements Calculations  {

    public int add(int a, int b) {
        return a + b;
    }

    public static void main(String[] args) {
    	Calculations calc = new Implementation();
        System.out.println("Add: " + calc.add(10, 5));
        System.out.println("Subtract: " + Calculations.subtract(10, 5));//static method
        System.out.println("Multiply: " + calc.multiply(10, 5));//default methodj
    }
}
