package com.company.Part3;

public class e_quickSort {
    public void sort(int[] numbers,int low,int high){
        if(low>=high)
            return;
        // pivoting
        int pivot_index= pivoting(numbers,low,high);
        // sorting
        sort(numbers,low,pivot_index-1);
        sort(numbers,pivot_index+1,high);
    }
    private int pivoting(int[] numbers,int low,int high){
        int b = low;
        int pivot = numbers[high];
        for(int i=low;i<high;i++){
            if(numbers[i]<=pivot){
                swapping(numbers,i,b);
                b++;
            }
        }
        swapping(numbers,b,high);
        return b;
    }
    private void swapping(int[] numbers,int index1,int index2){
        int temp = numbers[index1];
        numbers[index1]=numbers[index2];
        numbers[index2]=temp;
    }
}
