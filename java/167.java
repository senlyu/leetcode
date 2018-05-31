class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int head = 0;
        int end = numbers.length - 1;
        while (numbers[head]!=(target-numbers[end])) {
        	if (numbers[head] > (target-numbers[end])) {
        		end -= 1;
        	} else {
        		head += 1;
        	}
        }
        int[] answer = {head+1, end+1};
        return answer;
    }
}