// https://www.pepcoding.com/resources/online-java-foundation/stacks-and-queues/lah-official/ojquestion#

import java.io.*;
import java.util.*;

public class Main{
  

public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    int n = Integer.parseInt(br.readLine());
    int[] arr = new int[n];
    for(int i = 0; i < n; i++){
       arr[i] = Integer.parseInt(br.readLine());
    }

    // code
    int[] rb = new int[arr.length]; // rb : next smaller element index on the right
    Stack<Integer> stack = new Stack<>();
    
    stack.push(arr.length-1);
    rb[arr.length-1] = arr.length;
    
    for(int i=arr.length-2; i>=0; i--){
        while(stack.size()>0 && arr[i] <= arr[stack.peek()]){
            stack.pop();
        }
        
        if(stack.size()==0){
            rb[i] = arr.length;
        }
        else{
            rb[i] = stack.peek();
        }
        stack.push(i);
    }
        
    int[] lb = new int[arr.length]; // rb : next smaller element index on the left
    stack = new Stack<>();
    stack.push(0);
    lb[0] = -1;
    
    for(int i=1; i<arr.length; i++){
        while(stack.size()>0 && arr[i] <= arr[stack.peek()]){
            stack.pop();
        }
        
        if(stack.size()==0){
            lb[i] = -1;
        }
        else{
            lb[i] = stack.peek();
        }
        stack.push(i);
    }
    
    // area
    int maxArea = 0;
    
    for(int i=0; i<arr.length; i++){
        int width = rb[i] - lb[i] - 1;
        int area = arr[i] * width;
        if(area > maxArea){
            maxArea = area;
        }
    }
    
    System.out.println(maxArea);
    
 }
}