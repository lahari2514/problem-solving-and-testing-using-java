import java.util.*;

class Task6 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        String v = s.next();
        int d = s.nextInt();

        if(v.equals("Bike"))
            System.out.println(d * 5);
        else
            System.out.println(d * 12);
    }
}