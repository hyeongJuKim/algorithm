package main.javamaster.chapter6;

/**
 * Created by hj on 2017. 3. 28..
 */
public class Tv {
    // Tv의 속성
    String color;   // 색상
    boolean power;  // 전원상태
    int channel;    // 채널

    // tv의 기능
    void power(){ power = ! power; }
    void channelUp() { ++channel; }
    void channelDown() { --channel; }

}