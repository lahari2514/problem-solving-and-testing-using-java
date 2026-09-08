import java.util.*;

class Calculator {

    int add(int a, int b) {
        return a + b;
    }

    int divide(int a, int b) {
        if (b == 0)
            throw new ArithmeticException();
        return a / b;
    }
}

public class Task9 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String input = sc.nextLine().replaceAll("\\s+", "");

        Calculator calc = new Calculator();

        try {
            int a, b, result;

            if (input.contains("+")) {
                String[] parts = input.split("\\+");
                a = Integer.parseInt(parts[0]);
                b = Integer.parseInt(parts[1]);

                result = calc.add(a, b);

                if (result == a + b)
                    System.out.println("Test Passed");
                else
                    System.out.println("Test Failed");

            } else if (input.contains("/")) {
                String[] parts = input.split("/");
                a = Integer.parseInt(parts[0]);
                b = Integer.parseInt(parts[1]);

                result = calc.divide(a, b);

                if (result == a / b)
                    System.out.println("Test Passed");
                else
                    System.out.println("Test Failed");

            } else {
                System.out.println("Test Failed");
            }

        } catch (Exception e) {
            System.out.println("Test Failed");
        }

        sc.close();
    }
}