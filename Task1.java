import java.util.*;

class Task1{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for(int i = 0; i < n; i++) {
            int salary = sc.nextInt();
            salary = salary + salary * 10 / 100;
            System.out.print(salary + " ");
        }
    }
}