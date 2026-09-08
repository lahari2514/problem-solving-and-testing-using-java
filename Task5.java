import java.util.*;

class Task5 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt(),b=0;

        while(n-->0) {
            String x=s.next();
            int a=s.nextInt();

            if(x.equals("Deposit")) b+=a;
            else b-=a;
        }

        System.out.println(b);
    }
}