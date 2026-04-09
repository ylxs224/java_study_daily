//盛最多水的容器
public class Day10 {
    public static void main(String[] args) {
        int[] height = {1,8,6,2,5,4,8,3,7};
        int maxArea = maxArea(height);
        System.out.println("最大盛水量："+maxArea);
    }

    /**
     * 双指针解法：左右指针，每次移动较小的指针
     * @param height 高度数组
     * @return 最大盛水量
     */
    public static int maxArea(int[] height){
        int left = 0;
        int right = height.length-1;
        int maxArea = 0;
        while (left < right) {
            int area = Math.min(height[left],height[right]) * (right-left);
            maxArea = Math.max(maxArea,area);
            if (height[left] < height[right]) {
                left++;
            }
            else {
                right--;
            }
        }
        return maxArea;
    }
}
