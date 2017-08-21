package main.algorithm.recursion;

/**
 * Created by hj on 2017. 5. 3..
 * 재귀호출 (팩토리얼)
 */
public class Recursion {

    /**
     * 재귀호출
     * @param n
     * @return
     */
    public static int factorial(int n){
        System.out.println(n);
        if (n==1)
            return 1;
        else
            return n * factorial(n-1);
    }


    public static int factorial2(int n){
        if(n <= 0)
            return 0;
        else
            return n + factorial2(n-1);
    }

    /**
     * 문자열의 길이를 체크
     * @param str
     * @return
     */
    public static int length(String str){
        if(str.equals(""))
            return 0;
        else
            return 1+length(str.substring(1));
    }


    /**
     * 문자열을 뒤집어 프린트
     */
    public static void printCharsReverse(String str){
        if(str.length() == 0)
            return;
        else {
            printCharsReverse(str.substring(1));
            System.out.print(str.charAt(0));
        }
    }

    /**
     * 2진수로 변환화여 출력
     */
    public static void printInBinary(int n){
        if(n<2)
            System.out.print(n);
        else {
            printInBinary(n/2);
            System.out.print(n%2);
        }

    }

    // Xn
    public static double power(double x, int n){
        if (n==0)
            return 1;
        else
            return x * power(x,n-1);
    }

    public static long fibonacci(int num){
        if (num < 2)
            return num;
        else
            return fibonacci(num-1) + fibonacci(num-2);
    }



}
