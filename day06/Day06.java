public class Day06 {
    public static void main(String[] args) {
        int[] nums = {0,1,0,3,12};
        moveZeroes(nums);
        for(int num:nums){
            System.out.print(num+" ");
        }
    }

    public static void moveZeroes(int[] nums){
        int slow = 0;
        for (int fast = 0; fast < nums.length; fast++) {
            if (nums[fast] != 0) {
                int temp = nums[slow];
                nums[slow] = nums[fast];
                nums[fast] = temp;
                slow++;
            }
        }
    }
}
