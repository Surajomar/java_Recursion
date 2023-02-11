public class Box_queen {
    public static void main(String[] args) {
        boolean box[]=new boolean[4];
        qplace(box,4, 2, 0, "");
        qplace2(box,4, 2, 0, "",0);
    }
    public static void qplace(boolean box[],int nb,int nq,int q,String ans) {
        if(q==nq){
            System.out.println(ans);
            return;
        }
        if(q>nq){
            return;
        }
        for(int i=0;i<nb;i++){
            if(box[i]==false){
                box[i]=true;
                qplace(box,nb, nq, q+1, ans+"q"+i);
                box[i]=false;
            }
            
        }
    }
    public static void qplace2(boolean box[],int nb,int nq,int q,String ans,int idx) {
        if(q==nq){
            System.out.println(ans);
            return;
        }
        if(q>nq){
            return;
        }
        for(int i=idx;i<nb;i++){
            if(box[i]==false){
                box[i]=true;
                qplace2(box,nb, nq, q+1, ans+"q"+i,i+1);
                box[i]=false;
            }
            
        }
    }
}
