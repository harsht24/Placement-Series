// https://www.pepcoding.com/resources/online-java-foundation/stacks-and-queues/stock-span-official/ojquestion#

public static int[] solve(int[] arr){
   int[] span = new int[arr.length];
   span[0] = 1;
   
   Stack<Integer> stack = new Stack<>();
   stack.push(0);
   
   for(int i=1; i<arr.length; i++){
       while(stack.size()>0 && arr[i] > arr[stack.peek()]){
           stack.pop();
       }
       
       if(stack.size()==0){
            span[i] = i + 1;
       }
       else{
           span[i] = i - stack.peek();
       }
       
       stack.push(i);
   }
   
   
   return span;
 }
