import java.util.*;

public class Demo53 {

    public class Stat {
	    int l,m,r,s;

	    public Stat(int ll, int mm, int rr, int ss) {
            l = ll;
            m = mm;
            r = rr;
            s = ss;
	    }
    }  


    public Stat maxSubHelper(int[] A, int n) {
        if (n == 1) {
            Stat res = new Stat(A[0], A[0], A[0], A[0]);
            return res;
        }
        int[] A1 = Arrays.copyOfRange(A, 0, n/2);
        int[] A2 = Arrays.copyOfRange(A, n/2, n);
        Stat v1 = maxSubHelper(A1, n/2);
        Stat v2 = maxSubHelper(A2, n-n/2);
        int l,m,r,s;
        l = Math.max(v1.l, v1.s + v2.l);
        m = Math.max(v1.r + v2.l, Math.max(v1.m, v2.m));
        r = Math.max(v2.r, v1.r + v2.s);
        s = v1.s + v2.s;
        Stat res = new Stat(l, m, r, s);
        return res;
    }



    public int maxSubArray(int[] A) {
        Stat s = maxSubHelper(A, A.length);
        return s.m;
    }

    public static void main(String[] args) {
        System.out.println("tmd");
        Demo53 d = new Demo53();
        int[] A = {-2,1,-3,4,-1,2,1,-5,4};
        int result = d.maxSubArray(A);
        System.out.println(result);
    }


}