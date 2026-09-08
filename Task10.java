import java.util.*;

class Task10 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();

        while(n-->0) {
            String u=s.next(),p=s.next();

            if(u.equals("admin") && p.equals("admin123"))
                System.out.println("SUCCESS");
            else
                System.out.println("FAILURE");
        }
    }
}