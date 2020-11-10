class Main{
    public static void main(String[] args)throws Exception{
        Queue q = new Queue();

        q.push(10);
        q.push(20);
        q.push(30);
        q.push(40);
        q.push(50);

        System.out.println("Front of the queue : "+q.peek());
        System.out.println("Element removed : "+q.pop());
        System.out.println("Element removed : "+q.pop());
        System.out.println("Element removed : "+q.pop());
        System.out.println("Element removed : "+q.pop());
        System.out.println("Element removed : "+q.pop());
        System.out.println("Element removed : "+q.pop());
        System.out.println("Front of the queue : "+q.peek());
        System.out.print("*****End of the program*****");


    }
}