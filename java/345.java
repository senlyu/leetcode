class Solution {
    public String reverseVowels(String s) {
        StringBuilder sb = new StringBuilder();
        Set<Character> sets = new HashSet<Character>();
        char[] targetChar = {'a','e','i','o','u', 'A', 'E', 'I', 'O', 'U'};
        for (char c:targetChar) {
            sets.add(c);
        }
        int n = s.length();
        if (n<2)
        	return s;
        int head = 0;
        int end = n - 1;
        char chead, cend;
        int p = 0;
        while (head<end) {
            chead = s.charAt(head);
            cend = s.charAt(end);
            if (!sets.contains(chead)) {
                head++;
                if (p>=sb.length()) {
                    sb.append(chead);
                } else {
                    sb.insert(p, chead);                   
                }
                p++; 
            } else {
                if (!sets.contains(cend)) {
                    end--;
                    if (p>=sb.length()) 
                        sb.append(cend);
                    else
                        sb.insert(p, cend);
                } else {
                    if (p>=sb.length()) 
                        sb.append(cend);
                    else
                        sb.insert(p, cend);
                    p++;
                    if (p>=sb.length()) 
                        sb.append(chead);
                    else
                        sb.insert(p, chead);
                    head++;
                    end--;
                }
            }
        }
        if (head==end) {
            chead = s.charAt(head);
            if (p>=sb.length()) 
                sb.append(chead);
            else
                sb.insert(p, chead);
        }
        return sb.toString();
    }
}