import java.util.*;

class Task2 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();

        while(n-->0) {
            String id=s.next();
            int t=s.nextInt();

            if(t>50)
                System.out.println(id+" "+t);
        }
    }
}