public class recall{
    public static int removeDuplicates(int[] nums) {
        int count= 1;
        for(int i =0;i<nums.length;i++){
            if(nums[i] != nums[i+1]){
                nums[count] = nums[i];
            count++;
             }
            
        }
        for(int i =0;i<nums.length;i++){
            System.out.println(nums[i]);
        }
        return count;
    }
    public static void main(String[] args) {
        int nums[] = {0,0,1,2,3,3};
         int res = removeDuplicates(nums);
         System.out.println("count"+res);
    }
}