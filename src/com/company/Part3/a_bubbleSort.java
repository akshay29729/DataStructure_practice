package com.company.Part3;

public class a_bubbleSort {
    public void sort(int[] numbers){
        // 1-general---O(n^2)
//        for (int i=0;i<numbers.length;i++){
//            for (int j=1;j<numbers.length;j++){
//                if (numbers[j]<numbers[j-1]){
//                    int temp = numbers[j];
//                    numbers[j]=numbers[j-1];
//                    numbers[j-1]=temp;
//                }
//            }
//        }

        // 2-
        boolean isSorted;
        for (int i=0;i<numbers.length;i++){
            isSorted=true;
            for (int j=1;j<numbers.length-i;j++){
                if (numbers[j]<numbers[j-1]){
                    swapping(numbers,j,j-1);
                    isSorted=false;
                }
            }
            if (isSorted)
                return;
        }
    }
    private void swapping(int[] numbers,int index1,int index2){
        int temp = numbers[index1];
        numbers[index1]= numbers[index2];
        numbers[index2]=temp;
    }
}
