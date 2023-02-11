                            // fibnacii series
import java .util.*;
public class Fibnacci {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int f=fibo(n);
        System.out.println();
        System.out.println(f);
        
        sc.close();
        
    }
    public static int fibo(int n) {
        if(n==1){
            return 0;
        }
        if(n==2){
            return 1;
        }
        System.out.print(n+" ");
        return fibo(n-2)+fibo(n-1);
        
    }
}
