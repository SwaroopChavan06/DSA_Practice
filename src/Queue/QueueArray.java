package Queue;

public class QueueArray {
    int size = 10;
int[] arr = new int[size];

    public void push(int x) {
        for (int i = 0; i< size+1; i++){
            arr[i+1]=x;
        }
    }

    public int pop() {
        int num=arr[0];
        for (int i = 0; i< size; i++){

            arr[i] = arr[i+1];
        }
        return num;
    }

    public int peek() {
        return arr[0];
    }

    public boolean empty() {
        return arr.length==0;
    }


    public static void main(String[] args) {

        QueueArray obj = new QueueArray();
        obj.push(10);
        obj.push(20);
        obj.push(30);
        obj.push(40);


        System.out.println(obj.peek());
        System.out.println(obj.pop());


    }

}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */
