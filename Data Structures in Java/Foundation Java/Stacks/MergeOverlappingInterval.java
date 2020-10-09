// https://www.pepcoding.com/resources/online-java-foundation/stacks-and-queues/merge-overlapping-interval-official/ojquestion#

import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        // write your code here
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[][] arr = new int[n][2];

        for (int j = 0; j < n; j++) {
            String line = br.readLine();
            arr[j][0] = Integer.parseInt(line.split(" ")[0]);
            arr[j][1] = Integer.parseInt(line.split(" ")[1]);
        }

        mergeOverlappingIntervals(arr);
    }

    public static void mergeOverlappingIntervals(int[][] arr) {
        // merge overlapping intervals and print in increasing order of start time
        Pairs[] pairs = new Pairs[arr.length];
        for(int i=0; i<arr.length; i++){
            pairs[i] = new Pairs(arr[i][0], arr[i][1]);
        }
        Arrays.sort(pairs);    
        Stack<Pairs> stack = new Stack<>();
        
        for(int i=0; i<pairs.length; i++){
            if(i==0){
                stack.push(pairs[i]);
            }
            else{
                Pairs top = stack.peek();
                if(pairs[i].st > top.et){
                    stack.push(pairs[i]);
                }
                else{
                    top.et = Math.max(top.et, pairs[i].et);
                }
            }
        }
        Stack<Pairs> result = new Stack<>();
        while(stack.size() > 0){
            result.push(stack.pop());
        }
        while(result.size() > 0){
            Pairs p = result.pop();
            System.out.println(p.st + " " + p.et);
        }
    }
    
    public static class Pairs implements Comparable<Pairs>{
        int st; // Start time
        int et; // end time
        
        Pairs(int st, int et){
            this.st = st;
            this.et = et;
        }
        // this > other return +ve
        // this == other return 0
        // this < other return -ve 
        public int compareTo(Pairs other){
            if(this.st != this.st){
                return this.st - other.st;
            }else{
                return this.et - this.st;
            }
            
        }
    }

}