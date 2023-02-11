public class Generate_parenthesis {
    public static void main(String[] args) {
        paren(3, "", 0, 0);
        System.out.println(c);
    }
    static int c=0;
    public static void paren(int n,String ans,int open, int close) {
        if(open==n && close==n){
            System.out.print(ans+" ");
            c++;
            return;
        }
        if(open<n){
            paren(n, ans+"(", open+1, close);
        }
        if(close<open){
            paren(n, ans+")", open, close+1);
        }
        
    }
}
