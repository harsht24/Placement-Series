public class DynamicStack extends stack{
    DynamicStack(){
        super();
    }
    DynamicStack(int size){
        super(int size);
    }

    @override
    public void push(int data){
        if(super.size() == super.capacity()){
            int cap = super.capacity();

            int[] temp = new int[cap];
            int idx = cap-1;
            
            while(super.size()!=0){
                temp[idx--] = super.pop();
            }
            
            super.intializeValues(cap*2);

            idx=0;
            while(idx < cap){
                super.push(temp[idx++]);
            }

        super.push(data);
        }
        
    }
    
}