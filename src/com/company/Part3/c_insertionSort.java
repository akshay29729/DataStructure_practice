package com.company.Part3;

public class c_insertionSort {
    public void sort(int[] numbers){
        for (int i=1;i<numbers.length;i++){
            int current = numbers[i];
            int j=i-1;
            while (j>=0 && numbers[j]>current){
                numbers[j+1]=numbers[j];
                j--;
            }
            numbers[j+1]=current;
        }
    }
}
