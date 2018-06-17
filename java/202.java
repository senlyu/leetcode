class Solution {
    public boolean isHappy(int n) {
        Set<Integer> s = new HashSet<Integer>();
        while (helpCal(n)!=1) {
        	int newOne = helpCal(n);
        	if (s.contains(newOne)) {
        		return false;
        	}
        	s.add(newOne);
        	n = newOne;
        }
        return true;
    }
    private int helpCal(int num) {
    	int sums = 0;
    	while (num != 0) {
    		int adds = num % 10;
    		num = num / 10;
    		sums += adds * adds;
    	}
    	return sums;
    }
}



// add new one
// will increase the calculation of sums, but will save the space.

int digitSquareSum(int n) {
    int sum = 0, tmp;
    while (n) {
        tmp = n % 10;
        sum += tmp * tmp;
        n /= 10;
    }
    return sum;
}

bool isHappy(int n) {
    int slow, fast;
    slow = fast = n;
    do {
        slow = digitSquareSum(slow);
        fast = digitSquareSum(fast);
        fast = digitSquareSum(fast);
    } while(slow != fast);
    if (slow == 1) return 1;
    else return 0;
}