//my answer


//空间换时间，辅助栈与数据栈同步
import java.util.Stack;

class 20200117MinStack {

	private Stack<Integer> data;
	private Stack<Integer> assistant;			//辅助栈栈顶存放入栈数据的最小值

    /** initialize your data structure here. */
    public MinStack() {
        data = new Stack<>();
        assistant = new Stack<>();
    }

    public void push(int x) {
        data.add(x);
        if(assistant.isEmpty() || assistant.peek() >= x)
        	assistant.add(x);
        else
        	assistant.add(assistant.peek());
    }

    public void pop() {
        if(!data.isEmpty()){
        	assistant.pop();
        	data.pop();
        }
    }

    public int top() {
        if(!data.isEmpty()) return data.peek();
        throw new RuntimeException("Stack Empty");
    }

    public int getMin() {
        if(!assistant.isEmpty()) return assistant.peek();
        throw new RuntimeException("Stack Empty");
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