//https://www.pepcoding.com/resources/online-java-foundation/2d-arrays/exit-point-matrix-official/ojquestion#


import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] arr = new int[n][m];
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr[0].length; j++){
                arr[i][j] = sc.nextInt();
            }
        }
        
        int dir = 0; // 0 - east, 1 - south, 2 - west, 3 - north.
        int i=0, j=0;
        
        while(true){
            dir = (dir + arr[i][j]) % 4;
            
            if(dir == 0){  // east
                j++;
            }else if(dir == 1){ // south
                i++;
            }
            else if(dir == 2){ // west
                j--;
            }
            else if(dir == 3){ // north
                i--;
            }
            
            if(i < 0){
                i++;
                break;
            }else if(j < 0){
                j++;
                break;
            }else if(i > arr.length-1){
                i--;
                break;
            }else if(j > arr[0].length-1){
                j--;
                break;
            }
        }
        System.out.println(i);
        System.out.println(j);
    }

}