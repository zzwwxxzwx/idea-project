package AdvancedSort.Shell.test;

import AdvancedSort.Shell.shellsort.Shell;

import java.util.Arrays;

public class TestInShell {
    public static void main(String[] args) {//采用事后计算法
        Integer[] arr={9,1,2,5,7,4,8,6,3,5};
        Shell.main(arr);
        System.out.println(Arrays.toString(arr));

    }
}
