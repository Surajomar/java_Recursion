                                        // coins toss when do H sath mein na aayes
public class Coins_Toss2 {
    
    public static void main(String[] args) {
        int n=3;
        pobability(n, "");
    }
    public static void pobability(int n, String ans) {
        if(n==0){
            System.out.print(ans+" ");
            return;
        }
        if(ans.length()==0 || ans.charAt(ans.length()-1)!='H')
        pobability(n-1, ans+"H");
        pobability(n-1, ans+"T");
    }
}
