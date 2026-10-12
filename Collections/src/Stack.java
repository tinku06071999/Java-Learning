public class Stack {

    private int[] arr;
    private int top = -1;

    public Stack(int size){
        arr = new int[size];
        top = -1;
    }
    public void push(int num){
        if(top == arr.length - 1){
            System.out.println("Stack is full");
            return;
        }
        top++;
        arr[top] = num;
    }
    public int pop(){
        if(top == -1){
            System.out.println("Stack is Empty !");
            return -1 ;
        }
        int num = arr[top];
        top--;
        return num;
    }
    public int peek(){
        return arr[top];
    }
    public boolean isEmpty(){
        return top == -1 ? true:false;
    }
    public void sortStack(){
        Stack tempStack = new Stack(10);

        if(top == -1){
            System.out.println("Stack is empty!!!!");
        }
        while(isEmpty()){
            int temp = pop();
            while( !tempStack.isEmpty() && tempStack.peek() < temp){
                push(tempStack.pop());
            }
            tempStack.push(temp);
        }
        while(!tempStack.isEmpty()){
            int temp = tempStack.pop();
            push(temp);
        }
    }
}
