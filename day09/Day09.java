import java.util.Arrays;

public class Day09 {
    public static void main(String[] args) {
        int[] nums = {0,0,1,1,1,2,2,3,3,4};
        int len = removeDuplicates(nums);
        System.out.println("去重后的长度："+len);
        System.out.println("数组前"+len+"位："+ Arrays.toString(Arrays.copyOf(nums,len)));
    }

    public static int removeDuplicates(int[] nums){
        if(nums==null||nums.length==0)return 0;
        int slow=1;
        for (int fast = 1; fast < nums.length; fast++) {
            if(nums[fast]!=nums[fast-1]){
                nums[slow]=nums[fast];
                slow++;
            }
        }
        return slow;
    }
}
// 这是Day09练习git diff加的测试注释