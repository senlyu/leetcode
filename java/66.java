import java.util.Arrays;
class Solution {
	public int[] plusOne(int[] digits) {
        if (digits[digits.length-1] + 1 == 10) {
            if (digits.length == 1) {
                int[] head = {1,0};
                return head;
            } else {
                int[] news = plusOne(Arrays.copyOf(digits, digits.length-1));
                int[] all = Arrays.copyOf(news, news.length+1);
                all[all.length - 1] = 0;
                return all;
            }
        } else {
            digits[digits.length-1] += 1;
            return digits;
        }
	}
    public static void main(String[] args) {
        System.out.println("Hello World!");
        int[] test = {0};
        Solution s = new Solution();
        int[] news = s.plusOne(test);
        System.out.println(Arrays.toString(news));
    }
}