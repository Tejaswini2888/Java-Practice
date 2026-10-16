interface Stack {
    void push(int item);
    int pop();
    void display();
}

class StackImpl implements Stack {
    int stack[] = new int[5];
    int top = -1;

    public void push(int item) {
        if (top == 4) {
            System.out.println("Stack Overflow");
        } else {
            stack[++top] = item;
        }
    }

    public int pop() {
        if (top == -1) {
            System.out.println("Stack Underflow");
            return -1;
        }
        return stack[top--];
    }

    public void display() {
        if (top == -1) {
            System.out.println("Stack is empty");
        } else {
            for (int i = top; i >= 0; i--) {
                System.out.println(stack[i]);
            }
        }
    }
}

public class StackInterface {
    public static void main(String[] args) {
        StackImpl s = new StackImpl();

        s.push(10);
        s.push(20);
        s.push(30);

        System.out.println("Stack elements:");
        s.display();

        System.out.println("Popped element: " + s.pop());

        System.out.println("Stack after pop:");
        s.display();
    }
}
