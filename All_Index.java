                        // All Indixes of an array
import java.util.*;
public class All_Index {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int target=sc.nextInt();
        al_index(arr, target, 0);
        sc.close();
    }
    public static void al_index(int arr[],int target,int i) {
        if(i==arr.length){
            return;
        }
        if(arr[i]==target){
            System.out.print(i+"  ");
        }
        al_index(arr, target, i+1);
    }
}
