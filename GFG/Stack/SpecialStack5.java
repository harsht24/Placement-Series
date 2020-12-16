//https://practice.geeksforgeeks.org/problems/special-stack/1/?track=amazon-stacks&batchId=192#

// { Driver Code Starts
import java.util.Scanner;
import java.util.Stack;
class SpeStack{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0){
			int n=sc.nextInt();
			Stack<Integer> s=new Stack<>();
			GfG g=new GfG();
			while(!g.isFull(s,n)){
				g.push(sc.nextInt(),s);
			}
		System.out.println(g.min(s));
		}
	}
}// } Driver Code Ends


/*Complete the function(s) below*/
class GfG{
    static int minEle = Integer.MAX_VALUE;
	
	public void push(int a,Stack<Integer> s)
	{
	    //add code here.
	    if(isEmpty(s)){
	        s.push(a);
	        minEle = a;
	    }
	    else if(a >= minEle){
	        s.push(a);
	    }
	    else if(a < minEle){
	        s.push((a-minEle)+a);
	        minEle = a;
	    }
	}
	public int pop(Stack<Integer> s)
        {
            int val = s.peek();
            if(val >= minEle){
                s.pop();
                return val;
            }
            else{
                minEle = 2*minEle-val;
                return minEle;
            }
            
            
	}
	public int min(Stack<Integer> s)
        {
           return minEle;
	}
	public boolean isFull(Stack<Integer>s, int n)
        {
           return s.size()==n;
	}
	public boolean isEmpty(Stack<Integer>s)
        {
           return s.size()==0;
	}
}