package sort.Bubble.Test;

import sort.Bubble.BubbleSort.Bubble;

import java.util.Arrays;

public class TestBubble {
    public static void main(String[] args) {
        Integer[] arr={4,5,5,6,3,2,1};
        Bubble.main(arr);

        System.out.println(Arrays.toString(arr));
    }
}
