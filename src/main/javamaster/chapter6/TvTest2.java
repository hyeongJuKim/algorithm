package main.javamaster.chapter6;

/**
 * Created by hj on 2017. 3. 28..
 */

public class TvTest2 {
    public static void main(String[] args) {
        Tv t1 = new Tv();
        Tv t2 = new Tv();

        System.out.println("t1의 channel 값: " + t1.channel);
        System.out.println("t2의 channel 값: " + t2.channel);

        t1.channel = 7; // channel값을 7로 한다.
        System.out.println("t1의 channel 값을 7로 변경했습니다");

        System.out.println("t1의 channel 값: " + t1.channel);
        System.out.println("t2의 channel 값: " + t2.channel);

    }

}
