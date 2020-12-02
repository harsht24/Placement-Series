// https://leetcode.com/problems/find-median-from-data-stream/submissions/

class MedianFinder {

    PriorityQueue<Integer> leftMaxHeap = new PriorityQueue<>(Collections.reverseOrder()); 
    PriorityQueue<Integer> rightMinHeap = new PriorityQueue<>();
    
    /** initialize your data structure here. */
    public MedianFinder() {
            
    }
    
    public void addNum(int num) {
        if(leftMaxHeap.size()==0 || num<=leftMaxHeap.peek()) leftMaxHeap.add(num);
        else rightMinHeap.add(num);
        
        if(leftMaxHeap.size()-rightMinHeap.size()==2){
            rightMinHeap.add(leftMaxHeap.peek());
            leftMaxHeap.remove();
        }
        else if(leftMaxHeap.size() < rightMinHeap.size()){
            leftMaxHeap.add(rightMinHeap.peek());
            rightMinHeap.remove();
        }
            
        
    }
    
    public double findMedian() {
        
        if(leftMaxHeap.size()==rightMinHeap.size()){
            return (leftMaxHeap.peek() + rightMinHeap.peek()) / 2.0;
        }
        else{
            return leftMaxHeap.peek();
        }
    }
}

/**
 * Your MedianFinder object will be instantiated and called as such:
 * MedianFinder obj = new MedianFinder();
 * obj.addNum(num);
 * double param_2 = obj.findMedian();
 */