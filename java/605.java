class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        int maxs = 0;
        if (n==0) // n case
        	return true;
        if (flowerbed.length==1) // flowerbed head case
        	if (flowerbed[0]==0)
        		return true;
        	else
        		return false;
        if (flowerbed[0]==0&&flowerbed[1]==0) { //flowerbed head case 
        	flowerbed[0] = 1;
        	maxs++;
        }
        for (int i=1;i<flowerbed.length-1;i++) {
        	if (flowerbed[i-1]==0&&flowerbed[i+1]==0&&flowerbed[i]==0) {
        		maxs++;
        		flowerbed[i] = 1;
        	}
        }
        if (flowerbed[flowerbed.length-1]==0&&flowerbed[flowerbed.length-2]==0) { //end case
        	flowerbed[flowerbed.length-1] = 1;
        	maxs++;
        }
        if (maxs>=n)
        	return true;
        else
        	return false;
    }
}

