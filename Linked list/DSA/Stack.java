import java.util.*;
public class Stack{
    static int arr[];
    static int size;
    static int top = -1;
    // push function for stack
    public static void push(int value){
        if(top == size - 1){
            System.out.println("The stack is overflow!!");
        }
        else{
            top++;
            arr[top] = value;
            System.out.println(value + " is pushed in the stack");
        }
    }
    // pop function for stack
    public static void pop(){
        if(top == -1){
            System.out.println("The stack is empty!!");
        }
        else{
            System.out.println(arr[top] + " is popped from stack");
            top--;
        }
    }
    // peek function for stack
    public static void peek(){
        if(top == -1){
            System.out.println("The stack is empty");
        }
        else{
            System.out.println("The peek element is " + arr[top]);
        }
    }
    // display function for stack
    public static void display(){
        if(top == -1){
            System.out.println("The stack is empty");
        }
        else{
            System.out.println("The elements of Stack are :- ");
            for(int i = 0 ; i <= top ; i++){
                System.out.println(arr[i]);
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the stack:-");
        size = sc.nextInt();
        arr = new int[size];
        while(true){
            System.out.println("1) PUSH");
            System.out.println("2) POP");
            System.out.println("3) PEEK");
            System.out.println("4) DISPLAY");
            System.out.println("5) EXIT");
            System.out.println("Enter the choice : - ");
            int choice = sc.nextInt();
        switch (choice) {
            case 1:
                System.out.println("Enter the value to enter in the stack:- ");
                int value = sc.nextInt();
                push(value);
                break;
            case 2:
                pop();
                break;
            case 3:
                peek();
                break;
            case 4:
                display();
                break;
            case 5:
                System.out.println("Thankyou for your use: ");
                System.exit(0);
            default:
                System.out.println("You entered a wrong choice : -");
        }
        }
    }
}