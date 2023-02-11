public class Coins_Toss {
    public static void main(String[] args) {
        int n=3;
        pobability(n, "");
    }
    public static void pobability(int n, String ans) {
        if(n==0){
            System.out.print(ans+" ");
            return;
        }
        pobability(n-1, ans+"H");
        pobability(n-1, ans+"T");
    }
}
