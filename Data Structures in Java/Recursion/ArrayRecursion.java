package Recursion;

import java.util.concurrent.LinkedBlockingDeque;

public class ArrayRecursion {
    public void printArray(int[] arr, int index){
        if(index>=arr.length) return;
        System.out.println(arr[index]);
        printArray(arr,index+1);
    }
    public void printArrayReverse(int[] arr, int index){
        if(index>=arr.length) return;
        printArrayReverse(arr,index+1);
        System.out.println(arr[index]);
    }
    public int maxOfArray(int[] arr, int index){
        if(index==arr.length-1) return arr[index];
        int max = maxOfArray(arr,index+1);
        if(max>arr[index]){
            return max;
        }
        else{
            return arr[index];
        }
    }
    public int firstIndexOccurrence(int[] arr, int data, int index){
        if(index==arr.length-1){
            return -1;
        }
        if(arr[index]==data){
            return index;
        }
        else{
            int fio = firstIndexOccurrence(arr,data, index+1);
            return fio;
        }
    }
    public int lastIndexOccurrence(int[] arr, int data, int index){
        if(index==arr.length-1){
            return -1;
        }
        int lio = lastIndexOccurrence(arr,data, index+1);
        if(lio==-1){
            if(arr[index]==data){
                return index;
            }
            else{
                return -1;
            }
        }
        else{
            return lio;
        }
    }
}

