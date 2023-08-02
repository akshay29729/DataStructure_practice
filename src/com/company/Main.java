package com.company;
import com.company.Part3.*;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int[] numbers={1,2,5,3,7,8,6,4};
//        a_bubbleSort s = new a_bubbleSort();
//        b_selectionSort s = new b_selectionSort();
        c_insertionSort s = new c_insertionSort();
//        d_mergeSort s = new d_mergeSort();
        s.sort(numbers);
        System.out.println(Arrays.toString(numbers));


//        e_quickSort s = new e_quickSort();
//        s.sort(numbers,0,numbers.length-1);
//        System.out.println(Arrays.toString(numbers));
    }
}
