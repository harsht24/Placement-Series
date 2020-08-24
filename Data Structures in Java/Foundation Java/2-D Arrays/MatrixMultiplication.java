import java.io.*;
import java.util.*;

public class Main{

    public static void main(String[] args) throws Exception {
        // write your code here
        
        Scanner sc = new Scanner(System.in);
        
        int n1 = sc.nextInt();
        int m1 = sc.nextInt();
        
        int[][] a = new int[n1][m1];    
        for(int i=0; i<a.length; i++){
            for(int j=0; j<a[0].length; j++){
                a[i][j] = sc.nextInt();
            }
        }
        
        int n2 = sc.nextInt();
        int m2 = sc.nextInt();
        
        int[][] b = new int[n2][m2];
        for(int i=0; i<b.length; i++){
            for(int j=0; j<b[0].length; j++){
                b[i][j] = sc.nextInt();
            }
        }
        
        if(m1==n2){
            int[][] prd = new int[n1][m2];
            
            for(int i=0; i<prd.length; i++){
                for(int j=0; j<prd[0].length; j++){
                    int sum = 0;

                    for (int k = 0; k < m1; k++) {
                       sum += a[i][k] * b[k][j];
                    }
        
                    prd[i][j] = sum;
                }
            }
            
            for(int i=0; i<prd.length; i++){
                for(int j=0; j<prd[0].length; j++){
                    System.out.print(prd[i][j]+" ");
                }
                System.out.println();
            }
            
            
        }
        else{
            System.out.println("Invalid input");
        }
   
     }

}