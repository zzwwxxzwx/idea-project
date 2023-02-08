package AdvancedSort.Shell.shellsort;

public class Shell {
    public static void main(Comparable[] a) {
        //说明
        //逻辑原理：10个数字分5组每组先排序，然后分2组排序，最后总体排一次序
//        int h=1
//        while(h<5){
//            h=2h+1；//3,7
//        }
//      //循环结束后我们就可以确定h的最大值；
//        h的减小规则为：
//        h=h/2 //向下取整
        //1、根据数组a.length确定增长量h的初始值
        int h = 1;
        while(h<a.length/2){
            h=2*h+1;
        }
        //2、希尔排序
        while (h>=1){
            //排序
            //2.1找到待插入的元素
            for(int i=h;i<a.length;i++){
                //2.2插入到有序数列中
                for (int j = i ;j>=h;j-=h){
                    //待插入的是a[j]比较a[j]和a[j-h]
                    if (greater(a[j-h],a[j])){
                        //交换元素
                        exch(a,j-h,j);
                    }else{
                        //已找到合适插入位置
                        break;
                    }

                }
            }


            //减小h的值
            h=h/2;
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
