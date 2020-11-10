public class Queue{
    private int[] arr;
    private int rear;   // Last of the queue
    private int front;  // First of the queue
    private int elementCount; // total elements present in queue.

    private void intializeValues(int size){
        this.arr = new int[size];
        this.rear = 0;
        this.front = 0;
        this.elementCount = 0;
    }

    public Queue(){
        intializeValues(10);
    }

    public Queue(int size){
        intializeValues(size);
    }

    public int size(){
        return this.elementCount;
    }

    public boolean isEmpty(){
        return this.elementCount == 0;
    }

    private int capacity(){
        return this.arr.length;
    }

    public void push(int data)throws Exception{
        if(this.size() == this.capacity()){
            throw new Exception("QueueIsFull");
        }
        
        this.arr[this.rear] = data;
        this.rear = rear % this.capacity();
        this.rear++;
        this.elementCount++;
    }

    // private void CheckException_peek()throws Exception{
    //     if(this.isEmpty()){
    //         throw new Exception("Rajneesh_StackIsEmpty");
    //     }
    // }

    public int front()throws Exception{
        // try{
        //    CheckException_peek();
        //    return this.arr[this.tos];
        // }catch(Exception e){
        //     System.out.println("handel");
        // }

        if(this.isEmpty()){
            throw new Exception("QueueIsEmpty");
        }

        return this.arr[this.front];
    }

    public int pop() throws Exception{
        if(this.isEmpty()){
            throw new Exception("QueueIsEmpty");
        }

        int rv = this.arr[this.front];
        this.arr[this.front] = 0;
        this.front = (this.front+1) % this.capacity();
        this.elementCount--;

        return rv;
    }
}
