import java.util.*;

class Task4 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);

        String a=s.nextLine();
        String b=s.nextLine();

        for(int i=0;i<=a.length()-b.length();i++)
            if(a.substring(i,i+b.length()).equals(b))
                System.out.print(i+" ");
    }
}