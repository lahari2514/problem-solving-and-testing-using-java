import java.util.*;

class Task7 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        HashMap<String,Integer> m=new HashMap<>();

        int n=s.nextInt();

        while(n-->0) {
            String x=s.next();
            m.put(x,m.getOrDefault(x,0)+1);
        }

        for(String x:m.keySet())
            System.out.println(x+" "+m.get(x));
    }
}