/**
 * JavaFunc
 */
public class JavaFunc {

    public static int multiply(int a, int b) {
        int c = a * b;
        return c;
    }
    
    public static void swap(int a, int b) {    // Call by value (Value of actual parameters will not be modified)
        int temp = a;
        a = b;
        b = temp;
    }
    
    public static int factorial(int n) {
        int f = 1;
        for (int i = 1; i <= n; i++) {
            f = f * i;
        }
        return f;
    }
    
    public static int binomialCoefficient(int n, int r) {
        int bc = factorial(n) / (factorial(n-r) * factorial(r));
        return bc;
    }

    // Function Overloading
    // Function to calculate sum of two numbers
    public static int sum(int a, int b) {
        int c = a + b;
        return c;
    }
    // Function to calculate sum of three numbers
    public static int sum(int a, int b, int c) {
        int d = a + b + c;
        return d;
    }
    // Function to calculate sum of three float numbers
    public static float sum(float a, float b, float c) {
        float d = a + b + c;
        return d;
    }

    // Optimized Approach to check Prime no.
    public static boolean isPrime(int n) {
        // Cornercase
        if (n == 2) {
            return true;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    // Print all prime numbers in a range
    public static void primeInRange(int n) {
        for (int i = 2; i <= n; i++) {
            if (isPrime(i) == true) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }

    //Binary to decimal
    public static int binToDec(int n) {
        int binNum = n;
        int decNum = 0;
        int power = 0;
        while (binNum > 0) {
            int lastDigit = binNum % 10;
            decNum = decNum + ((int)Math.pow(2, power) * lastDigit);
            binNum = binNum / 10;
            power++;
        }
        return decNum;
    }

    // Decimal to Binary
    public static int decToBin(int n) {
        int binNum = 0;
        int pow = 0;
        int decNum = n;
        while (decNum > 0) {
            int remainder = decNum % 2;
            binNum = binNum + remainder * (int)Math.pow(10, pow);
            decNum = decNum / 2;
            pow++;
        }
        return binNum;
    }
    
    public static void main(String[] args) {

        System.out.println(multiply(5, 4));
        System.out.println(factorial(4));
        int bc = binomialCoefficient(10, 2);
        System.out.println(bc);
        System.out.println(sum(4, 6));
        System.out.println(sum(4, 6, 8));
        primeInRange(10);
        System.out.println(binToDec(101));
        System.out.println(decToBin(11));
    }
}