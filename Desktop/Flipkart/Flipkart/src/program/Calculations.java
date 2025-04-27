package program;

public interface Calculations {
	
	// Abstract method
	int add(int a, int b);

    // Default method for multiplication(complete method)
	default int multiply(int a, int b)
    {
        return a * b;
    }

    // Static method for subtraction(complete method)
    static int subtract(int a, int b)
    {
        return a - b;
    }
}
