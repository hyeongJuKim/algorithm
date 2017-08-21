package main.javamaster.chapter6;

public class TvTest3 {
    public static void main(String[] args) {
        Tv t1 = new Tv();
        Tv t2 = new Tv();

        System.out.println("t1의 channel 값: " + t1.channel);
        System.out.println("t2의 channel 값: " + t2.channel);

        t2 = t1;    // t1이 저장하고 있는 값주소를 t2에 저장한다.
        t1.channel = 7; // channel 값을 7로 한다.
        System.out.println("t1의 challen값을 7로 변경했습니다.");

        System.out.println("t1의 channel 값: " + t1.channel);
        System.out.println("t2의 channel 값: " + t2.channel);

    }

}
