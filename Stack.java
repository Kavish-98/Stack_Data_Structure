public class Stack {
    int arr[];
    int top;
    int capacity;
    
    Stack(int size){
        arr = new int[size];
        capacity = size;
        top = -1;
    }

    boolean isFull(){
        return top+1 == capacity;
    }

   void push(int x){
        if(isFull()){
            System.out.println("over flow");
        }
        else{
            top++;
            arr[top] = x;
            System.out.println("Inserting: "+ x);
        }
    }
    public static void main(String[] args){
        Stack myStack = new Stack(5);

        myStack.push(10);
        myStack.push(20);
        myStack.push(30);
        myStack.push(40);
        myStack.push(50);
        myStack.push(60);
    }
}
