// https://www.pepcoding.com/resources/online-java-foundation/2d-arrays/shell-rotate-official/ojquestion#

import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        // write your code here
        
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] arr = new int[n][m];
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[0].length; j++){
            
                arr[i][j] = sc.nextInt();
            }
        }
        
        int s = sc.nextInt();
        int r = sc.nextInt();
        
        rotateShell(arr, s, r);
        
        display(arr);
        
    }
    
    public static void rotateShell(int[][] arr, int s ,int r){
        int[] oned = fillOnedFromShell(arr, s);
        rotate(oned, r);
        fillShellFromOned(arr, s, oned);
    }
    
    public static int[] fillOnedFromShell(int[][] arr, int s){
        int minr = s - 1;
        int minc = s - 1;
        int maxr = arr.length - s;
        int maxc = arr[0].length - s;
        // int size = 2 * (maxr-minr+1) + 2 * (maxc-minc+1) - 4;
        // or use
        int size = 2 * (maxr - minr + maxc - minc);
        int[] oned = new int[size];
        int index = 0;    
        
        // left wall
        for(int i = minr, j = minc; i <= maxr; i++){
            oned[index] = arr[i][j];
            index++;
        }
        
        // bottom wall 
        for(int i = maxr, j = minc + 1; j <= maxc; j++){
            oned[index] = arr[i][j];
            index++;
        }
        
        // right wall
        for(int i = maxr - 1, j = maxc; i >= minr; i--){
            oned[index] = arr[i][j];
            index++;
        }
        
        //top wall
          for(int i = minr, j = maxc - 1; j >= minc + 1; j--){
            oned[index] = arr[i][j];
            index++;
        }
        return oned;
    }
    
    public static void fillShellFromOned(int[][] arr, int s, int[] oned){
        
        int minr = s - 1;
        int minc = s - 1;
        int maxr = arr.length-s;
        int maxc = arr[0].length-s;
        
        int index = 0;    
        
        // left wall
        for(int i = minr, j = minc; i <= maxr; i++){
            arr[i][j] = oned[index];
            index++;
        }
        
        // bottom wall 
        for(int i = maxr, j = minc + 1; j <= maxc; j++){
            arr[i][j] = oned[index];
            index++;
        }
        
        // right wall
        for(int i = maxr - 1, j = maxc; i >= minr; i--){
            arr[i][j] = oned[index];
            index++;
        }
        
        //top wall
          for(int i = minr, j = maxc -1; j >= minc + 1; j--){
            arr[i][j] = oned[index];
            index++;
        }
    }
    
    public static void rotate(int[] oned, int r){
        
        r = r % oned.length; 
        if(r < 0){
            r = r + oned.length;    
        }
        
        // part 1
        reverse(oned, 0, oned.length - r - 1);
        // part 2
        reverse(oned, oned.length - r, oned.length-1 );
        // complete array
        reverse(oned, 0, oned.length-1);
    }
    
    public static void reverse(int[] oned, int left, int right){
       
        while(left < right){
            
            int temp = oned[left];
            oned[left] = oned[right];
            oned[right] = temp;
            
            left++; right--;
        }
    }

    public static void display(int[][] arr){
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[0].length; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

}