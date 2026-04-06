import java.util.HashMap;
import java.util.Map;

public class Day07 {
    public static void main(String[] args) {
        int[] nums = {1,2,11,4,15,6,7};
        int target = 9;
        int[] result = twoSum(nums, target);
        System.out.println("小标："+result[0]+"，"+result[1]);
    }

    public static int[] twoSum(int[] nums, int target){
        // 1. 创建HashMap，key存数组元素值，value存对应下标
        Map<Integer,Integer> map = new HashMap<>();
        // 2. 遍历数组，i是当前下标
        for (int i = 0; i < nums.length; i++) {
            // 3. 计算当前数需要的【补数】：target - 当前数
            int another=target-nums[i];
            // 4. 判断哈希表中是否已经存在这个补数
            if (map.containsKey(another)) {
                // 5. 存在：返回【补数的下标】和【当前下标】
                return new int[]{map.get(another), i};
            }
            // 6. 不存在：把当前数和下标存入哈希表
            map.put(nums[i], i);
        }
        return new int[]{-1,-1};
    }
}
