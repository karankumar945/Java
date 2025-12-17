// PRINT ALL POSSIBLE ARRANGEMENTS OF "ABC" 

public class recurse{
    public static void printpermutation(String str, int idx ,String perm){
        if(str.length() == 0){
            System.out.println(perm);{
                return;
            }
        }
        for(int i=0 ; i<str.length() ; i++){
            char currchar = str.charAt(i);
            String newstr = str.substring(0,i) + str.substring(i+1);
            printpermutation(newstr, idx+1, perm+currchar);
        }
    }
    public static void main(String[] args) {
        String str = "ABC";
        printpermutation(str, 0, " ");
    }
}