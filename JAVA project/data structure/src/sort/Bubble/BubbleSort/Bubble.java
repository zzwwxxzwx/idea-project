package sort.Bubble.BubbleSort;

public class Bubble {
    public static void main(Comparable[] a) {
        for(int i=0;i<a.length;i++){
            for (int j =0;j<a.length-i-1;j++){
                if (greater(a[j],a[j+1])){
                    exch(a,j,j+1);
                }
            }
        }

    }

    private static boolean greater(Comparable v, Comparable w){
        return v.compareTo(w)>0;
    }

    private static void exch(Comparable[] a, int i, int j){//交换i和j
        Comparable temp;
        temp = a[i];
        a[i]= a[j];
        a[j]=temp;
    }
}
