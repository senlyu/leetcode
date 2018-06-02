class Solution {
    public String addBinary(String a, String b) {
        StringBuilder res = new StringBuilder();
        int ia = a.length()-1;
        int ib = b.length()-1;
        int carry = 0;
        int ins = 0;
        while (ia>=0&&ib>=0) {
        	if (((a.charAt(ia)-'0') + (b.charAt(ib)-'0') + carry)>=2) {
        		ins = (a.charAt(ia)-'0') + (b.charAt(ib)-'0') + carry - 2;
        		carry = 1;
        		res.insert(0, ins);
        		ia--;
        		ib--;
        	}  else {
        		ins = (a.charAt(ia)-'0') + (b.charAt(ib)-'0') + carry;
        		carry = 0;
        		res.insert(0, ins);
        		ia--;
        		ib--;
        	}
        }
        while (ia>=0) {
        	if ((a.charAt(ia)-'0')+carry>=2) {
        		ins = (a.charAt(ia)-'0')+carry -2;
        		carry = 1;
        		res.insert(0, ins);
        		ia--;
        	} else {
        		ins = (a.charAt(ia)-'0')+carry;
        		carry = 0;
        		res.insert(0, ins);
        		ia--;
        	}
        }
        while (ib>=0) {
        	if ((b.charAt(ib)-'0')+carry>=2) {
        		ins = (b.charAt(ib)-'0')+carry -2;
        		carry = 1;
        		res.insert(0, ins);
        		ib--;
        	} else {
        		ins = (b.charAt(ib)-'0')+carry;
        		carry = 0;
        		res.insert(0, ins);
        		ib--;
        	}
        }
        if (carry==1) {
        	res.insert(0, 1);
        }
        while (res.charAt(0)=='0'&&res.length()>1) {
        	res.deleteCharAt(0);
        }
        return res.toString();
    }
}
