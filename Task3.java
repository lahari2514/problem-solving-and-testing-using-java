import java.util.*;

class Task3 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt(),sum=0,max=0;

        while(n-->0) {
            sum+=s.nextInt();
            if(sum<0) sum=0;
            if(sum>max) max=sum;
        }

        System.out.println(max);
    }
}