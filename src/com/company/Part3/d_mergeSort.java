package com.company.Part3;

public class d_mergeSort {
    public void sort(int[] numbers){
        if (numbers.length<2)
            return;
        // Dividing array
        int middle = numbers.length/2;
        int[] left = new int[middle];
        int[] right = new int[numbers.length-middle];
        // filling arrays
        for (int i=0;i<middle;i++)
            left[i]=numbers[i];

        for (int i=middle;i<numbers.length;i++)
            right[i-middle]=numbers[i];
        // again sorting
        sort(left);
        sort(right);
        // Merging
        merge(numbers,left,right);
    }
    private void merge(int[] numbers,int[] left,int[] right){
        int i=0,j=0,k=0;
        while (i<left.length && j<right.length){
            if(left[i]<=right[j])
                numbers[k++]=left[i++];
            else
                numbers[k++]=right[j++];
        }
        while (i<left.length)
            numbers[k++]=left[i++];
        while (j<right.length)
            numbers[k++]=right[j++];
    }
}
