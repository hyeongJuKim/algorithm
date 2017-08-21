package main.javamaster.chapter5;

/**
 * Created by hj on 2017. 3. 20..
 */
public class Array {

    /**
     * 생성을 하면 default값이 대입되어있다.
     */
    public void defaultVar(){
        String[] name;
        name = new String[3];

        for (int i = 0; i < name.length; i++){
            System.out.println(name[i]);
        }
    }

    public static void main(String[] args) {

        int[] score = {100,90,80,70,60};
        for(int i = 0; i < score.length; i++){
            System.out.println(score[i]);
        }

        int[] numbers = {1,2,3,4,5};
        int sum = 0;
        for (int i = 0; i < numbers.length; i++){
            sum += numbers[i];
        }
        System.out.println(sum);

    }
}
