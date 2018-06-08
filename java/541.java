class Solution {
    public String reverseStr(String s, int k) {
        if (k>s.length()) {
        	return new StringBuilder(s).reverse().toString();// reverse the string
        }
        int i = 0;
        StringBuilder sb = new StringBuilder();
        boolean flag=true;
        while ((i+k)<s.length()) {
        	if (flag) {
        		for (int j=i+k-1;j>=i;j--) {
        		    sb.append(s.charAt(j));
        	    }
        	    i+=k;
        	    flag = !flag;
        	} else {
        		for (int j=i;j<=i+k-1;j++) {
        		    sb.append(s.charAt(j));
        	    }
        	    i+=k;
        	    flag = !flag;
        	}
        }
        if (flag) {
        	int ii=i;
        	while (i<=(s.length()-1)) {
        		sb.append(s.charAt(s.length()-i+ii-1));
        		i++;
        	}
        } else {
        	while (i<=(s.length()-1)) {
        		sb.append(s.charAt(i));
        		i++;
        	}
        }
        return sb.toString();
    }
}

class Solution {
    public String reverseStr(String s, int k) {
        int i = 0;
        StringBuilder sb = new StringBuilder();
        while (i<s.length()) {
        	for (int j=Math.min(i+k-1,s.length()-1);j>=i;j--) {
        		    sb.append(s.charAt(j));
        	}
        	for (int j=i+k;j<=Math.min(i+2*k-1,s.length()-1);j++) {
        		    sb.append(s.charAt(j));
        	}
        	i+=2*k;
        }
        return sb.toString();
    }
}