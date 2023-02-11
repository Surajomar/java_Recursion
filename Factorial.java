                            // sum of n digits and factorial of n
import java.util.*;
public class Factorial {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int f=fact(n);
        int s=sum(n);
        System.out.println("factorial is "+f+ " and sum is "+s);
        sc.close();
    }
    public static int fact(int n) {
        if(n==0){
            return 1;
        }
        return n*fact(n-1);
    }

    public static int sum(int n) {
        
        if(n==0){
            return 0;
        }
        return n+sum(n-1);
    }
}
