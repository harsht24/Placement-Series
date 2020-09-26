// https://www.pepcoding.com/resources/online-java-foundation/stacks-and-queues/next-greater-element-official/ojquestion#

public static int[] solve(int[] arr){
    int length = arr.length;
    
    Stack<Integer> stack = new Stack<>();
    int[] result = new int[length];
    
    stack.push(arr[length-1]);
    result[length-1] = -1;
    
    for(int i=arr.length-2; i>=0; i--) {
        
        while(stack.size()>0 && arr[i] >= stack.peek()){
            stack.pop();
        }
        
        if(stack.size()==0){
            result[i] = -1;
        }
        else{
            result[i] = stack.peek();
        }
        stack.push(arr[i]);
    
    }
        return result;
}