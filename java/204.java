class Solution {
    public int countPrimes(int n) {
        if (n<2)
            return 0;
        int sums = n-2;
        for (int j=2; j<n;j++) {
            for (int i=2; i<(int)Math.sqrt((double)j)+1&&i<j;i++) {
                if (j%i==0) {
                    sums--;
                    break;
                }
            }
            //System.out.printf("j:%d,sums:%d",j,sums);
        }
        return sums;
    }
    
}


public class Solution {
    public int countPrimes(int n) {
        boolean[] notPrime = new boolean[n];
        int count = 0;
        for (int i = 2; i < n; i++) {
            if (notPrime[i] == false) {
                count++;
                for (int j = 2; i*j < n; j++) {
                    notPrime[i*j] = true;
                }
            }
        }
        
        return count;
    }
}