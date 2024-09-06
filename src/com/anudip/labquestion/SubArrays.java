package com.anudip.labquestion;

public class SubArrays {
//     to take sub array from an array
    public static int[] findSubArray(int[] arr,int startIndex,int endIndex){
        int[] arr2 = new int[endIndex-startIndex + 1];
        int count=0;
        for (int i = startIndex;i<=endIndex;i++){
            arr2[count] = arr[i];
            count++;
        }
        return  arr2;
    }

    public static void main(String[] args) {
        int[] arr = {2,4,5,3,6,7,9,4,5,6};

        System.out.println("Array Elements");
        for (int i : arr){
            System.out.print(i+" ");
        }
        System.out.println();
        int[] subArray = findSubArray(arr,2,6);
        System.out.println("Sub - Array Elements");
        for (int i : subArray){
            System.out.print(i+"  ");
        }
        int max = Integer.MIN_VALUE;
        for (int i =0 ;i<subArray.length;i++){
         if(subArray[i]>max){
             max = subArray[i];
         }
        }
        int secondMax = Integer.MIN_VALUE;
        for (int i =0;i<subArray.length;i++){
            if(subArray[i]==max){
                continue;
            }
            if(subArray[i] > secondMax){
                secondMax = subArray[i];
            }
        }
        System.out.println();
        System.out.println("2nd Highest element :"+secondMax);
    }
}
