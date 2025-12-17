public class hanoi{
    public static void toh(int num , String source , String helper , String dest){
        if(num == 1){
            System.out.println(" Transfer disk " + num + " from " + source + " to " + dest);
            return;
        }
        toh(num-1 , source , dest , helper);
        System.out.println(" Transfer disk " + num + " from " + source + " to " + dest);
        toh(num-1, helper , source , dest);
    }
    public static void main(String[] args) {
     int num=3;
     toh(num , "S" , "H" , "D");   
    }
}