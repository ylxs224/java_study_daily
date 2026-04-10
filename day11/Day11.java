import java.util.HashMap;
import java.util.Map;

public class Day11 {
    public static void main(String[] args) {
        System.out.println(lengthOfLongestSubstring("abcabcbb")); // 预期输出：3 (abc)
        System.out.println(lengthOfLongestSubstring("bbbbb"));    // 预期输出：1 (b)
        System.out.println(lengthOfLongestSubstring("pwwkew"));   // 预期输出：3 (wke/kew)
    }

    public static int lengthOfLongestSubstring(String s) {
        // 哈希表：记录每个字符最后一次出现的索引，O(1)判断重复
        Map<Character, Integer> charIndexMap = new HashMap<>();
        int maxLength = 0; // 记录最长无重复子串长度
        int left = 0; // 滑动窗口左边界

        // right：滑动窗口右边界，遍历整个字符串
        for (int right = 0; right < s.length(); right++) {
            char currentChar = s.charAt(right); // 当前右指针指向的字符

            // 核心判断：字符已存在 且 上一次出现位置在当前窗口内（>=left）
            if (charIndexMap.containsKey(currentChar) && charIndexMap.get(currentChar) >= left) {
                // 左指针跳到重复字符的下一位，保证窗口无重复
                left = charIndexMap.get(currentChar) + 1;
            }

            // 更新字符的最新出现索引（无论是否重复，都要更新）
            charIndexMap.put(currentChar, right);
            // 更新最大长度：窗口长度 = right - left + 1
            maxLength = Math.max(maxLength, right - left + 1);
        }

        return maxLength;
    }
}
