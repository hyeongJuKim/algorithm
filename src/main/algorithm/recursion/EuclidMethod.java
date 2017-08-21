package main.algorithm.recursion;

/**
 * Created by hj on 2017. 5. 3..
 * 최대공약수
 */
public class EuclidMethod {
    public static int gcd1(int m, int n){
        // m을 큰 수로 바꾼다
        if(m<n) {
            int tmp = m;
            m = n;
            n = tmp;
        }
        if (m%n==0)
            return n;
        else
            return gcd1(n, m%n);
    }

    public static int gcd2(int p, int q){
        if (q==0)
            return p;
        else
            return gcd2(q,p%q);
    }


    public static void main(String[] args) {

        int gcd1 = gcd1(10, 3);
        System.out.println("gcd1 result : " + gcd1);

        int gcd2 = gcd1(10, 3);
        System.out.println("gcd2 result : " + gcd2);


    }
}
