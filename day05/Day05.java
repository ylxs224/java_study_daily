public class Day05 {
    public static void main(String[] args) {
        int[] nums={0,0,1,1,1,1,2,2,3,3,4,5,5};
        int len = removeDuplicates(nums);
        System.out.print("去重后的长度："+len+"，内容：");
        for (int i = 0; i < len; i++) {
            System.out.print(nums[i]+" ");
        }
    }

    public static int removeDuplicates(int[] nums){
        if(nums==null||nums.length==0)return 0;
        int slow=0;
        for (int fast = 1; fast < nums.length; fast++) {
            if(nums[fast]!=nums[slow]){
                slow++;
                nums[slow]=nums[fast];
            }
        }
        return slow+1;
    }
}
