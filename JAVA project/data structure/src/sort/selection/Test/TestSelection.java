package sort.selection.Test;


import sort.selection.Selection.Selection;

import java.util.Arrays;

public class TestSelection {
    public static void main(String[] args) {
        Integer[] arr={4,3,7,8,3,2,1};
        Selection.main(arr);

        System.out.println(Arrays.toString(arr));
    }
}
