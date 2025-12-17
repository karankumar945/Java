public class merge{
    public static void conquer(int arr[],int i,int j,int mid){
        int merge[] = new int[j - i + 1];
        int idx1 = i;
        int idx2 = mid+1;
        int x = 0;

        while(idx1 <= mid && idx2 <= j){
            if(arr[idx1] <= arr[idx2]){
                merge[x++] = arr[idx1++];
            }
            else{
                merge[x++] = arr[idx2++];
            }
        }
        while(idx1 <= mid){
            merge[x++] = arr[idx1++];
        }
        while(idx2 <= j){
            merge[x++] = arr[idx2++];
        }
        for(int a=0,b=i;a<merge.length;a++,b++){
            arr[b] = merge[a];
        }
    }
    public static void ms(int arr[],int i,int j){
        if(i >= j){
            return;
        }
        int mid = (i+j)/2;
        ms(arr, i, mid);
        ms(arr, mid+1, j);
        conquer(arr, i, j, mid);
    }
    public static void main(String[] args) {
        int arr[] = {6,3,9,5,2,8};
        int n = arr.length;
        ms(arr, 0, n-1);
        // conquer(arr, 0, n-1, );
        for(int i=0;i<n;i++){
            System.out.println(arr[i] + " " );

        }
        System.out.println();
    }
}