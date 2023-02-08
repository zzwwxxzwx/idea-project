package AdvancedSort.Shell.shellsort;

public class Insertion {
    public static void main(Comparable[] a) {
        for(int i = 1;i< a.length;i++){//从第二个元素开始
            for(int j = i;j>0;j--){
                if (greater(a[j-1],a[j])){//比较次数n^2/2-n/2
                    exch(a,j-1,j);//交换次数n^2/2-n/2
                }else {
                    break;
                }
            }
        }
    }

    private static boolean greater(Comparable v, Comparable w) {
        return v.compareTo(w) > 0;
    }

    private static void exch(Comparable[] a, int i, int j){
        Comparable temp;
        temp = a[i];
        a[i]= a[j];
        a[j]=temp;
    }
}
