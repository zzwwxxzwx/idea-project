package sort.selection.Selection;

public class Selection {
    public static void main(Comparable[] a) {
        for (int i = 0; i < a.length-1; i++) {//最后一次不用比较,黑马方法
            int minIndex = i;
            for (int j = i + 1; j < a.length; j++) {
                if (greater(a[minIndex], a[j])) {//比较n^2/2+n/2-1次
                    minIndex = j;
                }
            }
            exch(a, i, minIndex);//交换n次
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
