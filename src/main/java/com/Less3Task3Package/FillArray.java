// Fill the array with numbers from 100 to 0

package com.Less3Task3Package;

public class FillArray {
    public static void main(String[] args) {

        int numElem = 101;
        int[] arr = new int[numElem];

        for (int i = 0, iter = arr.length; i < iter; i++){
            numElem --;
            arr[i] = numElem;
        }

        for (int i : arr){
            System.out.print(i + " ");
            if(i%10 == 0) System.out.println();
        }





    }
}
