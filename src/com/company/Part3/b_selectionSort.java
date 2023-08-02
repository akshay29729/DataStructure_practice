package com.company.Part3;

public class b_selectionSort {
    public void sort(int[] numbers){
        for (int i=0;i<numbers.length;i++){
            for (int j=i+1;j<numbers.length;j++){
                if (numbers[j]<numbers[i]){
                    swapping(numbers,i,j);
                }
            }
        }
    }
    private void swapping(int[] numbers,int index1,int index2){
        int temp = numbers[index1];
        numbers[index1]= numbers[index2];
        numbers[index2]=temp;
    }
}
