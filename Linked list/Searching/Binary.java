

public class Binary{
    public static int BS(int arr[],int i,int j,int key){
        if(i>j){
            return -1;
        }
            int mid = (i+j)/2;
            if(arr[mid] == key){
                return mid;
            }
            else if(key < arr[mid]){
                return BS(arr, i, mid-1, key);
            }
            else{
                return BS(arr, mid+1, j, key);
            }
    }
    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);
        int arr[] = {1,2,3,4,5,6};
        int res = BS(arr, 0, arr.length-1, 6);
        if(res != -1){
            System.out.println("The key is in " + res);
        }
        else{
            System.out.println("Key not found");
        }
    }
}