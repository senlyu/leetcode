public boolean isPalindrome(int x) {
	if (x < 0) return false;
	return x - reverse(x) == 0;
}

public static int reverse(int x) {
	int result = 0;
	while(x != 0) {
		int placeValue = x % 10;
		try {
			result = Math.addExact(Math.multiplyExact(result, 10), placeValue);
			x = x / 10;
		} catch (Throwable e) {
			return 0;
		}
	}
	return result;
}