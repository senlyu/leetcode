class MinStack {

    List<Integer> list = new ArrayList<>();
    int min;
    /** initialize your data structure here. */
    public MinStack() {
        
    }
    
    public void push(int x) {
        this.list.add(x);
        if (list.size()==1) {
            this.min = x;
        } else {
            this.min = Math.min(this.min, x);
        }
        
    }
    
    public void pop() {
        int res = this.list.get(this.list.size()-1);
        this.list.remove(this.list.size()-1);
        if (this.list.size()==0)
            this.min = 0;
        else {
            this.min = this.list.get(0);
            for (int i=1;i<this.list.size();i++) {
                this.min = Math.min(this.min, this.list.get(i));
            }
        }
    }
    
    public int top() {
        return this.list.get(this.list.size()-1);
    }

    public int getMin() {
        return this.min;
    }
}



/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(x);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */



public class MinStack {
    long min;
    Stack<Long> stack;

    public MinStack(){
        stack=new Stack<>();
    }
    
    public void push(int x) {
        if (stack.isEmpty()){
            stack.push(0L);
            min=x;
        }else{
            stack.push(x-min);//Could be negative if min value needs to change
            if (x<min) min=x;
        }
    }

    public void pop() {
        if (stack.isEmpty()) return;
        
        long pop=stack.pop();
        
        if (pop<0)  min=min-pop;//If negative, increase the min value
        
    }

    public int top() {
        long top=stack.peek();
        if (top>0){
            return (int)(top+min);
        }else{
           return (int)(min);
        }
    }

    public int getMin() {
        return (int)min;
    }
}