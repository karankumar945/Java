import java.util.Scanner;
public class Queue{
    static int arr[];
    static int size;
    static int bottom;
    static int top;

    // push function for queue
    public static void push(int value){
       if(bottom == 0){
        System.out.println("The queue is overflow");
       }
       else{
        bottom--;
        arr[bottom] = value;
        System.out.println(value + " is entered into the queue");
       }
    }
    // pop funtion for queue
    public static void pop(){
        if(bottom  == size){
            System.out.println("The queue is empty");
        }
        else{
            System.out.println(arr[top] + " is popped from queue");
            top--;
            // bottom++;
        }
    }
    public static void display(){
        if(bottom  == size){
            System.out.println("The queue is empty");
        }
        else{
            System.out.println("The elements of queue are : -");
            for(int i = bottom ;i < top; i++ ){
                System.out.println(arr[i]);
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the queue : - ");
        size = sc.nextInt();
        arr = new int[size];
        bottom = size;
        top = size - 1;
        while(true){
            System.out.println("1) PUSH");
            System.out.println("2) POP");
            System.out.println("3) DISPLAY");
            System.out.println("4) EXIT");
            System.out.print("Enter the choice : - ");
            int choice = sc.nextInt();
            switch(choice){
                case 1:
                    System.out.println("Enter the value to enter : - ");
                    int value = sc.nextInt();
                    push(value);
                    break;
                case 2:
                    pop();
                    break;
                case 3:
                    display();
                    break;
                case 4:
                    System.out.println("Thankyou for practicing queue");
                    System.exit(0);
                default:
                    System.out.println("You have selected the wrong choice");
            }
        }
    }
}